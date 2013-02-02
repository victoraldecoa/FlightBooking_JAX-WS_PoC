/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.flightservice.jaxws.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.xml.namespace.QName;

/**
 *
 * @author ALEX and Victor
 *
 * Based on IBM JAX-WS tutorial
 */
public class FlightBookingClient {

    final QName qName = new QName(
            "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "FlightBookingProcess");

    public static void main(String[] args) {
        if (args.length != 1) {
            args = new String[1];
            args[0] = "http://localhost:8080/FlightBookingProcessWeb/flightbookingprocess";
        }
        URL url = getWSDLURL(args[0]);
        FlightBookingClient client = new FlightBookingClient();
        client.processBooking(url);
    }

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public void processBooking(URL url) {
        FlightBookingProcess flightBookingProcessingService = new FlightBookingProcess(url, qName);
        FlightBookingProcessService port = flightBookingProcessingService.getFlightBookingProcessPort();

        Scanner input = new Scanner(System.in);
        String token = null;

        // Authenticating user
        while (token == null) {
            System.out.print("Username: ");
            String userName = input.next();

            System.out.print("Password: ");
            String password = input.next();

            token = port.authUser(userName, password);

            if (token != null) {
                System.out.println("User token is " + token);
            } else {
                System.out.println("Username or password are wrong. Try again.\n");
            }
        }
        
        Flight[] flights = new Flight[0];
        while (flights.length == 0) {
            System.out.print("Departure city: ");
            String depCity = input.next();

            System.out.print("Destination city: ");
            String destCity = input.next();
            
            flights = port.checkItinerary(depCity, destCity, token);
            
            if (flights.length > 0) {
                System.out.println("A possible itinerary is:");
                for (Flight flight : flights) {
                    System.out.println("    Dep: " + flight.departureCity + "    Dest: " + flight.destinationCity);
                }
            } else {
                System.out.println("No routes for these cities. Please try another.");
            }
        }

        float price = 0.0f;
        String date = null;
        
        while(price == 0.0f) {
            System.out.print("Select a date (aaaa-mm-dd): ");
            date = input.next();
            
            price = port.checkAvailable(flights, date, token);
            
            if (price == 0.0f) {
                System.out.println("No flights available in that date. Please try another.");
            } else {
                System.out.println("The price for this flight is " + price + " kr.");
            }
        }
        
        System.out.print("If you want to proceed with the booking, please insert the credit card. "
                         + "Otherwise just press enter: ");
        String creditCard = input.next();
        
        if (!creditCard.equals("")) {
            String bookingId;
            
            bookingId = port.bookTicket(flights, date, creditCard, token);
            
            System.out.println("Your booking id is " + bookingId + ".");
        }
        System.out.println("Thank you for using our services!");
    }
}

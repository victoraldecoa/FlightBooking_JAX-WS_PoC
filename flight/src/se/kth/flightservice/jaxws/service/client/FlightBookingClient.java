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

        /*
        System.out.println("Service is" + flightBookingProcessingService);

        
        
        FlightBookingBean flightBooking = populateOrder();
*/
        
        FlightBookingProcessService port = flightBookingProcessingService.getFlightBookingProcessPort();
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Username: ");
        String userName = input.next();
        
        System.out.print("Password: ");
        String password = input.next();
        
        String token = port.authUser(userName, password);

        if (token != null) {
            System.out.println("User token is " + token);
        } else {
            System.out.println("User not authorized. Username or password are wrong");
        }

    }
}

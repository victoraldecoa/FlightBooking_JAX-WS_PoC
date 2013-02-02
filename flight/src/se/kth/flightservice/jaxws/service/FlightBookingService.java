package se.kth.flightservice.jaxws.service;

import se.kth.flightservice.jaxws.service.bean.FlightBookingBean;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import se.kth.flightservice.jaxws.service.bean.Flight;

/**
 *
 * @author ALEX
 */
@WebService(serviceName = "FlightBookingProcess",
portName = "FlightBookingProcessPort",
targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
//JWS annotation that specifies the mapping of the service onto the
// SOAP message protocol.In particular, it specifies that the SOAP messages 
//are document-literal.
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class FlightBookingService {

    @WebMethod
    public FlightBookingBean processBooking(FlightBookingBean flightBookingBean) {
        return flightBookingBean;
        // Do processing...
        // Booking reservations made (Items ordered are)
        //Process Booking.
        //Set the Booking Id.

    }

    @WebMethod
    public String authUser(String userName, String password) {
        // TODO remove mockup database
        if (userName.equals("victoraldecoa") && password.equals("123456")) {
            // TODO generate a real unique key and add it on user's list
            return "jfdoKJgUOUG8SD89568gGDhjkgid";
        } else {
            return null;
        }
    }
    
    @WebMethod
    public void logout(String token) {
        // TODO forget token removing the user from the logged in users list
    }
    
    String[] possibleCities = { "Madrid", "Venice", "Lisbon", "Stockholm" };
    
    @WebMethod
    public Flight[] checkItinerary(String depCity, String destCity, String token) {
        // TODO check token in the list of connected users
        if (!token.equals("jfdoKJgUOUG8SD89568gGDhjkgid")) {
            return null;
        }
        
        Flight[] result = new Flight[2];
        
        // checking if these cities exist
        boolean depPossible = false;
        boolean destPossible = false;
        for (String city : possibleCities) {
            if (depCity.equals(city)) {
                depPossible = true;
            }
            if (destCity.equals(city)) {
                destPossible = true;
            }
        }
        
        if (!depPossible || !destPossible) {
            return null;
        }
        
        result[0] = new Flight();
        result[0].setDepartureCity(depCity);
        result[0].setDestinationCity("Berlin");
        result[1] = new Flight();
        result[1].setDepartureCity("Berlin");
        result[1].setDestinationCity(destCity);
        
        return result;
    }
}
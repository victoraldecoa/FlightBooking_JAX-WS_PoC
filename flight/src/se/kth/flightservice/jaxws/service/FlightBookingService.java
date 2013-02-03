package se.kth.flightservice.jaxws.service;

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
    private String generateKey(String userName, String password) {
        // TODO generate a real unique key and add it on user's list
        return "jfdoKJgUOUG8SD89568gGDhjkgid";
    }
    
    // TODO remove mockup database
    private String[] userNames = { "victor", "alex", "admin" };
    private String[] passwords = { "123456", "654321", "StrongPassword" };
    
    @WebMethod
    public String authUser(String userName, String password) {
        // TODO use real database
        for (int i = 0; i < userNames.length; i++) {
            if (userNames[i].equals(userName) && passwords[i].equals(password)) {
                return generateKey(userName, password);
            }
        }
        
        // no user found, or password doesn't match
        return null;
    }
    
    String[] possibleCities = { "Madrid", "Venice", "Lisbon", "Stockholm" };
    
    private boolean isTokenValid(String token) {
        // TODO check token in the list of connected users
        return token.equals("jfdoKJgUOUG8SD89568gGDhjkgid");
    }
    
    @WebMethod
    public Flight[] checkItinerary(String depCity, String destCity, String token) {
        if (!isTokenValid(token)) {
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
    
    @WebMethod
    public float checkAvailable(Flight[] itinerary, String date, String token) {
        if (!isTokenValid(token)) {
            return 0.0f;
        }
        
        if (!date.equals("2013-02-06")) {
            return 0.0f;
        }
        
        return 1500f;
    }
    
    @WebMethod
    public String bookTicket(Flight[] itinerary, String date, String creditCard, String token) {
        if (!isTokenValid(token)) {
            return "";
        }
        
        return "568432";
    }
}
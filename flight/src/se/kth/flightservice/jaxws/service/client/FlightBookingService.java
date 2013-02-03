
package se.kth.flightservice.jaxws.service.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlightBookingService", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightBookingService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authUser", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.AuthUser")
    @ResponseWrapper(localName = "authUserResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.AuthUserResponse")
    @Action(input = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/authUserRequest", output = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/authUserResponse")
    public String authUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.LogoutResponse")
    @Action(input = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/logoutRequest", output = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/logoutResponse")
    public void logout(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.BookTicket")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.BookTicketResponse")
    @Action(input = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/bookTicketRequest", output = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/bookTicketResponse")
    public String bookTicket(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Flight> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<se.kth.flightservice.jaxws.service.client.Flight>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkItinerary", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.CheckItinerary")
    @ResponseWrapper(localName = "checkItineraryResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.CheckItineraryResponse")
    @Action(input = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/checkItineraryRequest", output = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/checkItineraryResponse")
    public List<Flight> checkItinerary(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkAvailable", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.CheckAvailable")
    @ResponseWrapper(localName = "checkAvailableResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "se.kth.flightservice.jaxws.service.client.CheckAvailableResponse")
    @Action(input = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/checkAvailableRequest", output = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess/FlightBookingService/checkAvailableResponse")
    public float checkAvailable(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Flight> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}

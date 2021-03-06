/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.flightservice.jaxws.service.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author ALEX
 */
@WebService(name = "FlightBookingProcessService", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
public interface FlightBookingProcessService {
        /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns string containing token
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authUser", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    @ResponseWrapper(localName = "authUserResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    public String authUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);
    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkItinerary", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    @ResponseWrapper(localName = "checkItineraryResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", className = "com.ibm.jaxws.tutorial.service.client.CheckItineraryReturn")
    public Flight[] checkItinerary(String depCity, String destCity, String token);
    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkAvailable", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    @ResponseWrapper(localName = "checkAvailableResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    public float checkAvailable(Flight[] flights, String date, String token);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess")
    public String bookTicket(Flight[] flights, String date, String creditCard, String token);
}

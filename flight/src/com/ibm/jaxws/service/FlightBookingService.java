package com.ibm.jaxws.service;

import com.ibm.jaxws.service.bean.FlightBookingBean;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author ALEX
 */


@WebService(serviceName = "FlightBookingProcess",
		portName = "FlightBookingProcessPort",	
		targetNamespace = "http://jawxs.ibm/jaxws/flightbookingprocess")
	
//JWS annotation that specifies the mapping of the service onto the
// SOAP message protocol.In particular, it specifies that the SOAP messages 
//are document-literal.
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

public class FlightBookingService {
    
    @WebMethod
	public FlightBookingBean processBooking(FlightBookingBean flightBookingBean){
        return flightBookingBean;
        // Do processing...
        // Booking reservations made (Items ordered are)
        //Process Booking.
        //Set the Booking Id.
    
    }
}

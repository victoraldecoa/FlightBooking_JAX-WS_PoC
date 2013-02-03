/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.flightservice.jaxws.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 *
 * @author ALEX
 */
@WebServiceClient(name = "FlightBookingProcess", targetNamespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", wsdlLocation = "http://localhost:8080/FlightBookingProcessWeb/flightbookingprocess?wsdl")
public class FlightBookingProcess extends Service {

    private final static URL FLIGHTBOOKINGPROCESS_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/FlightBookingProcessWeb/flightbookingprocess?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        FLIGHTBOOKINGPROCESS_WSDL_LOCATION = url;
    }

    public FlightBookingProcess(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightBookingProcess() {
        super(FLIGHTBOOKINGPROCESS_WSDL_LOCATION, new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "FlightBookingProcess"));
    }

    /**
     *
     * @return returns FlightBookingProcessService
     */
    @WebEndpoint(name = "FlightBookingProcessPort")
    public FlightBookingProcessService getFlightBookingProcessPort() {
        return (FlightBookingProcessService) super.getPort(new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "FlightBookingProcessPort"), FlightBookingProcessService.class);
    }
}


package se.kth.flightservice.jaxws.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.kth.flightservice.jaxws.service.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthUserResponse_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "authUserResponse");
    private final static QName _CheckAvailable_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "checkAvailable");
    private final static QName _CheckItinerary_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "checkItinerary");
    private final static QName _LogoutResponse_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "logoutResponse");
    private final static QName _BookTicket_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "bookTicket");
    private final static QName _BookTicketResponse_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "bookTicketResponse");
    private final static QName _CheckAvailableResponse_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "checkAvailableResponse");
    private final static QName _AuthUser_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "authUser");
    private final static QName _CheckItineraryResponse_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "checkItineraryResponse");
    private final static QName _Logout_QNAME = new QName("http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", "logout");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.kth.flightservice.jaxws.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link CheckItineraryResponse }
     * 
     */
    public CheckItineraryResponse createCheckItineraryResponse() {
        return new CheckItineraryResponse();
    }

    /**
     * Create an instance of {@link CheckAvailableResponse }
     * 
     */
    public CheckAvailableResponse createCheckAvailableResponse() {
        return new CheckAvailableResponse();
    }

    /**
     * Create an instance of {@link AuthUser }
     * 
     */
    public AuthUser createAuthUser() {
        return new AuthUser();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link BookTicket }
     * 
     */
    public BookTicket createBookTicket() {
        return new BookTicket();
    }

    /**
     * Create an instance of {@link CheckItinerary }
     * 
     */
    public CheckItinerary createCheckItinerary() {
        return new CheckItinerary();
    }

    /**
     * Create an instance of {@link CheckAvailable }
     * 
     */
    public CheckAvailable createCheckAvailable() {
        return new CheckAvailable();
    }

    /**
     * Create an instance of {@link AuthUserResponse }
     * 
     */
    public AuthUserResponse createAuthUserResponse() {
        return new AuthUserResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "authUserResponse")
    public JAXBElement<AuthUserResponse> createAuthUserResponse(AuthUserResponse value) {
        return new JAXBElement<AuthUserResponse>(_AuthUserResponse_QNAME, AuthUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "checkAvailable")
    public JAXBElement<CheckAvailable> createCheckAvailable(CheckAvailable value) {
        return new JAXBElement<CheckAvailable>(_CheckAvailable_QNAME, CheckAvailable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckItinerary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "checkItinerary")
    public JAXBElement<CheckItinerary> createCheckItinerary(CheckItinerary value) {
        return new JAXBElement<CheckItinerary>(_CheckItinerary_QNAME, CheckItinerary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "bookTicket")
    public JAXBElement<BookTicket> createBookTicket(BookTicket value) {
        return new JAXBElement<BookTicket>(_BookTicket_QNAME, BookTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "bookTicketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "checkAvailableResponse")
    public JAXBElement<CheckAvailableResponse> createCheckAvailableResponse(CheckAvailableResponse value) {
        return new JAXBElement<CheckAvailableResponse>(_CheckAvailableResponse_QNAME, CheckAvailableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "authUser")
    public JAXBElement<AuthUser> createAuthUser(AuthUser value) {
        return new JAXBElement<AuthUser>(_AuthUser_QNAME, AuthUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckItineraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "checkItineraryResponse")
    public JAXBElement<CheckItineraryResponse> createCheckItineraryResponse(CheckItineraryResponse value) {
        return new JAXBElement<CheckItineraryResponse>(_CheckItineraryResponse_QNAME, CheckItineraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jawxs.flightservice.kth.se/jaxws/flightbookingprocess", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

}

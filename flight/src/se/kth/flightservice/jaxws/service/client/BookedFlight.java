package se.kth.flightservice.jaxws.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


//<ticket>
//<complexType name="bookedFlight">
//<complexContent>
//  <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
//  <sequence>
//	 <element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
//	 <element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
//	 <element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
//	 <element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
//	 <element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
//	 <element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
//	 <element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
//   </sequence>
// </restriction>
//</complexContent>
//</complexContent>
//</ticket>

/**
 *
 * @author ALEX
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="bookedFlight", propOrder = {
    "firstname",
    "lastname",
    "bookingId",
    "from",
    "from",
    "date",
    "price"

})
public class BookedFlight {
    
    protected String bookingId;
//    protected int qty; number of flights, is it needed??
//
//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String value) {
        this.bookingId = value;
    }
    
}

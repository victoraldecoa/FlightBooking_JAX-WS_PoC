package se.kth.flightservice.jaxws.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

//Java class for customer complex type.
//The following schema fragment specifies the expected content contained within this class.
//<user>
//<complexType name="customer">
//<complexContent>
//  <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
//	<sequence>
//	  <element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
//	  <element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
//	  <element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
//	  <element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
//	</sequence>
//  </restriction>
//</complexContent>
//</complexType>
//</user>
/**
 *
 * @author ALEX
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "customerId",
    "password",
    "firstName",
    "lastName"
})
public class Customer {

    protected String customerId;
    protected String password;
    protected String firstName;
    protected String lastName;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        this.customerId = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }
}

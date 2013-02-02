/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.flightservice.jaxws.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author victor
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkItinerary", propOrder = {
    "_return"
})
public class CheckItineraryResponse {
    protected Flight[] _return;
}

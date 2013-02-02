/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.flightservice.jaxws.service.publish;

import javax.xml.ws.Endpoint;
import se.kth.flightservice.jaxws.service.FlightBookingService;

/**
 *
 * @author Alexandra and Victor
 */
public class FlightBookingWebServicePublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/FlightBookingProcessWeb/flightbookingprocess",
                new FlightBookingService());

        System.out.println("The web service is published at http://localhost:8080/FlightBookingProcessWeb/flightbookingprocess");

        System.out.println("To stop running the web service , terminate the java process");


    }
}
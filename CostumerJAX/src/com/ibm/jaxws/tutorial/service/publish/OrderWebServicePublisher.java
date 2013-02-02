package com.ibm.jaxws.tutorial.service.publish;

import javax.xml.ws.Endpoint;

import com.ibm.jaxws.tutorial.service.OrderProcessService;

public class OrderWebServicePublisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8080/OrderProcessWeb/orderprocess",
				new OrderProcessService());
		
		System.out.println("The web service is published at http://localhost:8080/OrderProcessWeb/orderprocess");
		
		System.out.println("To stop running the web service , terminate the java process");
		

	}

}

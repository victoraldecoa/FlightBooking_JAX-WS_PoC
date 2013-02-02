/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.jaxws.service.bean;

/**
 *
 * @author ALEX
 */
public class FlightBookingBean {
    
    	private Customer customer;

	//private EmailAddress emailAddress;

	private BookedFlight[] bookedFlight;

	private String bookingId;

        public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

//	public EmailAddress getEmailAddress() {
//		return emailAddress;
//	}
//
//	public void setEmailAddress(EmailAddress emailAddress) {
//		this.emailAddress = emailAddress;
//	}

	public BookedFlight[] getBookedFlight() {
		return bookedFlight;
	}

	public void setBookedFlight(BookedFlight[] bookedFlight) {
		this.bookedFlight = bookedFlight;
	}

    
}

package com.ibm.jaxws.service.bean;

public class FlightBookingBean {
    
    	private Customer customer;

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


	public BookedFlight[] getBookedFlight() {
		return bookedFlight;
	}

	public void setBookedFlight(BookedFlight[] bookedFlight) {
		this.bookedFlight = bookedFlight;
	}

    
}

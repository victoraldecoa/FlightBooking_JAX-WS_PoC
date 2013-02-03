FlightBooking_JAX-WS_PoC
========================

System for booking flights in a fictional flight company, basically as a proof of concept for using JAX-WS and learning how to make a SOAP Web Service.

Architecture description:
-----------------------
For this web service it was implemented 4 operations (Web Methods), which were:

authUser: receives an username and a password and in case they exist and match on the database it returns an unique token, otherwise returns null. All the other operations require this token to be sent.

checkItinerary: receives a departure city and a destination city and returns a possible route (itinerary) to it.

checkAvailable: receives an itinerary and a date, checks if is there an available flight for that date and returns the price to it.

bookTicket: receives an itinerary and a date (previously confirmed as available) and a credit card number. In case the credit card is accepted it returns a booking id, otherwise it returns null.

Example console output:
-----------------------
	Username: gdfsg
	Password: sfdgds
	Username or password are wrong. Try again.

	Username: victor
	Password: 123456
	User token is jfdoKJgUOUG8SD89568gGDhjkgid
	Departure city: gdfl
	Destination city: jhfdsg
	No routes for these cities. Please try another.
	Departure city: Stockholm
	Destination city: Madrid
	A possible itinerary is:
		Dep: Stockholm    Dest: Berlin
		Dep: Berlin    Dest: Madrid
	Select a date (aaaa-mm-dd): 1900-12-12
	No flights available in that date. Please try another.
	Select a date (aaaa-mm-dd): 2013-02-06
	The price for this flight is 1500.0 kr.
	If you want to proceed with the booking, please insert the credit card. Otherwise write 0: 1234-5678-9012-3456
	Your booking id is 568432.
	Thank you for using our services!
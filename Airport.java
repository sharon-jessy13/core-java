class Airport{
	int airportID;
	String airportName;
	String location;
	String city;
	
	Terminal terminal;
	
	public void printAirportDetails(){
		System.out.println("fetching airport details..");
		
		System.out.println("airport id : "+ airportID);
		System.out.println("airport name : "+ airportName);
		System.out.println("airport loaction : "+ location);
		System.out.println("airport loacted city :" + city);
		
		
		terminal.printTerminalDetails();
	}
	
}
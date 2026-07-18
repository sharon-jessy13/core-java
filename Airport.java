class Airport {

    static boolean isCreated;

    static String name;
    static String location;
    static int pincode;
    static String type;
    static long phone;
    static int terminals;
    static int runways;
    static int flightsPerDay;

    public static boolean createAirportDetails(  String aName, String aLocation,  int aPincode, String aType,
            long aPhone,int aTerminals, int aRunways,int aFlightsPerDay) {
 
        isCreated = false;

        boolean isAirportNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isAirportTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isTerminalsValid = false;
        boolean isRunwaysValid = false;
        boolean isFlightsValid = false;

        if (aName != null) {
            name = aName;
            isAirportNameValid = true;
        } 
		else {
            System.out.println("Invalid Airport Name");
        }


        if (aLocation != null) {
            location = aLocation;
            isLocationValid = true;
        }
		else {
            System.out.println("Invalid Location");
        }
		
		
        if (aPincode > 0) {
            pincode = aPincode;
            isPincodeValid = true;
        } 
		else {
            System.out.println("Invalid Airport Code");
        }



        if (aType != null) {
            type = aType;
            isAirportTypeValid = true;
        } else {
            System.out.println("Invalid Airport Type");
        }


        if (aPhone > 0) {
            phone = aPhone;
            isContactNumberValid = true;
        } 
		else {
            System.out.println("Invalid Contact Number");
        }


        if (aTerminals > 0) {
            terminals = aTerminals;
            isTerminalsValid = true;
        } 
		else {
            System.out.println("Invalid Number of Terminals");
        }



        if (aRunways > 0) {
            runways = aRunways;
            isRunwaysValid = true;
        } 
		else {
            System.out.println("Invalid Number of Runways");
        }


        if (aFlightsPerDay > 0) {
            flightsPerDay = aFlightsPerDay;
            isFlightsValid = true;
        } 
		else {
            System.out.println("Invalid Flights Per Day");
        }


        if (isAirportNameValid == true && isLocationValid == true && isPincodeValid == true &&isAirportTypeValid == true &&
            isContactNumberValid == true && isTerminalsValid == true && isRunwaysValid == true &&isFlightsValid == true) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Airport Name : " + name);
        System.out.println("Location : " + location);
        System.out.println("Airport Code : " + pincode);
        System.out.println("Airport Type : " + type);
        System.out.println("Phone Number : " + phone);
        System.out.println("Terminals : " + terminals);
        System.out.println("Runways  : " + runways);
        System.out.println("Flights/Day : " + flightsPerDay);
		
		
    }
	
	
}
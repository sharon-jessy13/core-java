class PoliceStation {

    static boolean isCreated;

    static String name;
    static String location;
    static int pincode;
    static String zone;
    static String type;
    static long phone;
    static int officers;
    static int vehicles;

    public static boolean createPoliceStationDetails( String pName,String pLocation, int pPincode,  String pZone,
            String pType, long pPhone,int pOfficers,int pVehicles) {

        isCreated = false;

        boolean isPoliceStationNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isZoneValid = false;
        boolean isPoliceStationTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isOfficersValid = false;
        boolean isVehiclesValid = false;

        if (pName != null) {
            name = pName;
            isPoliceStationNameValid = true;
        } 
		else {
            System.out.println("Invalid Police Station Name");
        }
		
		

        if (pLocation != null) {
            location = pLocation;
            isLocationValid = true;
        } 
		else {
            System.out.println("Invalid Location");
        }



        if (pPincode > 0) {
            pincode = pPincode;
            isPincodeValid = true;
        } 
		else {
            System.out.println("Invalid Pincode");
        }

        if (pZone != null) {
            zone = pZone;
            isZoneValid = true;
        } 
		else {
            System.out.println("Invalid Zone");
        }
		
		

        if (pType != null) {
            type = pType;
            isPoliceStationTypeValid = true;
        } 
		else {
            System.out.println("Invalid Police Station Type");
        }


        if (pPhone > 0) {
            phone = pPhone;
            isContactNumberValid = true;
        }
		else {
            System.out.println("Invalid Contact Number");
        }



        if (pOfficers > 0) {
            officers = pOfficers;
            isOfficersValid = true;
        } 
		else {
            System.out.println("Invalid Officers Count");
        }
		
		

        if (pVehicles > 0) {
            vehicles = pVehicles;
            isVehiclesValid = true;
        } 
		else {
            System.out.println("Invalid Vehicles Count");
        }
		
		

        if (isPoliceStationNameValid == true && isLocationValid == true &&  isPincodeValid == true &&  isZoneValid == true &&
                isPoliceStationTypeValid == true && isContactNumberValid == true &&  isOfficersValid == true &&   isVehiclesValid == true) {

            isCreated = true;
        }

        return isCreated;
		
		
    }

    public static void getDetails() {

        System.out.println("Police Station Name : " + name);
        System.out.println("Location : " + location);
        System.out.println("Pincode: " + pincode);
        System.out.println("Zone : " + zone);
        System.out.println("Type: " + type);
        System.out.println("Phone Number: " + phone);
        System.out.println("Officers : " + officers);
        System.out.println("Vehicles  : " + vehicles);
    }
}
class RailwayStation {

    static boolean isCreated;

    static String stationName;
    static String location;
    static int pincode;
    static String stationType;
    static long contactNumber;
    static int passengers;
    static int platforms;
    static int staff;

    public static boolean createRailwayStationDetails(String rStationName, String rLocation,
            int rPincode, String rStationType, long rContactNumber,
            int rPassengers, int rPlatforms, int rStaff) {

        isCreated = false;

        boolean isStationNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isStationTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isPassengersValid = false;
        boolean isPlatformsValid = false;
        boolean isStaffValid = false;

        if (rStationName != null) {
            stationName = rStationName;
            isStationNameValid = true;
        } else {
            System.out.println("Invalid Station Name");
        }

        if (rLocation != null) {
            location = rLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (rPincode > 0) {
            pincode = rPincode;
            isPincodeValid = true;
        } else {
            System.out.println("Invalid Pincode");
        }

        if (rStationType != null) {
            stationType = rStationType;
            isStationTypeValid = true;
        } else {
            System.out.println("Invalid Station Type");
        }

        if (rContactNumber > 0) {
            contactNumber = rContactNumber;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (rPassengers > 0) {
            passengers = rPassengers;
            isPassengersValid = true;
        } else {
            System.out.println("Invalid Passenger Count");
        }

        if (rPlatforms > 0) {
            platforms = rPlatforms;
            isPlatformsValid = true;
        } else {
            System.out.println("Invalid Platform Count");
        }

        if (rStaff > 0) {
            staff = rStaff;
            isStaffValid = true;
        } else {
            System.out.println("Invalid Staff Count");
        }

        if (isStationNameValid == true && isLocationValid == true && isPincodeValid == true
                && isStationTypeValid == true && isContactNumberValid == true && isPassengersValid == true
                && isPlatformsValid == true && isStaffValid == true) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Station Name : " + stationName);
        System.out.println("Location : " + location);
        System.out.println("Pincode : " + pincode);
        System.out.println("Station Type : " + stationType);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Daily Passengers : " + passengers);
        System.out.println("Platforms : " + platforms);
        System.out.println("Staff : " + staff);

    }

}
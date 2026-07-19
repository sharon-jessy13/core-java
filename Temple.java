class Temple {

    static boolean isCreated;

    static String name;
    static String location;
    static int pincode;
    static String trust;
    static long phone;
    static int priests;
    static int halls;
    static int dailyVisitors;

    public static boolean createTempleDetails(String tName, String tLocation, int tPincode,
            String tTrust, long tPhone, int tPriests, int tHalls, int tDailyVisitors) {

        isCreated = false;

        boolean isTempleNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isTrustValid = false;
        boolean isPhoneValid = false;
        boolean isPriestsValid = false;
        boolean isHallsValid = false;
        boolean isVisitorsValid = false;

        if (tName != null) {
            name = tName;
            isTempleNameValid = true;
        } else {
            System.out.println("Invalid Temple Name");
        }

        if (tLocation != null) {
            location = tLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (tPincode > 0) {
            pincode = tPincode;
            isPincodeValid = true;
        } else {
            System.out.println("Invalid Pincode");
        }

        if (tTrust != null) {
            trust = tTrust;
            isTrustValid = true;
        } else {
            System.out.println("Invalid Trust Name");
        }

        if (tPhone > 0) {
            phone = tPhone;
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number");
        }

        if (tPriests > 0) {
            priests = tPriests;
            isPriestsValid = true;
        } else {
            System.out.println("Invalid Priests Count");
        }

        if (tHalls > 0) {
            halls = tHalls;
            isHallsValid = true;
        } else {
            System.out.println("Invalid Halls Count");
        }

        if (tDailyVisitors > 0) {
            dailyVisitors = tDailyVisitors;
            isVisitorsValid = true;
        } else {
            System.out.println("Invalid Daily Visitors Count");
        }

        if (isTempleNameValid && isLocationValid && isPincodeValid &&  isTrustValid && isPhoneValid && isPriestsValid && isHallsValid && isVisitorsValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Temple Name : " + name);
        System.out.println("Location : " + location);
        System.out.println("Pincode : " + pincode);
        System.out.println("Trust : " + trust);
        System.out.println("Phone Number : " + phone);
        System.out.println("No. of Priests : " + priests);
        System.out.println("No. of Halls : " + halls);
        System.out.println("Daily Visitors : " + dailyVisitors);
		
		
    }
	
	
}
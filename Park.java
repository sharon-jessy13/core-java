class Park {

    static boolean isCreated;

    static String parkName;
    static String location;
    static int parkId;
    static int rides;
    static String ownerName;
    static long contactNumber;
    static int staff;
    static int ticketPrice;

    public static boolean createParkDetails(String pParkName, String pLocation, int pParkId,
            int pRides, String pOwnerName, long pContactNumber, int pStaff, int pTicketPrice) {

        isCreated = false;

        boolean isParkNameValid = false;
        boolean isLocationValid = false;
        boolean isParkIdValid = false;
        boolean isRidesValid = false;
        boolean isOwnerNameValid = false;
        boolean isContactNumberValid = false;
        boolean isStaffValid = false;
        boolean isTicketPriceValid = false;

        if (pParkName != null) {
            parkName = pParkName;
            isParkNameValid = true;
        } else {
            System.out.println("Invalid Park Name");
        }

        if (pLocation != null) {
            location = pLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (pParkId > 0) {
            parkId = pParkId;
            isParkIdValid = true;
        } else {
            System.out.println("Invalid Park ID");
        }

        if (pRides > 0) {
            rides = pRides;
            isRidesValid = true;
        } else {
            System.out.println("Invalid Number of Rides");
        }

        if (pOwnerName != null) {
            ownerName = pOwnerName;
            isOwnerNameValid = true;
        } else {
            System.out.println("Invalid Owner Name");
        }

        if (pContactNumber > 0) {
            contactNumber = pContactNumber;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (pStaff > 0) {
            staff = pStaff;
            isStaffValid = true;
        } else {
            System.out.println("Invalid Staff Count");
        }

        if (pTicketPrice > 0) {
            ticketPrice = pTicketPrice;
            isTicketPriceValid = true;
        } else {
            System.out.println("Invalid Ticket Price");
        }

        if (isParkNameValid == true && isLocationValid == true && isParkIdValid == true && isRidesValid == true
                && isOwnerNameValid == true && isContactNumberValid == true && isStaffValid == true
                && isTicketPriceValid == true) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Park Name : " + parkName);
        System.out.println("Location : " + location);
        System.out.println("Park ID : " + parkId);
        System.out.println("Number of Rides : " + rides);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Staff Count : " + staff);
        System.out.println("Ticket Price : " + ticketPrice);
		
		
    }
	
	
}
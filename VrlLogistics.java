class VrlLogistics {

    static boolean isCreated;

    static String branchName;
    static String location;
    static int pincode;
    static String branchCode;
    static long phone;
    static boolean isBooking;
    static boolean isDelivery;
    static String email;

    public static boolean createVrlDetails(String vBranchName, String vLocation, int vPincode,
            String vBranchCode, long vPhone, boolean vIsBooking, boolean vIsDelivery, String vEmail) {
           

        isCreated = false;

        boolean isBranchNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isBranchCodeValid = false;
        boolean isPhoneValid = false;
        boolean isBookingValid = false;
        boolean isDeliveryValid = false;
        boolean isEmailValid = false;

        if (vBranchName != null) {
            branchName = vBranchName;
            isBranchNameValid = true;
        } else {
            System.out.println("Invalid Branch Name");
        }

        if (vLocation != null) {
            location = vLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (vPincode > 0) {
            pincode = vPincode;
            isPincodeValid = true;
        } else {
            System.out.println("Invalid Pincode");
        }

        if (vBranchCode != null) {
            branchCode = vBranchCode;
            isBranchCodeValid = true;
        } else {
            System.out.println("Invalid Branch Code");
        }

        if (vPhone > 0) {
            phone = vPhone;
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number");
        }


        // here isbooking will true or false so, no if condition
		
        isBooking = vIsBooking;
        isBookingValid = true;

        isDelivery = vIsDelivery;
        isDeliveryValid = true;

        if (vEmail != null) {
            email = vEmail;
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email");
        }


        if (isBranchNameValid == true && isLocationValid == true &&  isPincodeValid == true && isBranchCodeValid == true &&
            isPhoneValid == true &&  isBookingValid == true && isDeliveryValid == true && isEmailValid == true) {

            isCreated = true;
        }


        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Branch Name : " + branchName);
        System.out.println("Location : " + location);
        System.out.println("Pincode  : " + pincode);
        System.out.println("Branch Code : " + branchCode);
        System.out.println("Phone Number : " + phone);
        System.out.println("Booking  : " + isBooking);
        System.out.println("Delivery : " + isDelivery);
        System.out.println("Email : " + email);
		
    }
	
	
}
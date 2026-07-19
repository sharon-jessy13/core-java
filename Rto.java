class Rto {

    static boolean isCreated;

    static String name;
    static String code;
    static String address;
    static long phone;
    static String timings;
    static String district;
    static int pincode;
    static int officers;

    public static boolean createRtoDetails(String rName, String rCode,String rAddress, long rPhone,
            String rTimings,String rDistrict, int rPincode, int rOfficers) {
            

        isCreated = false;

        boolean isNameValid = false;
        boolean isCodeValid = false;
        boolean isAddressValid = false;
        boolean isPhoneValid = false;
        boolean isTimingsValid = false;
        boolean isDistrictValid = false;
        boolean isPincodeValid = false;
        boolean isOfficersValid = false;


        if (rName != null) {
            name = rName;
            isNameValid = true;
        } else {
            System.out.println("Invalid RTO Name");
        }

        if (rCode != null) {
            code = rCode;
            isCodeValid = true;
        } else {
            System.out.println("Invalid RTO Code");
        }

        if (rAddress != null) {
            address = rAddress;
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        if (rPhone > 0) {
            phone = rPhone;
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number");
        }

        if (rTimings != null) {
            timings = rTimings;
            isTimingsValid = true;
        } else {
            System.out.println("Invalid Timings");
        }

        if (rDistrict != null) {
            district = rDistrict;
            isDistrictValid = true;
        } else {
            System.out.println("Invalid District");
        }

        if (rPincode > 0) {
            pincode = rPincode;
            isPincodeValid = true;
        } else {
            System.out.println("Invalid Pincode");
        }

        if (rOfficers > 0) {
            officers = rOfficers;
            isOfficersValid = true;
        } else {
            System.out.println("Invalid Officers Count");
        }

        if (isNameValid == true && isCodeValid == true &&  isAddressValid == true && isPhoneValid == true &&
             isTimingsValid == true && isDistrictValid == true &&  isPincodeValid == true &&  isOfficersValid == true) {

            isCreated = true;
        }

        return isCreated;
		
		
    }

    public static void getDetails() {

        System.out.println("RTO Name  : " + name);
        System.out.println("RTO Code : " + code);
        System.out.println("Address : " + address);
        System.out.println("Phone Number : " + phone);
        System.out.println("Timings: " + timings);
        System.out.println("District : " + district);
        System.out.println("Pincode : " + pincode);
        System.out.println("Officers  : " + officers);
		
		
    }
	
	
}
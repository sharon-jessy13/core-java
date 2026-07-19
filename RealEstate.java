class RealEstate {

    static boolean isCreated;

    static String propertyName;
    static int pincode;
    static int propertyId;
    static String propertyType;
    static String builderName;
    static long contactNumber;
    static int staff;
    static int totalUnits;

    public static boolean createRealEstateDetails(String rPropertyName, int rPincode, int rPropertyId,
            String rPropertyType, String rBuilderName, long rContactNumber,
            int rStaff, int rTotalUnits) {

        isCreated = false;

        boolean isPropertyNameValid = false;
        boolean isPincodeValid = false;
        boolean isPropertyIdValid = false;
        boolean isPropertyTypeValid = false;
        boolean isBuilderNameValid = false;
        boolean isContactNumberValid = false;
        boolean isStaffValid = false;
        boolean isTotalUnitsValid = false;

        if (rPropertyName != null) {
            propertyName = rPropertyName;
            isPropertyNameValid = true;
        } else {
            System.out.println("Invalid Property Name");
        }

        if (rPincode > 0) {
            pincode = rPincode;
            isPincodeValid = true;
        } else {
            System.out.println("Invalid Pincode");
        }

        if (rPropertyId > 0) {
            propertyId = rPropertyId;
            isPropertyIdValid = true;
        } else {
            System.out.println("Invalid Property ID");
        }

        if (rPropertyType != null) {
            propertyType = rPropertyType;
            isPropertyTypeValid = true;
        } else {
            System.out.println("Invalid Property Type");
        }

        if (rBuilderName != null) {
            builderName = rBuilderName;
            isBuilderNameValid = true;
        } else {
            System.out.println("Invalid Builder Name");
        }

        if (rContactNumber > 0) {
            contactNumber = rContactNumber;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (rStaff > 0) {
            staff = rStaff;
            isStaffValid = true;
        } else {
            System.out.println("Invalid Staff Count");
        }

        if (rTotalUnits > 0) {
            totalUnits = rTotalUnits;
            isTotalUnitsValid = true;
        } else {
            System.out.println("Invalid Total Units");
        }

        if (isPropertyNameValid == true && isPincodeValid == true && isPropertyIdValid == true &&
                isPropertyTypeValid == true && isBuilderNameValid == true && isContactNumberValid == true &&
                isStaffValid == true && isTotalUnitsValid == true) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Property Name : " + propertyName);
        System.out.println("Pincode : " + pincode);
        System.out.println("Property ID : " + propertyId);
        System.out.println("Property Type : " + propertyType);
        System.out.println("Builder Name : " + builderName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Staff Count : " + staff);
        System.out.println("Total Units : " + totalUnits);

    }

}
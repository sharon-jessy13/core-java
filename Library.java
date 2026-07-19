class Library {

    static boolean isCreated;

    static String name;
    static String location;
    static int pincode;
    static String type;
    static long phone;
    static int books;
    static int floors;
    static int staff;

    public static boolean createLibraryDetails(String lName,String lLocation, int lPincode, String lType, long lPhone,
            int lBooks, int lFloors, int lStaff) {
    
        isCreated = false;

        boolean isLibraryNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isLibraryTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isBooksValid = false;
        boolean isFloorsValid = false;
        boolean isStaffValid = false;

        if (lName != null) {
            name = lName;
            isLibraryNameValid = true;
        }
        else {
            System.out.println("Invalid Library Name");
        }

        if (lLocation != null) {
            location = lLocation;
            isLocationValid = true;
        }
        else {
            System.out.println("Invalid Location");
        }

        if (lPincode > 0) {
            pincode = lPincode;
            isPincodeValid = true;
        }
        else {
            System.out.println("Invalid Pincode");
        }

        if (lType != null) {
            type = lType;
            isLibraryTypeValid = true;
        }
        else {
            System.out.println("Invalid Library Type");
        }

        if (lPhone > 0) {
            phone = lPhone;
            isContactNumberValid = true;
        }
        else {
            System.out.println("Invalid Contact Number");
        }

        if (lBooks > 0) {
            books = lBooks;
            isBooksValid = true;
        }
        else {
            System.out.println("Invalid Books Count");
        }

        if (lFloors > 0) {
            floors = lFloors;
            isFloorsValid = true;
        }
        else {
            System.out.println("Invalid Number of Floors");
        }

        if (lStaff > 0) {
            staff = lStaff;
            isStaffValid = true;
        }
        else {
            System.out.println("Invalid Staff Count");
        }

        if (isLibraryNameValid == true && isLocationValid == true &&  isPincodeValid == true && isLibraryTypeValid == true &&
            isContactNumberValid == true && isBooksValid == true &&  isFloorsValid == true &&  isStaffValid == true) {
   
            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Library Name : " + name);
        System.out.println("Location  : " + location);
        System.out.println("Pincode : " + pincode);
        System.out.println("Library Type : " + type);
        System.out.println("Phone Number : " + phone);
        System.out.println("Books : " + books);
        System.out.println("Floors : " + floors);
        System.out.println("Staff : " + staff);
    }
	
	
}
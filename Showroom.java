class Showroom {

    static boolean isCreated;

    static String showroomName;
    static String location;
    static int showroomId;
    static String category;
    static String ownerName;
    static long contactNumber;
    static int employees;
    static int totalBranches;

    public static boolean createShowroomDetails(String sShowroomName, String sLocation, int sShowroomId,
            String sCategory, String sOwnerName, long sContactNumber, int sEmployees, int sTotalBranches) {

        isCreated = false;

        boolean isShowroomNameValid = false;
        boolean isLocationValid = false;
        boolean isShowroomIdValid = false;
        boolean isCategoryValid = false;
        boolean isOwnerNameValid = false;
        boolean isContactNumberValid = false;
        boolean isEmployeesValid = false;
        boolean isTotalBranchesValid = false;

        if (sShowroomName != null) {
            showroomName = sShowroomName;
            isShowroomNameValid = true;
        } else {
            System.out.println("Invalid Showroom Name");
        }

        if (sLocation != null) {
            location = sLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (sShowroomId > 0) {
            showroomId = sShowroomId;
            isShowroomIdValid = true;
        } else {
            System.out.println("Invalid Showroom ID");
        }

        if (sCategory != null) {
            category = sCategory;
            isCategoryValid = true;
        } else {
            System.out.println("Invalid Category");
        }

        if (sOwnerName != null) {
            ownerName = sOwnerName;
            isOwnerNameValid = true;
        } else {
            System.out.println("Invalid Owner Name");
        }

        if (sContactNumber > 0) {
            contactNumber = sContactNumber;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (sEmployees > 0) {
            employees = sEmployees;
            isEmployeesValid = true;
        } else {
            System.out.println("Invalid Employees Count");
        }

        if (sTotalBranches > 0) {
            totalBranches = sTotalBranches;
            isTotalBranchesValid = true;
        } else {
            System.out.println("Invalid Total Branches");
        }

        if (isShowroomNameValid == true && isLocationValid == true && isShowroomIdValid == true
                && isCategoryValid == true && isOwnerNameValid == true && isContactNumberValid == true
                && isEmployeesValid == true && isTotalBranchesValid == true) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Location : " + location);
        System.out.println("Showroom ID : " + showroomId);
        System.out.println("Category : " + category);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Employees : " + employees);
        System.out.println("Total Branches : " + totalBranches);
		
		
    }
	
	
}
class Institute {

    static boolean isCreated;

    static String name;
    static String location;
    static int pincode;
    static String type;
    static long phone;
    static int students;
    static int departments;
    static int faculty;

    public static boolean createInstituteDetails(String iName, String iLocation, int iPincode,
            String iType, long iPhone, int iStudents, int iDepartments, int iFaculty) {

        isCreated = false;

        boolean isInstituteNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isInstituteTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isStudentsValid = false;
        boolean isDepartmentsValid = false;
        boolean isFacultyValid = false;

        if (iName != null) {
            name = iName;
            isInstituteNameValid = true;
        }
        else {
            System.out.println("Invalid Institute Name");
        }

        if (iLocation != null) {
            location = iLocation;
            isLocationValid = true;
        }
        else {
            System.out.println("Invalid Location");
        }

        if (iPincode > 0) {
            pincode = iPincode;
            isPincodeValid = true;
        }
        else {
            System.out.println("Invalid Pincode");
        }

        if (iType != null) {
            type = iType;
            isInstituteTypeValid = true;
        }
        else {
            System.out.println("Invalid Institute Type");
        }

        if (iPhone > 0) {
            phone = iPhone;
            isContactNumberValid = true;
        }
        else {
            System.out.println("Invalid Contact Number");
        }

        if (iStudents > 0) {
            students = iStudents;
            isStudentsValid = true;
        }
        else {
            System.out.println("Invalid Students Count");
        }

        if (iDepartments > 0) {
            departments = iDepartments;
            isDepartmentsValid = true;
        }
        else {
            System.out.println("Invalid Departments Count");
        }

        if (iFaculty > 0) {
            faculty = iFaculty;
            isFacultyValid = true;
        }
        else {
            System.out.println("Invalid Faculty Count");
        }

        if (isInstituteNameValid == true &&isLocationValid == true &&  isPincodeValid == true &&   isInstituteTypeValid == true &&
            isContactNumberValid == true &&  isStudentsValid == true && isDepartmentsValid == true &&  isFacultyValid == true) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Institute Name : " + name);
        System.out.println("Location  : " + location);
        System.out.println("Pincode : " + pincode);
        System.out.println("Institute Type : " + type);
        System.out.println("Phone Number : " + phone);
        System.out.println("number of Students  : " + students);
        System.out.println("Departments : " + departments);
        System.out.println("Faculty : " + faculty);
    }

}
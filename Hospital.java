class Hospital {

    static boolean isCreated;

    static String name;
    static String location;
    static int id;
    static int capacity;
    static String type;
    static long phone;
    static int staff;
    static int departments;

    public static boolean createHospitalDetails(String hName, String hLocation, int hId, int hCapacity, String hType,
            long hPhone, int hStaff, int hDept) {

        boolean isHospitalNameValid = false;
        boolean isLocationValid = false;
        boolean isCapacityValid = false;
        boolean isHospitalIdValid = false;
        boolean isHospitalTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isStaffValid = false;
        boolean isDepartmentsValid = false;

        if (hName != null) {
            name = hName;
            isHospitalNameValid = true;
        } else {
            System.out.println("Invalid Hospital name");
        }

        if (hLocation != null) {
            location = hLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        
        if (hId > 0) {
            id = hId;
            isHospitalIdValid = true;
        } else {
            System.out.println("Invalid Hospital ID");
        }

        if (hCapacity > 0) {
            capacity = hCapacity;
            isCapacityValid = true;
        } else {
            System.out.println("Invalid Capacity");
        }

      
        if (hType != null) {
            type = hType;
            isHospitalTypeValid = true;
        } else {
            System.out.println("Invalid Hospital Type");
        }

    
        if (hPhone > 0) {
            phone = hPhone;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

      
        if (hStaff > 0) {
            staff = hStaff;
            isStaffValid = true;
        } else {
            System.out.println("Invalid Staff Count");
        }

        if (hDept > 0) {
            departments = hDept;
            isDepartmentsValid = true;
        } else {
            System.out.println("Invalid Departments");
        }


        if (isHospitalNameValid == true && isLocationValid == true &&  isHospitalIdValid == true && isCapacityValid == true && isHospitalTypeValid == true && isContactNumberValid == true &&  isStaffValid == true && isDepartmentsValid == true) {
					
            isCreated = true;
		
        }
		

        return isCreated;
    }
	
	public static void getDetails() {

        System.out.println("Hospital Name : " + name);
        System.out.println("Location      : " + location);
        System.out.println("Hospital ID   : " + id);
        System.out.println("Capacity      : " + capacity);
        System.out.println("Hospital Type : " + type);
        System.out.println("Phone Number  : " + phone);
        System.out.println("Staff         : " + staff);
        System.out.println("Departments   : " + departments);
   }

}

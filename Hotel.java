class Hotel {
	
	
    static boolean isCreated;

    static String name;
    static String location;
    static int id;
	static String type;
    static long phone;
    static int rooms;
    static double rating;
    static int staff;
    

    public static boolean createHotelDetails(String hName, String hLocation, int hId, String hType,
            long hPhone,int hRooms, double hRating, int hStaff) {

        isCreated = false;

        boolean isHotelNameValid = false;
        boolean isLocationValid = false;
        boolean isHotelIdValid = false;
        boolean isHotelTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isRoomsValid = false;
        boolean isRatingValid = false;
        boolean isStaffValid = false;

        if (hName != null) {
            name = hName;
            isHotelNameValid = true;
        } else {
            System.out.println("Invalid Hotell name");
        }

        if (hLocation != null) {
            location = hLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        
        if (hId > 0) {
            id = hId;
            isHotelIdValid = true;
        } else {
            System.out.println("Invalid hotel ID");
        }

      
        if (hType != null) {
            type = hType;
            isHotelTypeValid = true;
        } else {
            System.out.println("Invalid hotel Type");
        }

    
        if (hPhone > 0) {
            phone = hPhone;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (hRooms > 0) {
            rooms = hRooms;
            isRoomsValid = true;
        } else {
            System.out.println("Invalid Rooms Count");
        }
		
		
        if (hRating >= 0.0) {
            rating = hRating;
            isRatingValid = true;
        } else {
            System.out.println("Invalid Rating");
        }
		
		
        if (hStaff > 0) {
            staff = hStaff;
            isStaffValid = true;
        } else {
            System.out.println("Invalid Staff Count");
        }

       


        if (isHotelNameValid == true && isLocationValid == true &&  isHotelIdValid == true && isHotelTypeValid == true && 
			  isContactNumberValid == true && isRoomsValid == true && isRatingValid == true && isStaffValid == true ) {
					
            isCreated = true;
		
        }
		

        return isCreated;
    }
	
	 public static void getDetails() {

        System.out.println("Hotel Name   : " + name);
        System.out.println("Location     : " + location);
        System.out.println("Hotel ID     : " + String.format("%03d", id));
        System.out.println("Hotel Type   : " + type);
        System.out.println("Phone Number : " + phone);
        System.out.println("Rooms        : " + rooms);
        System.out.println("Rating       : " + rating);
        System.out.println("Staff        : " + staff);
    }
}
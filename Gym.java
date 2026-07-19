class Gym {

    static boolean isCreated;

    static String name;
    static String location;
    static int pincode;
    static String type;
    static long phone;
    static int trainers;
    static int members;
    static double rating;

    public static boolean createGymDetails(String gName, String gLocation, int gPincode,
            String gType, long gPhone, int gTrainers, int gMembers, double gRating) {

        isCreated = false;

        boolean isGymNameValid = false;
        boolean isLocationValid = false;
        boolean isPincodeValid = false;
        boolean isGymTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isTrainersValid = false;
        boolean isMembersValid = false;
        boolean isRatingValid = false;

        if (gName != null) {
            name = gName;
            isGymNameValid = true;
        } else {
            System.out.println("Invalid Gym Name");
        }

        if (gLocation != null) {
            location = gLocation;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (gPincode > 0) {
            pincode = gPincode;
            isPincodeValid = true;
        } else {
            System.out.println("Invalid Pincode");
        }

        if (gType != null) {
            type = gType;
            isGymTypeValid = true;
        } else {
            System.out.println("Invalid Gym Type");
        }

        if (gPhone > 0) {
            phone = gPhone;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (gTrainers > 0) {
            trainers = gTrainers;
            isTrainersValid = true;
        } else {
            System.out.println("Invalid Trainers Count");
        }

        if (gMembers > 0) {
            members = gMembers;
            isMembersValid = true;
        } else {
            System.out.println("Invalid Members Count");
        }

        if (gRating >= 0.0 && gRating <= 5.0) {
            rating = gRating;
            isRatingValid = true;
        } else {
            System.out.println("Invalid Rating");
        }


        if (isGymNameValid == true &&  isLocationValid == true && isPincodeValid == true && isGymTypeValid == true &&
            isContactNumberValid == true &&  isTrainersValid == true &&  isMembersValid == true &&  isRatingValid == true) {

            isCreated = true;
        }
		

        return isCreated;
    }

    public static void getDetails() {

        System.out.println("Gym Name  : " + name);
        System.out.println("Location : " + location);
        System.out.println("Pincode : " + pincode);
        System.out.println("Gym Type : " + type);
        System.out.println("Phone Number : " + phone);
        System.out.println("Trainers : " + trainers);
        System.out.println("Members : " + members);
        System.out.println("Rating : " + rating);
		
		
    }
	
	
}
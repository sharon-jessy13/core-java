class AirportExecuter {

    public static void main(String flight[]) {

        boolean isDetailsCreated;

        // 1
        isDetailsCreated = Airport.createAirportDetails("Kempegowda International Airport", "Devanahalli", 560300,
                "International", 9876543210L, 2, 2, 650);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }



        // 2
        isDetailsCreated = Airport.createAirportDetails("Indira Gandhi International Airport", "Palam", 110037,
                "International", 9876543211L, 3, 4, 1400);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 3
        isDetailsCreated = Airport.createAirportDetails("Chhatrapati Shivaji Maharaj International Airport",
                "Santacruz", 400099, "International", 9876543212L, 2, 2, 1000);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 4
        isDetailsCreated = Airport.createAirportDetails("Chennai International Airport", "Meenambakkam", 600027,
                "International", 9876543213L, 4, 2, 700);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		

        // 5
        isDetailsCreated = Airport.createAirportDetails("Netaji Subhas Chandra Bose International Airport", "Dum Dum",
                700052, "International", 9876543214L, 2, 2, 500);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 6
        isDetailsCreated = Airport.createAirportDetails("Rajiv Gandhi International Airport", "Shamshabad", 500409,
                "International", 9876543215L, 2, 2, 750);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 7
        isDetailsCreated = Airport.createAirportDetails("Sardar Vallabhbhai Patel International Airport", "Hansol",
                380003, "International", 9876543216L, 2, 2, 400);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 8
        isDetailsCreated = Airport.createAirportDetails("Cochin International Airport", "Nedumbassery", 683111,
                "International", 9876543217L, 3, 2, 450);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		
		

        // 9
        isDetailsCreated = Airport.createAirportDetails("Pune Airport", null, 411032, "International", 9876543218L,
                2, 1, 300);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }



        // 10
        isDetailsCreated = Airport.createAirportDetails("Goa International Airport", "Dabolim", 403801, "International",
                9876543219L, 2, 1, 250);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }



        // 11
        isDetailsCreated = Airport.createAirportDetails("Manohar International Airport", "Mopa", 403512,
                "International", 9876543220L, 2, 1, 220);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 12
        isDetailsCreated = Airport.createAirportDetails("Lokpriya Gopinath Bordoloi International Airport", "Borjhar",
                781015, "International", 9876543221L, 2, 1, 260);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 13
        isDetailsCreated = Airport.createAirportDetails("Thiruvananthapuram International Airport", "Chacka", 695008,
                "International", 9876543222L, 2, 1, 240);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 14
        isDetailsCreated = Airport.createAirportDetails("Sri Guru Ram Dass Jee International Airport", "Rajasansi",
                143101, "International", 9876543223L, 2, 1, 230);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		
		

        // 15
        isDetailsCreated = Airport.createAirportDetails("Biju Patnaik International Airport", "Bhubaneswar", 751020,
                "International", 9876543224L, 2, 1, 260);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 16
        isDetailsCreated = Airport.createAirportDetails("Devi Ahilya Bai Holkar Airport", "Indore", 452005,
                "International", 9876543225L, 1, 1, 0);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 17
        isDetailsCreated = Airport.createAirportDetails("Jaipur International Airport", "Sanganer", 302029,
                "International", 9876543226L, 2, 1, 280);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 18
        isDetailsCreated = Airport.createAirportDetails("Tiruchirappalli International Airport", "Tiruchirappalli",
                620007, "International", 9876543227L, 1, 1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 19
        isDetailsCreated = Airport.createAirportDetails("Chaudhary Charan Singh International Airport", "Amausi",
                226009, "International", 9876543228L, 3, 2, 350);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 20
        isDetailsCreated = Airport.createAirportDetails("Lal Bahadur Shastri International Airport", "Babatpur", 221006,
                "International", 9876543229L, 1, 1, 170);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		
		

        // 21
        isDetailsCreated = Airport.createAirportDetails("Visakhapatnam International Airport", "Visakhapatnam", 530009,
                "International", 9876543230L, 2, 1, 220);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 22
        isDetailsCreated = Airport.createAirportDetails("Veer Savarkar International Airport", "Port Blair", 744103,
                null, 9876543231L, 1, 1, 120);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 23
        isDetailsCreated = Airport.createAirportDetails("Coimbatore International Airport", "Peelamedu", 641014,
                "International", 9876543232L, 2, 1, 220);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 24
        isDetailsCreated = Airport.createAirportDetails("Sheikh ul-Alam International Airport", "Humhama", 190007,
                "International", 9876543233L, 1, 1, 140);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 25
        isDetailsCreated = Airport.createAirportDetails("Calicut International Airport", "Karipur", 673647,
                "International", 9876543234L, 2, 1, 250);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 26
        isDetailsCreated = Airport.createAirportDetails("Kannur International Airport", "Mattanur", 670702,
                "International", 9876543235L, 2, 1, 220);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 27
        isDetailsCreated = Airport.createAirportDetails("Surat Airport", "Magdalla", 395007, "International",
                9876543236L, 1, 1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 28
        isDetailsCreated = Airport.createAirportDetails("Chandigarh International Airport", "Mohali", 160306,
                "International", 0L, 2, 1, 230);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 29
        isDetailsCreated = Airport.createAirportDetails("Mangaluru International Airport", "Bajpe", 574142,
                "International", 9876543238L, 2, 1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 30
        isDetailsCreated = Airport.createAirportDetails("Maharishi Valmiki International Airport", "Ayodhya Dham",
                224123, "International", 9876543239L, 2, 1, 220);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 31
        isDetailsCreated = Airport.createAirportDetails("Bagdogra International Airport", "Siliguri", 734421,
                "International", 9876543240L, 0, 1, 170);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 32
        isDetailsCreated = Airport.createAirportDetails("Gaya International Airport", "Gaya", 823004, "International",
                9876543241L, 1, 1, 140);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 33
        isDetailsCreated = Airport.createAirportDetails("Kushinagar International Airport", "Kushinagar", 274403,
                "International", 9876543242L, 1, 1, 130);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 34
        isDetailsCreated = Airport.createAirportDetails("Imphal International Airport", "Imphal", 795140,
                "International", 9876543243L, 1, 0, 160);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		

        // 35
        isDetailsCreated = Airport.createAirportDetails("Dr. Babasaheb Ambedkar International Airport", "Sonegaon",
                440005, "International", 9876543244L, 2, 1, 220);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 36
        isDetailsCreated = Airport.createAirportDetails("Raja Bhoj International Airport", "Bairagarh", 462030,
                "International", 9876543245L, 2, 1, 200);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		

        // 37
        isDetailsCreated = Airport.createAirportDetails("Vadodara Airport", "Harni", 390022, "Domestic", 9876543246L, 1,
                1, 150);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 38
        isDetailsCreated = Airport.createAirportDetails("Raipur Airport", "Mana", 492015, "Domestic", 9876543247L, 1, 1,
                170);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 39
        isDetailsCreated = Airport.createAirportDetails("Patna Airport", "Patna", 0, "Domestic", 9876543248L, 1, 1,
                200);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 40
        isDetailsCreated = Airport.createAirportDetails("Ranchi Airport", "Hinoo", 834002, "Domestic", 9876543249L, 1,
                1, 170);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		

        // 41
        isDetailsCreated = Airport.createAirportDetails("Jammu Airport", "Satwari", 180003, "Domestic", 9876543250L, 1,
                1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		

        // 42
        isDetailsCreated = Airport.createAirportDetails("Jodhpur Airport", "Jodhpur", 342011, "Domestic", 9876543251L,
                1, 1, 150);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 43
        isDetailsCreated = Airport.createAirportDetails("Udaipur Airport", "Dabok", 313022, "Domestic", 9876543252L, 1,
                1, 140);

        if (isDetailsCreated == true) {
          
		  Airport.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 44
        isDetailsCreated = Airport.createAirportDetails(null, "Hirasar", 360005, "Domestic",
                9876543253L, 2, 1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 45
        isDetailsCreated = Airport.createAirportDetails("Vijayawada International Airport", "Gannavaram", 521102,
                "International", 9876543254L, 1, 1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }



        // 46
        isDetailsCreated = Airport.createAirportDetails("Tirupati Airport", "Renigunta", 517520, "Domestic",
                9876543255L, 1, 1, 170);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 47
        isDetailsCreated = Airport.createAirportDetails("Agartala Airport", "Singerbhil", 799009, "Domestic",
                9876543256L, 1, 1, 160);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 48
        isDetailsCreated = Airport.createAirportDetails("Dehradun Airport", "Jolly Grant", 248140, "Domestic",
                9876543257L, 1, 1, 180);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }


        // 49
        isDetailsCreated = Airport.createAirportDetails("Hubballi Airport", "Gokul Road", 580030, "Domestic",
                9876543258L, 1, 1, 140);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        }
		else {
            System.out.println("Details are not created");
        }


        // 50
        isDetailsCreated = Airport.createAirportDetails("Belgaum Airport", null, 591124, "Domestic", 9876543259L, 1,
                1, 130);

        if (isDetailsCreated == true) {
            Airport.getDetails();
        } 
		else {
            System.out.println("Details are not created");
        }
		
		
    }
	
	
}
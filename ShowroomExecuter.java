class ShowroomExecuter {

	public static void main(String sr[]) {

		boolean isDetailsCreated;

		// 1
		isDetailsCreated = Showroom.createShowroomDetails("Adishakti Cars Pvt Ltd", "Banaswadi", 101, "Automobile",
				"Tata Motors", 9876543201L, 85, 12);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 2
		isDetailsCreated = Showroom.createShowroomDetails("Cauvery Motors", "Bidarahalli", 102, "Automobile",
				"Tata Motors", 9876543202L, 90, 10);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 3
		isDetailsCreated = Showroom.createShowroomDetails("Kropex Auto Pvt Ltd", "Mahadevpura", 103, "Automobile",
				"Tata Motors", 9876543203L, 70, 8);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 4
		isDetailsCreated = Showroom.createShowroomDetails("Cauvery Motors", "Aramane Nagar", 104, "Automobile",
				"Tata Motors", 9876543204L, 88, 10);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 5
		isDetailsCreated = Showroom.createShowroomDetails(null, "Rajajinagar", 105, "Automobile",
				"Tata Motors", 9876543205L, 100, 15);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 6
		isDetailsCreated = Showroom.createShowroomDetails("Key Motors", "Kanakapura Main Road", 106, "Automobile",
				"Tata Motors", 9876543206L, 95, 11);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 7
		isDetailsCreated = Showroom.createShowroomDetails("Prerana Motors", "Lalbagh Road", 107, "Automobile",
				"Tata Motors", 9876543207L, 82, 15);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 8
		isDetailsCreated = Showroom.createShowroomDetails("Adishakti Cars", "Hebbal", 108, "Automobile", "Tata Motors",
				9876543208L, 78, 12);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 9
		isDetailsCreated = Showroom.createShowroomDetails("Key Motor Ventures", "Magadi Road", 109, "Automobile",
				"Tata Motors", 9876543209L, 85, 11);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 10
		isDetailsCreated = Showroom.createShowroomDetails("Kalyani Motors", "Bannerghatta Road", 110, "Automobile",
				"Maruti Suzuki Nexa", 9876543210L, 90, 18);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 11
		isDetailsCreated = Showroom.createShowroomDetails("Mandovi Motors", "Jayanagar", 111, "Automobile",
				"Maruti Suzuki Arena", 0L, 75, 14);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 12
		isDetailsCreated = Showroom.createShowroomDetails("Bimal Auto Agency", "Yelahanka", 112, "Automobile",
				"Maruti Suzuki Arena", 9876543212L, 80, 13);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 13
		isDetailsCreated = Showroom.createShowroomDetails("Varun Motors", "Mangaluru", 113, "Automobile",
				"Maruti Suzuki Arena", 9876543213L, 92, 20);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 14
		isDetailsCreated = Showroom.createShowroomDetails("Kalyani Motors", "Mysuru", 114, "Automobile",
				"Maruti Suzuki Arena", 9876543214L, 85, 18);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 15
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq KR Puram", "KR Puram", 115, "Jewellery",
				"Titan Company", 9876543215L, 45, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 16
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Whitefield", "Whitefield", 116, "Jewellery",
				"Titan Company", 9876543216L, 50, 0);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 17 
		isDetailsCreated = Showroom.createShowroomDetails(null, "Jayanagar", 117, "Jewellery", "Titan Company",
				9876543217L, 48, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 18
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Jayanagar", "Jayanagar", 118, "Jewellery",
				"Titan Company", 9876543218L, 46, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 19
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Malleswaram", "Malleshwaram", 119, "Jewellery",
				"Titan Company", 9876543219L, 44, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 20
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Kammanahalli", "Kammanahalli", 120, "Jewellery",
				"Titan Company", 9876543220L, 42, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 21
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Koramangala", "Koramangala", 121, "Jewellery",
				"Titan Company", 9876543221L, 48, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 22
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Electronic City", "Electronic City", 122,
				"Jewellery", "Titan Company", 9876543222L, 45, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 23
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Banashankari", "Banashankari", 123, "Jewellery",
				"Titan Company", 9876543223L, 47, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 24
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq RR Nagar", "Rajarajeshwari Nagar", 124, "Jewellery",
				"Titan Company", 9876543224L, 0, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 25
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Mangaluru", "Mangaluru", 125, "Jewellery",
				"Titan Company", 9876543225L, 43, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 26
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq Hubballi", "Hubballi", 126, "Jewellery",
				"Titan Company", 9876543226L, 41, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 27
		isDetailsCreated = Showroom.createShowroomDetails("Malabar Gold MG Road", null , 127, "Jewellery",
				"Malabar Gold & Diamonds", 9876543227L, 55, 350);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 28
		isDetailsCreated = Showroom.createShowroomDetails("Malabar Gold Dickenson Road", "Dickenson Road", 128,
				"Jewellery", "Malabar Gold & Diamonds", 9876543228L, 52, 350);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 29
		isDetailsCreated = Showroom.createShowroomDetails("Malabar Gold Kalaburagi", "Kalaburagi", 129, "Jewellery",
				"Malabar Gold & Diamonds", 9876543229L, 50, 350);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 30 
		isDetailsCreated = Showroom.createShowroomDetails("Malabar Gold Shivamogga", "Shivamogga", 130, null,
				"Malabar Gold & Diamonds", 9876543230L, 48, 350);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 31
		isDetailsCreated = Showroom.createShowroomDetails("Malabar Gold Davanagere", "Davanagere", 131, "Jewellery",
				"Malabar Gold & Diamonds", 9876543231L, 46, 350);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 32
		isDetailsCreated = Showroom.createShowroomDetails("Croma", "Indiranagar", 132, "Electronics", "Croma",
				9876543232L, 65, 200);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 33
		isDetailsCreated = Showroom.createShowroomDetails("Croma", "Koramangala", 133, "Electronics", "Croma",
				9876543233L, 60, 200);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 34
		isDetailsCreated = Showroom.createShowroomDetails("Reliance Digital", "MG Road", 134, "Electronics",
				"Reliance Retail", 9876543234L, 75, 450);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 35
		isDetailsCreated = Showroom.createShowroomDetails("Reliance Digital", "Mysuru", 135, "Electronics",
				"Reliance Retail", 9876543235L, 70, 450);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 36
		isDetailsCreated = Showroom.createShowroomDetails("Croma", "Hubballi", 136, "Electronics", "Croma", 9876543236L,
				62, 200);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 37
		isDetailsCreated = Showroom.createShowroomDetails("Lifestyle Stores", "Koramangala", 137, "Lifestyle",
				"Lifestyle International", 9876543237L, 85, 95);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 38
		isDetailsCreated = Showroom.createShowroomDetails(null , "Koramangala", 138, "Lifestyle",
				"Shoppers Stop Ltd", 9876543238L, 90, 105);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 39
		isDetailsCreated = Showroom.createShowroomDetails("Decathlon", "Sarjapur", 139, "Sports", "Decathlon India",
				9876543239L, 120, 130);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 40
		isDetailsCreated = Showroom.createShowroomDetails("Decathlon", "Whitefield", 140, "Sports", "Decathlon India",
				9876543240L, 118, 130);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 41
		isDetailsCreated = Showroom.createShowroomDetails("Titan World", "Commercial Street", 141, "Watches",
				"Titan Company", 9876543241L, 42, 600);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 42
		isDetailsCreated = Showroom.createShowroomDetails("Lenskart", "Jayanagar", 142, "Eyewear", "Lenskart",
				9876543242L, 35, 1500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 43
		isDetailsCreated = Showroom.createShowroomDetails("Titan World", "Udupi", 143, "Watches", "Titan Company",
				9876543243L, 40, 600);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 44
		isDetailsCreated = Showroom.createShowroomDetails("Reliance Digital", "Whitefield", 144, "Electronics",
				"Reliance Retail", 9876543244L, 72, 450);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 45 (Invalid Contact Number)
		isDetailsCreated = Showroom.createShowroomDetails("Croma", "Jayanagar", 145, "Electronics", "Croma", 0L, 55,
				200);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 46
		isDetailsCreated = Showroom.createShowroomDetails("Tanishq", "Hebbal", 146, "Jewellery", "Titan Company",
				9876543246L, 48, 500);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 47
		isDetailsCreated = Showroom.createShowroomDetails("Malabar Gold", "Mysuru", 0, "Jewellery",
				"Malabar Gold & Diamonds", 9876543247L, 52, 350);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 48
		isDetailsCreated = Showroom.createShowroomDetails("Maruti Suzuki Arena", "Yelahanka", 148, "Automobile",
				"Maruti Suzuki", 9876543248L, 95, 300);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 49
		isDetailsCreated = Showroom.createShowroomDetails("Tata Motors", "Mahadevpura", 149, "Automobile",
				"Tata Motors", 9876543249L, 88, 250);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 50 
		isDetailsCreated = Showroom.createShowroomDetails("Lifestyle Stores", "Whitefield", 150, "Lifestyle",
				"Lifestyle International", 9876543250L, 80, 0);

		if (isDetailsCreated == true) {
			Showroom.getDetails();
		} else {
			System.out.println("Details are not created");
		}


	}


}
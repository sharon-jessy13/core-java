class RealEstateExecuter {

	public static void main(String realestates[]) {

		boolean isDetailsCreated;

		// 1
		isDetailsCreated = RealEstate.createRealEstateDetails("Indiranagar", 560038, 101, "3 BHK Luxury Apartment",
				"Prestige Group", 9876543201L, 120, 250);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 2
		isDetailsCreated = RealEstate.createRealEstateDetails("Whitefield", 560066, 102, "4 BHK Gated Community Villa",
				"Brigade Group", 9876543202L, 150, 180);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 3
		isDetailsCreated = RealEstate.createRealEstateDetails("Koramangala", 560034, 103, "Commercial Office Space",
				"Embassy Group", 9876543203L, 95, 75);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 4
		isDetailsCreated = RealEstate.createRealEstateDetails("Jayanagar", 560041, 104,
				"4 BHK Independent Residential House", "Sobha Developers", 9876543204L, 110, 130);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 5
		isDetailsCreated = RealEstate.createRealEstateDetails("Electronic City Phase 1", 560100, 105,
				"2 BHK High-Rise Apartment", null , 9876543205L, 100, 220);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 6
		isDetailsCreated = RealEstate.createRealEstateDetails("HSR Layout", 560102, 106, "Coworking Office Space",
				"WeWork India", 9876543206L, 85, 45);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 7
		isDetailsCreated = RealEstate.createRealEstateDetails("Yelahanka", 560064, 107, "Premium Residential Plot",
				"Century Real Estate", 9876543207L, 75, 300);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 8
		isDetailsCreated = RealEstate.createRealEstateDetails("Bannerghatta Road", 560076, 108, "3 BHK Penthouse",
				"Puravankara", 9876543208L, 90, 95);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 9
		isDetailsCreated = RealEstate.createRealEstateDetails("Marathahalli", 560037, 109,
				"2 BHK Builder Floor Apartment", "Salarpuria Sattva", 9876543209L, 82, 165);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 10
		isDetailsCreated = RealEstate.createRealEstateDetails("Hebbal", 560024, 110, "3 BHK Lake-View Apartment",
				"Brigade Group", 9876543210L, 115, 140);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 11
		isDetailsCreated = RealEstate.createRealEstateDetails("Malleshwaram", 560003, 111,
				"Heritage Independent Bungalow", "Prestige Group", 9876543211L, 60, 40);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 12
		isDetailsCreated = RealEstate.createRealEstateDetails("Rajajinagar", 560010, 112, "Showroom / Retail Space",
				"Phoenix Mills", 9876543212L, 88, 55);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 13
		isDetailsCreated = RealEstate.createRealEstateDetails("Bellandur", 560103, 113, "1 BHK Studio Apartment",
				"Prestige Group", 9876543213L, 70, 0);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 14
		isDetailsCreated = RealEstate.createRealEstateDetails("Sarjapur Road", 562125, 114, "Row House Villa",
				"Assetz Property", 9876543214L, 95, 120);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 15
		isDetailsCreated = RealEstate.createRealEstateDetails("Banashankari", 560050, 115, "3 BHK Residential Flat",
				"Sobha Developers", 9876543215L, 85, 145);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 16
		isDetailsCreated = RealEstate.createRealEstateDetails("Uttarahalli", 560061, 116, "3 BHK Mid-Rise Apartment",
				"Brigade Group", 9876543216L, 78, 155);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 17 (Invalid Property Name)
		isDetailsCreated = RealEstate.createRealEstateDetails(null, 560049, 117, "3 BHK Affordable Apartment",
				"Provident Housing", 9876543217L, 80, 180);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 18
		isDetailsCreated = RealEstate.createRealEstateDetails("Thavarekere", 562138, 118,
				"5 BHK Luxury Independent House", "Prestige Group", 9876543218L, 125, 60);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 19
		isDetailsCreated = RealEstate.createRealEstateDetails("Commercial Street", 560001, 119,
				"High-Street Retail Shop", "Phoenix Mills", 9876543219L, 90, 40);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 20
		isDetailsCreated = RealEstate.createRealEstateDetails("Church Street", 560001, 120,
				"Grade-A Corporate Office Space", "Embassy Group", 9876543220L, 110, 30);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 21
		isDetailsCreated = RealEstate.createRealEstateDetails("Veerannapalya", 560045, 121,
				"3 BHK Ready-to-Move Apartment", "Brigade Group", 9876543221L, 95, 120);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 22
		isDetailsCreated = RealEstate.createRealEstateDetails("Devanahalli", 562110, 122,
				"Gated Community Plotted Development", "Century Real Estate", 9876543222L, 80, 300);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 23
		isDetailsCreated = RealEstate.createRealEstateDetails("St Marks Road", 560001, 123,
				"Duplex Penthouse Apartment", "Puravankara", 9876543223L, 70, 50);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 24
		isDetailsCreated = RealEstate.createRealEstateDetails("Yarandahalli", 560099, 124,
				null , "Godrej Properties", 9876543224L, 85, 140);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 25
		isDetailsCreated = RealEstate.createRealEstateDetails("Basaveshwara Nagar", 560079, 125,
				"3 BHK Independent Floor", "Sobha Developers", 9876543225L, 90, 100);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 26
		isDetailsCreated = RealEstate.createRealEstateDetails("Gokulam", 570002, 126, "3 BHK Independent House",
				"Brigade Group", 9876543226L, 65, 75);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 27
		isDetailsCreated = RealEstate.createRealEstateDetails("Vijayanagar", 570017, 127, "4 BHK Luxury Villa",
				"Prestige Group", 9876543227L, 105, 60);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 28
		isDetailsCreated = RealEstate.createRealEstateDetails("J.P. Nagar", 570008, 128, "2 BHK Residential Apartment",
				"Salarpuria Sattva", 9876543228L, 75, 120);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 29
		isDetailsCreated = RealEstate.createRealEstateDetails("Kuvempunagar", 570023, 129, "3 BHK Builder Floor",
				"Assetz Property", 9876543229L, 82, 95);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 30 
		isDetailsCreated = RealEstate.createRealEstateDetails("Hebbal Industrial Area", 570016, 130, null,
				"Embassy Group", 9876543230L, 120, 25);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 31
		isDetailsCreated = RealEstate.createRealEstateDetails("Devaraja Mohalla", 570001, 131, "Commercial Retail Shop",
				"Phoenix Mills", 9876543231L, 70, 45);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 32
		isDetailsCreated = RealEstate.createRealEstateDetails("Bejai", 575004, 132, "3 BHK Sea-View Apartment",
				"Prestige Group", 9876543232L, 85, 80);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 33
		isDetailsCreated = RealEstate.createRealEstateDetails("Kadri", 575002, 133, "4 BHK Independent Bungalow",
				"Sobha Developers", 9876543233L, 90, 50);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 34
		isDetailsCreated = RealEstate.createRealEstateDetails("Urwa", 575006, 134, "2 BHK Residential Apartment",
				"Brigade Group", 9876543234L, 75, 110);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 35
		isDetailsCreated = RealEstate.createRealEstateDetails("Surathkal", 575014, 135, "Beach-Side Residential Plot",
				"Century Real Estate", 9876543235L, 70, 180);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 36
		isDetailsCreated = RealEstate.createRealEstateDetails("Hampankatta", 575001, 0, "Commercial Showroom Space",
				"Phoenix Mills", 9876543236L, 90, 45);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 37
		isDetailsCreated = RealEstate.createRealEstateDetails("Manipal", 576104, 137, "1 BHK Student Studio Apartment",
				"Manipal Developers", 9876543237L, 55, 150);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 38
		isDetailsCreated = RealEstate.createRealEstateDetails("Malpe", 576108, 138, "Commercial Cold-Storage Plot",
				"Malpe Realty", 9876543238L, 65, 40);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 39
		isDetailsCreated = RealEstate.createRealEstateDetails("Kunjibettu", 576102, 139, "3 BHK Residential Apartment",
				"Brigade Group", 9876543239L, 80, 100);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 40
		isDetailsCreated = RealEstate.createRealEstateDetails("Vidya Nagar", 580021, 140, "2 BHK Residential Flat",
				"Prestige Group", 9876543240L, 75, 110);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 41
		isDetailsCreated = RealEstate.createRealEstateDetails("Keshwapur", 580023, 141, "Commercial Office Space",
				"Embassy Group", 9876543241L, 85, 55);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 42
		isDetailsCreated = RealEstate.createRealEstateDetails("Navnagar", 580025, 142, "Standard Residential Plot",
				"Century Real Estate", 9876543242L, 70, 250);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 43
		isDetailsCreated = RealEstate.createRealEstateDetails("Sattur", 580009, 143, "3 BHK Independent Villa",
				"Sobha Developers", 9876543243L, 90, 75);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 44
		isDetailsCreated = RealEstate.createRealEstateDetails("Shahu Nagar", 590010, 144,
				"3 BHK Independent Residential House", "Godrej Properties", 9876543244L, 88, 90);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 45 
		isDetailsCreated = RealEstate.createRealEstateDetails("Tilakwadi", 590006, 145, "2 BHK Residential Apartment",
				"Prestige Group", 0L, 75, 130);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 46
		isDetailsCreated = RealEstate.createRealEstateDetails("Angol", 590006, 146, "Suburban Residential Plot",
				"Brigade Group", 9876543246L, 68, 220);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 47
		isDetailsCreated = RealEstate.createRealEstateDetails("Chalukya Nagar", 577201, 147, "3 BHK Independent House",
				"Sobha Developers", 9876543247L, 82, 85);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 48
		isDetailsCreated = RealEstate.createRealEstateDetails("Vinoba Nagar", 577204, 148, "4 BHK Premium Penthouse",
				"Puravankara", 9876543248L, 95, 65);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 49
		isDetailsCreated = RealEstate.createRealEstateDetails("Siddaganga Extension", 572102, 149,
				"Residential Plot Development", "Century Real Estate", 9876543249L, 72, 300);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 50 
		isDetailsCreated = RealEstate.createRealEstateDetails("Kyathsandra", 572104, 150, "3 BHK Suburban Apartment",
				"Assetz Property", 9876543250L, 80, 0);
		if (isDetailsCreated == true) {
			RealEstate.getDetails();
		} else {
			System.out.println("Details are not created");
		}
	}
}
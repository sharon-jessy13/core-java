class RailwayStationExecuter {

	public static void main(String rstation[]) {

		boolean isDetailsCreated;

		// 1
		isDetailsCreated = RailwayStation.createRailwayStationDetails("KSR Bengaluru City Junction (SBC)",
				"Bengaluru Urban", 560023, "Junction / Central", 9876543201L, 1200, 10, 350);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 2
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Yesvantpur Junction (YPR)", "Bengaluru Urban",
				560022, "Junction", 9876543202L, 850, 6, 250);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 3
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Sir M. Visvesvaraya Terminal (SMVT)",
				"Bengaluru Urban", 560038, "Terminal", 9876543203L, 900, 7, 280);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 4
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Mysuru Junction (MYS)", "Mysuru", 570001,
				"Junction", 9876543204L, 950, 8, 300);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 5
		isDetailsCreated = RailwayStation.createRailwayStationDetails("SSS Hubballi Junction (UBL)", "Dharwad", 580020,
				"Junction", 9876543205L, 850, 7, 260);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 6
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Mangaluru Central (MAQ)", "Dakshina Kannada",
				575001, "Central", 9876543206L, 700, 5, 200);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 7
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Mangaluru Junction (MAJN)", "Dakshina Kannada",
				575007, "Junction", 9876543207L, 650, 5, 180);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 8
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Belagavi (BGM)", "Belagavi", 590001, "Standard",
				9876543208L, 500, 4, 150);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 9
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Kalaburagi Junction (KLBG)", "Kalaburagi",
				585102, "Junction", 9876543209L, 600, 5, 180);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 10
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Ballari Junction (BAY)", "Ballari", 583101,
				"Junction", 9876543210L, 580, 5, 170);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 11
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Hosapete Junction (HPT)", "Vijayanagara", 583201,
				"Junction", 9876543211L, 620, 5, 180);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 12
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Davangere (DVG)", "Davanagere", 577002,
				"Standard", 9876543212L, 450, 4, 140);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 13
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Shivamogga Town (SMET)", "Shivamogga", 577201,
				"Standard", 9876543213L, 430, 4, 135);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 14
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Hassan Junction (HAS)", "Hassan", 573201,
				"Junction", 9876543214L, 520, 5, 160);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 15
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Udupi (UD)", "Udupi", 576101, "Standard",
				9876543215L, 410, 3, 120);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 16
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Karwar (KAWR)", "Uttara Kannada", 581301,
				"Standard", 9876543216L, 390, 3, 110);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 17 
		isDetailsCreated = RailwayStation.createRailwayStationDetails(null, "Vijayapura", 586101, "Standard",
				9876543217L, 420, 4, 130);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 18
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Raichur (RC)", "Raichur", 584101, "Standard",
				9876543218L, 450, 4, 140);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 19
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Bidar (BIDR)", "Bidar", 585401, "Standard",
				9876543219L, 400, 3, 120);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 20
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Tumakuru (TK)", "Tumakuru", 572101, "Standard",
				9876543220L, 500, 5, 150);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 21
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Bangarapet Junction (BWT)", null , 563114,
				"Junction", 9876543221L, 600, 5, 180);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 22
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Yelahanka Junction (YNK)", "Bengaluru Urban",
				560064, "Junction", 9876543222L, 700, 6, 200);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 23
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Krishnarajapuram (KJM)", "Bengaluru Urban",
				560016, "Standard", 9876543223L, 680, 6, 190);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 24
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Bengaluru Cantonment (BNC)", "Bengaluru Urban",
				560046, "Standard", 9876543224L, 620, 5, 180);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 25
		isDetailsCreated = RailwayStation.createRailwayStationDetails("NULL", "Mandya", 571401, "Standard",
				9876543225L, 350, 3, 100);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 26
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Ramanagara (RMGM)", "Ramanagara", 562159,
				"Standard", 9876543226L, 320, 3, 95);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 27
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Gadag Junction (GDG)", "Gadag", 582101,
				"Junction", 9876543227L, 480, 0, 150);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 28
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Bagalkot (BGK)", "Bagalkot", 587101, "Standard",
				9876543228L, 370, 3, 110);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 29
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Koppal (KBL)", "Koppal", 583231, "Standard",
				9876543229L, 390, 3, 120);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 30 (Invalid Station Type)
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Yadgir (YG)", "Yadgir", 585201, null,
				9876543230L, 360, 3, 110);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 31
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Chitradurga (CTA)", "Chitradurga", 577501,
				"Standard", 9876543231L, 410, 4, 130);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 32
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Chikmagalur (CMGR)", "Chikkamagaluru", 577101,
				"Standard", 9876543232L, 340, 3, 100);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 33
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Chikkaballapur (CBP)", "Chikkaballapura", 0,
				"Standard", 9876543233L, 380, 3, 110);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 34
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Kolar (KQZ)", "Kolar", 563101, "Standard",
				9876543234L, 350, 3, 100);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 35
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Arsikere Junction (ASK)", "Hassan", 573103,
				"Junction", 9876543235L, 520, 5, 160);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 36
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Londa Junction (LD)", "Belagavi", 591301,
				"Junction", 9876543236L, 480, 4, 0);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 37
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Birur Junction (RRB)", "Chikkamagaluru", 577116,
				"Junction", 9876543237L, 450, 4, 140);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 38
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Wadi Junction (WADI)", "Kalaburagi", 585225,
				"Junction", 9876543238L, 600, 6, 180);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 39
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Dharwad (DWR)", "Dharwad", 580007, "Standard",
				9876543239L, 420, 4, 130);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 40 (Invalid Contact Number)
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Haveri (HVR)", "Haveri", 581110, "Standard", 0L,
				350, 3, 110);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 41
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Harihar (HRR)", "Davanagere", 577601, "Standard",
				9876543241L, 360, 3, 115);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 42
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Whitefield (WFD)", "Bengaluru Urban", 560066,
				"Standard", 9876543242L, 550, 5, 170);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 43
		isDetailsCreated = RailwayStation.createRailwayStationDetails(null, "Bengaluru Urban", 560060,
				"Standard", 9876543243L, 500, 5, 160);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 44
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Banaswadi (BAND)", "Bengaluru Urban", 560043,
				"Standard", 9876543244L, 470, 4, 145);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 45 (Invalid Station Name)
		isDetailsCreated = RailwayStation.createRailwayStationDetails(null, "Hassan", 573134, "Standard", 9876543245L,
				320, 3, 100);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 46
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Subrahmanya Road (SBHR)", "Dakshina Kannada",
				574238, "Standard", 9876543246L, 300, 2, 90);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 47
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Gokarna Road (GOK)", "Uttara Kannada", 581326,
				"Standard", 9876543247L, 280, 2, 85);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 48
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Murdeshwar (MRDW)", "Uttara Kannada", 581350,
				"Standard", 0L, 310, 3, 95);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 49
		isDetailsCreated = RailwayStation.createRailwayStationDetails("Bhatkal (BTJL)", "Uttara Kannada", 581320,
				"Standard", 9876543249L, 330, 3, 100);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 50 (Invalid Platforms Count)
		isDetailsCreated = RailwayStation.createRailwayStationDetails("KIA International Airport (KIAD)",
				"Bengaluru Rural", 562300, "Halt", 9876543250L, 150, 0, 60);
		if (isDetailsCreated == true) {
			RailwayStation.getDetails();
		} else {
			System.out.println("Details are not created");
		}
	}

}
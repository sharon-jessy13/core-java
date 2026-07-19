class MobileRechargeExecuter {

	public static void main(String recharge[]) {

		boolean isDetailsCreated;

		// 1
		isDetailsCreated = MobileRecharge.createRechargeDetails("Sharon", 9876543210L, "Jio", "Unlimited 299", 28, 299,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 2
		isDetailsCreated = MobileRecharge.createRechargeDetails("Rahul", 9876543211L, "Airtel", "Unlimited 349", 28,
				349, "Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 3
		isDetailsCreated = MobileRecharge.createRechargeDetails("Priya", 9876543212L, "Vi", "Unlimited 299", 28, 299,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 4
		isDetailsCreated = MobileRecharge.createRechargeDetails("Kiran", 9876543213L, "BSNL", "199 Plan", 30, 199,
				"Net Banking", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 5
		isDetailsCreated = MobileRecharge.createRechargeDetails("Anjali", 9876543214L, "Jio", "399 Plan", 56, 399,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 6
		isDetailsCreated = MobileRecharge.createRechargeDetails("Ramesh", 9876543215L, "Airtel", "549 Plan", 56, 549,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 7
		isDetailsCreated = MobileRecharge.createRechargeDetails("Sneha", 9876543216L, "Vi", "859 Plan", 84, 859, "UPI",
				"Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 8
		isDetailsCreated = MobileRecharge.createRechargeDetails("Arun", 9876543217L, "Jio", "666 Plan", 84, 666,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 9
		isDetailsCreated = MobileRecharge.createRechargeDetails("Divya", 9876543218L, "BSNL", "397 Plan", 150, 397,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 10
		isDetailsCreated = MobileRecharge.createRechargeDetails("Vijay", 9876543219L, "Airtel", "719 Plan", 0, 719,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 11
		isDetailsCreated = MobileRecharge.createRechargeDetails("Meena", 9876543220L, "Jio", "999 Plan", 84, 999,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 12
		isDetailsCreated = MobileRecharge.createRechargeDetails("Suresh", 9876543221L, "Vi", "479 Plan", 56, 479, "UPI",
				null);
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 13
		isDetailsCreated = MobileRecharge.createRechargeDetails("Lakshmi", 9876543222L, "BSNL", "187 Plan", 28, 187,
				"Net Banking", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 14
		isDetailsCreated = MobileRecharge.createRechargeDetails("Ravi", 9876543223L, "Jio", "199 Plan", 18, 199,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 15
		isDetailsCreated = MobileRecharge.createRechargeDetails("Pooja", 9876543224L, "Airtel", "299 Plan", 28, 299,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 16
		isDetailsCreated = MobileRecharge.createRechargeDetails("Nikhil", 9876543225L, "Vi", "369 Plan", 30, 369,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 17 
		isDetailsCreated = MobileRecharge.createRechargeDetails(null, 9876543226L, "Jio", "349 Plan", 28, 349, "UPI",
				"Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 18
		isDetailsCreated = MobileRecharge.createRechargeDetails("Harish", 9876543227L, "Airtel", "499 Plan", 56, 499,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 19
		isDetailsCreated = MobileRecharge.createRechargeDetails("Kavya", 9876543228L, "Jio", null, 72, 749,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 20
		isDetailsCreated = MobileRecharge.createRechargeDetails("Rohit", 9876543229L, "Vi", "299 Plan", 28, 299,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 21
		isDetailsCreated = MobileRecharge.createRechargeDetails("Asha", 9876543230L, "BSNL", "239 Plan", 30, 239, "UPI",
				"Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 22
		isDetailsCreated = MobileRecharge.createRechargeDetails("Mohan", 9876543231L, "Jio", "155 Plan", 28, 155,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 23
		isDetailsCreated = MobileRecharge.createRechargeDetails(null , 9876543232L, "Airtel", "399 Plan", 28, 399,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 24
		isDetailsCreated = MobileRecharge.createRechargeDetails("Ganesh", 9876543233L, "Vi", "539 Plan", 56, 539,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 25
		isDetailsCreated = MobileRecharge.createRechargeDetails("Bhavya", 9876543234L, "Jio", "899 Plan", 90, 899,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 26
		isDetailsCreated = MobileRecharge.createRechargeDetails("Karthik", 9876543235L, "null", "299 Plan", 45, 299,
				"Net Banking", null );
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 27
		isDetailsCreated = MobileRecharge.createRechargeDetails("Neha", 9876543236L, "Airtel", "999 Plan", 84, 999,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 28
		isDetailsCreated = MobileRecharge.createRechargeDetails("Sanjay", 9876543237L, "Jio", "239 Plan", 24, 239,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 29
		isDetailsCreated = MobileRecharge.createRechargeDetails("Keerthi", 9876543238L, "Vi", "719 Plan", 84, 719,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 30 
		isDetailsCreated = MobileRecharge.createRechargeDetails("Ajay", 9876543239L, null, "349 Plan", 28, 349, "UPI",
				"Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 31
		isDetailsCreated = MobileRecharge.createRechargeDetails("Nandini", 9876543240L, "BSNL", "107 Plan", 35, 107,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 32
		isDetailsCreated = MobileRecharge.createRechargeDetails("Manoj", 9876543241L, "Jio", "1999 Plan", 365, 1999,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 33
		isDetailsCreated = MobileRecharge.createRechargeDetails("Shilpa", 9876543242L, "Airtel", "699 Plan", 56, 699,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 34
		isDetailsCreated = MobileRecharge.createRechargeDetails("Prakash", 9876543243L, "Vi", "859 Plan", 84, 859,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 35
		isDetailsCreated = MobileRecharge.createRechargeDetails("Swathi", 9876543244L, "Jio", "399 Plan", 28, 399,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 36
		isDetailsCreated = MobileRecharge.createRechargeDetails("Abhishek", 0L, "Airtel", "549 Plan", 56, 549,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 37
		isDetailsCreated = MobileRecharge.createRechargeDetails("Pavithra", 9876543246L, "Vi", "479 Plan", 56, 479,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 38
		isDetailsCreated = MobileRecharge.createRechargeDetails("Darshan", 9876543247L, "BSNL", "397 Plan", 150, 397,
				"Net Banking", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 39
		isDetailsCreated = MobileRecharge.createRechargeDetails("Akhila", 9876543248L, "Jio", "666 Plan", 84, 666,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 40 (Invalid Mobile Number)
		isDetailsCreated = MobileRecharge.createRechargeDetails("Naveen", 0L, "Airtel", "719 Plan", 84, 719, "UPI",
				"Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 41
		isDetailsCreated = MobileRecharge.createRechargeDetails("Varsha", 9876543250L, "Vi", "859 Plan", 84, 859,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 42
		isDetailsCreated = MobileRecharge.createRechargeDetails("Raghu", 9876543251L, "Jio", "999 Plan", 84, 0, "UPI",
				"Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 43
		isDetailsCreated = MobileRecharge.createRechargeDetails("Chandana", 9876543252L, "BSNL", "187 Plan", 28, 187,
				"Debit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 44
		isDetailsCreated = MobileRecharge.createRechargeDetails("Mahesh", 9876543253L, "Airtel", "299 Plan", 28, 299,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 45
		isDetailsCreated = MobileRecharge.createRechargeDetails("Bhavana", 9876543254L, "Jio", "349 Plan", 28, 349,
				null, "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 46
		isDetailsCreated = MobileRecharge.createRechargeDetails("Vinay", 9876543255L, "Vi", "369 Plan", 30, 369,
				"Credit Card", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 47
		isDetailsCreated = MobileRecharge.createRechargeDetails("Reshma", 9876543256L, "BSNL", "239 Plan", 30, 239,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 48
		isDetailsCreated = MobileRecharge.createRechargeDetails("Kishore", 9876543257L, "Jio", "155 Plan", 28, 155,
				"Wallet", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 49
		isDetailsCreated = MobileRecharge.createRechargeDetails("Sowmya", 9876543258L, "Airtel", "1999 Plan", 365, 1999,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}

		// 50 
		isDetailsCreated = MobileRecharge.createRechargeDetails("Harsha", 9876543259L, "Jio", "Unlimited Plan", 28, 0,
				"UPI", "Success");
		if (isDetailsCreated == true) {
			MobileRecharge.getDetails();
		} else {
			System.out.println("Details are not created");
		}
	}

}
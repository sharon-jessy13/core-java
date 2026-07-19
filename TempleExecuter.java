class TempleExecuter {

    public static void main(String args[]) {

        boolean isDetailsCreated;

        // 1
        isDetailsCreated = Temple.createTempleDetails("Sri Prasanna Anjaneyaswamy Temple (Ragigudda)",
                "Jayanagar 9th Block",
                560069, "Ragigudda Sri Prasanna Anjaneyaswamy Temple Trust", 9876543210L, 15, 2, 5000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 2
        isDetailsCreated = Temple.createTempleDetails("ISKCON Temple (Sri Radha Krishna Temple)", "Rajajinagar", 560010,
                "ISKCON Bangalore Society / Trust", 9876543211L, 20, 5, 10000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 3
        isDetailsCreated = Temple.createTempleDetails("Shivoham Shiva Temple", "Old Airport Road", 560017,
                "Sri Shivoham Trust",
                9876543212L, 12, 2, 4000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 4
        isDetailsCreated = Temple.createTempleDetails("Dodda Basavana Gudi (Bull Temple)", "Basavanagudi", 560004,
                "Muzrai Department, Govt. of Karnataka", 9876543213L, 18, 3, 7000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 5
        isDetailsCreated = Temple.createTempleDetails("Kote Sri Venkataramana Swamy Temple", "Chamarajpet", 560018,
                "Shree Balaji Foundation / Muzrai Dept", 9876543214L, 10, 2, 3000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 6
        isDetailsCreated = Temple.createTempleDetails("Sri Gavi Gangadhareshwara Temple", "Gavipuram", 560019,
                "Muzrai Department, Govt. of Karnataka",
                9876543215L, 15, 2, 6000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 7
        isDetailsCreated = Temple.createTempleDetails("Sri Halasuru Someshwara Swamy Temple", "Halasuru", 560008,
                "Muzrai Department, Govt. of Karnataka", 9876543216L, 14, 2, 4500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 8
        isDetailsCreated = Temple.createTempleDetails("Sri Banashankari Amma Temple", "Banashankari", 560070,
                "Muzrai Department / Endowments Board", 9876543217L, 18, 3, 8000);
        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 9
        isDetailsCreated = Temple.createTempleDetails("Sri Dharmaraya Swamy Temple", "Nagarathpet", 560002,
                "Sri Dharmaraya Swamy Temple Management Trust",
                9876543218L, 12, 1, 3500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 10
        isDetailsCreated = Temple.createTempleDetails("Sri Shrungagiri Sri Shanmukha Swami Temple",
                "Rajarajeshwari Nagar",
                560098, "Shrungagiri Temple Trust", 9876543219L, 16, 2, 5000);
        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 11
        isDetailsCreated = Temple.createTempleDetails("Sri Avani Shringeri Shankara Mutt", "Chamarajpet", 560018,
                "Sri Sringeri Sharada Peetham Trust", 9876543220L, 10, 2, 2500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 12
        isDetailsCreated = Temple.createTempleDetails(null, "Chickpet", 560053, "Hereditary Trustees / Muzrai Dept",
                9876543221L, 12, 2, 3000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 13
        isDetailsCreated = Temple.createTempleDetails("Sri Subramanya Swamy Temple", "Ulsoor", 560008,
                "Private Devotee Management / Trust",
                9876543222L, 14, 2, 4000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 14
        isDetailsCreated = Temple.createTempleDetails("Kadu Malleshwara Temple", "Malleshwaram", 560003,
                "Muzrai Department, Govt. of Karnataka",
                9876543223L, 18, 3, 7500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 15 (Invalid Hall Count)
        isDetailsCreated = Temple.createTempleDetails("Sri Dakshinamukha Nandi Tirtha Kalyani Kshetra", "Malleshwaram",
                560003, "Private Management / Temple Trust", 9876543224L, 8, 0, 2000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 16
        isDetailsCreated = Temple.createTempleDetails("Sri Sai Mandir", "Rajajinagar", 560010,
                "Sri Shirdi Sai Sansthan",
                9876543225L, 10, 2, 3500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 17
        isDetailsCreated = Temple.createTempleDetails("Sri Ganesha Temple (Eshwara Temple)", "Jayanagar 4th Block",
                560011,
                "Local Temple Trust", 9876543226L, 8, 1, 2500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 18
        isDetailsCreated = Temple.createTempleDetails("Sri Anjaneya Swamy Temple", "Mahalakshmi Layout", 560086,
                "Sri Anjaneya Seva Trust", 9876543227L, 12, 2, 4000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 19
        isDetailsCreated = Temple.createTempleDetails("Sri Muneshwara Swamy Temple", "Indiranagar", 560038,
                "Local Temple Committee", 9876543228L, 10, 1, 3000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 20
        isDetailsCreated = Temple.createTempleDetails("Sri Kalika Durga Parameshwari Temple", "Vidyaranyapura", 560097,
                "Kalika Trust", 9876543229L, 14, 2, 4500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 21
        isDetailsCreated = Temple.createTempleDetails("Sri Ayyappa Swami Temple", "Koramangala", 560034,
                "Ayyappa Seva Samithi Trust", 9876543230L, 15, 2, 5000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 22
        isDetailsCreated = Temple.createTempleDetails("Sri Varasiddhi Vinayaka Temple", "HSR Layout", 560102,
                "Vinayaka Temple Trust", 9876543231L, 8, 1, 2800);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 23
        isDetailsCreated = Temple.createTempleDetails("Sri Maruthi Temple", "Vijayanagar", 560040,
                "Maruthi Seva Samithi", 9876543232L, 9, 1, 2500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 24
        isDetailsCreated = Temple.createTempleDetails("Sri Jagannatha Temple", "Sarjapur Road", 560102,
                "Odia Cultural Association Trust", 9876543233L, 12, 2, 3800);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 25
        isDetailsCreated = Temple.createTempleDetails("Sri Bala Gangadharanatha Swamy Mutt", "Vijayanagar", 560040,
                "Adichunchanagiri Mutt Trust", 9876543234L, 18, 3, 6000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 26
        isDetailsCreated = Temple.createTempleDetails("Sri Udupi Sri Krishna Mutt", "Rajajinagar", 560010,
                "Udupi Pejavara Adhokshaja Mutt Trust", 9876543235L, 16, 2, 5500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 27
        isDetailsCreated = Temple.createTempleDetails("Sri Dattatreya Temple", "Basaveshwaranagar", 560079,
                "Sri Dattatreya Seva Samithi", 9876543236L, 10, 1, 2700);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 28
        isDetailsCreated = Temple.createTempleDetails("Sri Raghavendra Swamy Mutt", "Jayanagar", 560041,
                "Sri Raghavendra Swamy Mutt Trust",
                9876543237L, 15, 2, 4300);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 29
        isDetailsCreated = Temple.createTempleDetails("Sri Omkareshwara Temple", "Omkar Hills, RR Nagar", 560056,
                "Sri Sri Sri Shivakumara Swamiji Trust", 9876543238L, 12, 2, 3500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 30
        isDetailsCreated = Temple.createTempleDetails("Sri Shirdi Sai Baba Temple", "Nagarbhavi", 560072,
                "Sai Spiritual Trust", 9876543239L, 14, 2, 4800);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 31
        isDetailsCreated = Temple.createTempleDetails("Sri Mahalakshmi Temple", "Mahalakshmi Layout", 560086,
                "Mahalakshmi Temple Trust",
                9876543240L, 11, 2, 3900);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 32
        isDetailsCreated = Temple.createTempleDetails("Sri Gayathri Temple", "Jayanagar", 560082,
                "Gayathri Charitable Trust",
                9876543241L, 10, 1, 2600);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 33
        isDetailsCreated = Temple.createTempleDetails("Sri Bhoga Nandeeshwara Temple", "Nandi Hills", 562105,
                "Muzrai Department / Archaeological Survey",
                9876543242L, 18, 3, 7000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 34
        isDetailsCreated = Temple.createTempleDetails("Sri Raghavendra Swamy Mutt", "Malleshwaram", 560003,
                "Mantralayam Sri Raghavendra Swamy Mutt", 9876543243L, 16, 2, 5200);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 35
        isDetailsCreated = Temple.createTempleDetails("Sri Dandu Mariamman Temple", "Shivajinagar", 560001,
                "Dandu Mariamman Seva Trust", 9876543244L, 12, 2, 4200);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 36
        isDetailsCreated = Temple.createTempleDetails(null, "Malleshwaram", 560003, "Local Temple Trust Committee",
                9876543245L, 10, 2, 3000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 37
        isDetailsCreated = Temple.createTempleDetails("Sri Anjaneya Swamy Temple", "Basavanagudi", 560004,
                "Local Temple Trust", 9876543246L, 11, 2, 3800);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 38
        isDetailsCreated = Temple.createTempleDetails("Sri Subrahmanya Temple", "Mattikere", 560054,
                "Subrahmanya Seva Samithi", 9876543247L, 13, 2, 4500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 39
        isDetailsCreated = Temple.createTempleDetails("Sri Abhaya Anjaneya Swamy Temple", "Yeshwanthpur", 560022,
                "Abhaya Anjaneya Trust", 9876543248L, 14, 2, 5000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 40
        isDetailsCreated = Temple.createTempleDetails("Sri Skandagiri Subrahmanya Swamy Temple", "Mahalakshmi Layout",
                560086, "Skandagiri Temple Trust", 9876543249L, 18, 3, 8000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 41
        isDetailsCreated = Temple.createTempleDetails("Sri Shirdi Sai Baba Temple", "Mathikere", 560054,
                "Sai Mandir Trust", 9876543250L, 10, 2, 3600);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 42
        isDetailsCreated = Temple.createTempleDetails("Sri Rajarajeshwari Temple", "Rajarajeshwari Nagar", 560098,
                "Kailash Ashrama Mahasamsthana Trust", 9876543251L, 16, 3, 7000);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 43
        isDetailsCreated = Temple.createTempleDetails("Sri Chokkanathaswamy Temple", "Domlur", 560071,
                "Muzrai Department, Govt. of Karnataka", 9876543252L, 12, 2, 4100);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 44
        isDetailsCreated = Temple.createTempleDetails("Sri Kempamma Devi Temple", "Palace Guttahalli", 560003,
                "Kempamma Devi Trust", 9876543253L, 10, 2, 3300);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 45
        isDetailsCreated = Temple.createTempleDetails("Sri Venugopalaswamy Temple", "Malleshwaram", 560003,
                "Local Temple Trust", 9876543254L, 11, 0, 3500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 46
        isDetailsCreated = Temple.createTempleDetails("Sri Renuka Yellamma Temple", "Yeshwanthpur", 560022,
                "Renuka Yellamma Trust", 9876543255L, 12, 2, 4200);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 47
        isDetailsCreated = Temple.createTempleDetails("Sri Karumariamman Temple", "Indiranagar", 560038,
                "Indiranagar Karumariamman Trust", 9876543256L, 9, 1, 2800);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 48
        isDetailsCreated = Temple.createTempleDetails("Sri Panchamukhi Ganesha Temple", "BTM Layout", 560076,
                "Panchamukhi Seva Samithi", 9876543257L, 10, 2, 3900);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 49
        isDetailsCreated = Temple.createTempleDetails("Sri Maruthi Temple", "Jayanagar 7th Block", 560070,
                "Anjaneya Seva Trust", 9876543258L, 11, 2, 3700);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 50
        isDetailsCreated = Temple.createTempleDetails("Sri Bhoga Nandeeshwara Swamy Temple", "Yelahanka", 560064,
                "Muzrai Dept / Local Temple Trust", 0L, 15, 2, 6500);

        if (isDetailsCreated == true) {
            Temple.getDetails();
        } else {
            System.out.println("Details are not created");
        }



    }
	
	
}
class InstituteExecuter {
    public static void main(String ins[]) {

        boolean isDetailsCreated;

        // 1
        isDetailsCreated = Institute.createInstituteDetails("Indian Institute of Science", "Bengaluru", 560012,
                "Research", 9876543210L, 4500, 45, 600);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 2
        isDetailsCreated = Institute.createInstituteDetails("IIM Bangalore", "Bengaluru", 560076, "Management",
                9876543211L, 3500, 12, 250);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 3
        isDetailsCreated = Institute.createInstituteDetails(null, "Surathkal",
                575025, "Engineering", 9876543212L, 6500, 18, 450);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 4
        isDetailsCreated = Institute.createInstituteDetails("IIT Dharwad", "Dharwad", 580011, "Engineering",
                9876543213L, 3200, 15, 300);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 5
        isDetailsCreated = Institute.createInstituteDetails("IIIT Bangalore", "Bengaluru", 560100, "Engineering",
                9876543214L, 1800, 0, 150);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 6
        isDetailsCreated = Institute.createInstituteDetails("NIMHANS", "Bengaluru", 560029, "Medical", 9876543215L,
                5000, 20, 700);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 7
        isDetailsCreated = Institute.createInstituteDetails("National Law School of India University", "Bengaluru",
                560072, "Law", 9876543216L, 1500, 10, 180);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 8
        isDetailsCreated = Institute.createInstituteDetails("Manipal Institute of Technology", "Manipal", 576104,
                "Engineering", 9876543217L, 9000, 22, 650);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 9
        isDetailsCreated = Institute.createInstituteDetails("RV College of Engineering", "Bengaluru", 560059,
                "Engineering", 9876543218L, 8000, 16, 500);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 10
        isDetailsCreated = Institute.createInstituteDetails("BMS College of Engineering", "Bengaluru", 560019,
                "Engineering", 9876543219L, 7500, 17, 480);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 11
        isDetailsCreated = Institute.createInstituteDetails("MS Ramaiah Institute of Technology", "Bengaluru", 560054,
                "Engineering", 9876543220L, 8500, 18, 520);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 12
        isDetailsCreated = Institute.createInstituteDetails("PES University", "Bengaluru", 560085, "University",
                9876543221L,0, 20, 650);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 13
        isDetailsCreated = Institute.createInstituteDetails("Siddaganga Institute of Technology", "Tumakuru", 572103,
                "Engineering", 9876543222L, 7000, 15, 420);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 14
        isDetailsCreated = Institute.createInstituteDetails("Dayananda Sagar College of Engineering", "Bengaluru",
                560078, "Engineering", 9876543223L, 8000, 16, 500);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 15
        isDetailsCreated = Institute.createInstituteDetails("NMAM Institute of Technology", null, 574110,
                "Engineering", 9876543224L, 6000, 14, 380);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 16
        isDetailsCreated = Institute.createInstituteDetails("SDM College of Engineering and Technology", "Dharwad",
                580002, "Engineering", 9876543225L, 5000, 13, 320);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 17
        isDetailsCreated = Institute.createInstituteDetails("Malnad College of Engineering", "Hassan", 573202,
                "Engineering", 9876543226L, 5500, 14, 340);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 18
        isDetailsCreated = Institute.createInstituteDetails("Dr. Ambedkar Institute of Technology", "Bengaluru", 560056,
                "Engineering", 9876543227L, 6500, 15, 360);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 19
        isDetailsCreated = Institute.createInstituteDetails("Basaveshwar Engineering College", "Bagalkot", 587102,
                "Engineering", 9876543228L, 5200, 13, 300);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 20
        isDetailsCreated = Institute.createInstituteDetails("JNN College of Engineering", "Shivamogga", 577204,
                "Engineering", 9876543229L, 5000, 0, 320);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 21
        isDetailsCreated = Institute.createInstituteDetails("Visvesvaraya Technological University", "Belagavi", 590018,
                "University", 9876543230L, 250000, 25, 1200);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 22
        isDetailsCreated = Institute.createInstituteDetails("Christ University", "Bengaluru", 560029, "University",
                9876543231L, 30000, 30, 1500);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 23
        isDetailsCreated = Institute.createInstituteDetails("Jain University", "Bengaluru", 560069, "University",
                9876543232L, 25000, 28, 1300);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 24
        isDetailsCreated = Institute.createInstituteDetails("KLE Technological University", "Hubballi", 580031,
                "University", 9876543233L, 12000, 18, 650);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 25
        isDetailsCreated = Institute.createInstituteDetails("Alliance University", "Bengaluru", 562106, "University",
                0L, 15000, 20, 750);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 26
        isDetailsCreated = Institute.createInstituteDetails("REVA University", "Bengaluru", 560064, "University",
                9876543235L, 18000, 22, 850);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 27
        isDetailsCreated = Institute.createInstituteDetails("St. Joseph's University", "Bengaluru", 560027,
                "University", 9876543236L, 12000, 18, 700);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 28
        isDetailsCreated = Institute.createInstituteDetails("University of Mysore", "Mysuru", 570005, "University",
                9876543237L, 30000, 30, 1200);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 29
        isDetailsCreated = Institute.createInstituteDetails("Kuvempu University", "Shivamogga", 577451, "University",
                9876543238L, 18000, 20, 800);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 30
        isDetailsCreated = Institute.createInstituteDetails("Karnataka University", "Dharwad", 580003, "University",
                9876543239L, 25000, 24, 950);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 31
        isDetailsCreated = Institute.createInstituteDetails("Mangalore University", "Mangaluru", 574199, "University",
                9876543240L, 22000, 22, 900);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 32
        isDetailsCreated = Institute.createInstituteDetails("Bangalore University", "Bengaluru", 560056, "University",
                9876543241L, 35000, 35, 1500);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 33
        isDetailsCreated = Institute.createInstituteDetails("Tumkur University", "Tumakuru", 572103, "University",
                9876543242L, 15000, 18, 650);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 34
        isDetailsCreated = Institute.createInstituteDetails("Gulbarga University", "Kalaburagi", 585106, "University",
                9876543243L, 20000, 22, 850);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 35
        isDetailsCreated = Institute.createInstituteDetails("Vijayanagara Sri Krishnadevaraya University", "Ballari",
                583105, "University", 9876543244L, 18000, 20, 700);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 36
        isDetailsCreated = Institute.createInstituteDetails(null, "Davanagere", 577007, "University",
                9876543245L, 17000, 18, 650);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 37
        isDetailsCreated = Institute.createInstituteDetails("Central University of Karnataka", "Kalaburagi", 585367,
                "Central University", 9876543246L, 8000, 15, 450);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 38
        isDetailsCreated = Institute.createInstituteDetails("Rajiv Gandhi University of Health Sciences", "Bengaluru",
                560041, "Medical University", 9876543247L, 20000, 18, 700);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 39
        isDetailsCreated = Institute.createInstituteDetails("JSS Science and Technology University", "Mysuru", 570006,
                "University", 9876543248L, 9000, 16, 500);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 40
        isDetailsCreated = Institute.createInstituteDetails("Mount Carmel College", "Bengaluru", 560052,
                "Arts & Science", 9876543249L, 10000, 15, 450);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 41
        isDetailsCreated = Institute.createInstituteDetails("Loyola Degree College", "Bengaluru", 560043,
                "Degree College", 9876543250L, 8000, 12, 350);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 42
        isDetailsCreated = Institute.createInstituteDetails("University of Agricultural Sciences", "Bengaluru", 560065,
                "Agricultural", 9876543251L, 12000, 18, 600);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 43
        isDetailsCreated = Institute.createInstituteDetails("University of Horticultural Sciences", "Bagalkot", 587104,
                "Horticultural", 9876543252L, 7000, 12, 350);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 44
        isDetailsCreated = Institute.createInstituteDetails("University of Agricultural and Horticultural Sciences",
                "Shivamogga", 577204, "Agricultural", 9876543253L, 7500, 14, 380);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 45
        isDetailsCreated = Institute.createInstituteDetails("Karnataka State Law University", "Hubballi", 580025, "Law",
                9876543254L, 9000, 10, 300);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 46
        isDetailsCreated = Institute.createInstituteDetails("University of Agricultural Sciences", "Dharwad", 580005,
                "Agricultural", 9876543255L, 11000, 16, 500);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 47
        isDetailsCreated = Institute.createInstituteDetails("Indian Institute of Plantation Management", "Bengaluru",
                560056, "Management", 9876543256L, 2500, 8, 150);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 48
        isDetailsCreated = Institute.createInstituteDetails("MS Ramaiah College of Arts Science and Commerce",
                "Bengaluru", 560054, null, 9876543257L, 7000, 12, 320);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 49
        isDetailsCreated = Institute.createInstituteDetails("Maharani Lakshmi Ammanni College for Women", "Bengaluru",
                560012, "Women's College", 9876543258L, 6000, 10, 250);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 50
        isDetailsCreated = Institute.createInstituteDetails("National Institute of Design", "Bengaluru", 562130,
                "Design", 9876543259L, 3000, 9, 180);

        if (isDetailsCreated == true) {
            Institute.getDetails();
        } else {
            System.out.println("Details are not created");
        }
    }
}
class ParkExecuter {

    public static void main(String parks[]) {

        boolean isDetailsCreated;

        // 1
        isDetailsCreated = Park.createParkDetails("Wonderla Amusement Park", "Mysore Road, Bengaluru", 101, 65,
                "Wonderla Holidays Ltd", 9876543201L, 350, 1200);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 2
        isDetailsCreated = Park.createParkDetails("GRS Fantasy Park", "Metagalli, Mysuru", 102, 45, "GRS Group",
                9876543202L, 220, 900);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 3
        isDetailsCreated = Park.createParkDetails("Manasa Water Park & Resort", "Vamanjoor, Mangaluru", 103, 30,
                "Manasa Resorts", 9876543203L, 180, 700);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 4
        isDetailsCreated = Park.createParkDetails("Fun World Amusement Park", null , 104, 40,
                "Fun World Pvt Ltd", 9876543204L, 210, 850);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 5
        isDetailsCreated = Park.createParkDetails("Innovative Film City", "Bidadi", 105, 50, "Innovative Studios",
                9876543205L, 280, 1000);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 6
        isDetailsCreated = Park.createParkDetails("Snow City", "Jayamahal Road, Bengaluru", 106, 20,
                "Snow City Pvt Ltd", 9876543206L, 120, 650);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 7
        isDetailsCreated = Park.createParkDetails("Dharwad Adventure Base", "Kelgeri, Dharwad", 107, 25,
                "Adventure Karnataka", 9876543207L, 100, 600);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 8
        isDetailsCreated = Park.createParkDetails("Discovate Studios and Adventure", "Dommasandra, Bengaluru", 108, 35,
                null , 9876543208L, 160, 750);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 9
        isDetailsCreated = Park.createParkDetails("Tinton Adventure Resort", "Kundapura", 109, 28, "Tinton Resorts",
                9876543209L, 140, 700);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 10
        isDetailsCreated = Park.createParkDetails("Snow Fantasy Mangaluru", "Pandeshwar, Mangaluru", 110, 18,
                "Fiza Mall", 9876543210L, 90, 500);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 11
        isDetailsCreated = Park.createParkDetails("UVA Meridian Amusement Park", "Koteshwara", 111, 22, "UVA Meridian",
                9876543211L, 110, 650);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 12
        isDetailsCreated = Park.createParkDetails("Neeladri Amusement And Water Park", "Palace Guttahalli", 112, 32,
                "Neeladri Group", 9876543212L, 170, 800);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 13
        isDetailsCreated = Park.createParkDetails("Area 83", "Bannerghatta Road", 113, 27, "Area 83 Pvt Ltd",
                9876543213L, 150, 900);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 14
        isDetailsCreated = Park.createParkDetails("Planet Earth Aquarium & Pet Park", "Hebbal, Mysuru", 114, 15,
                "Planet Earth", 9876543214L, 95, 400);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 15
        isDetailsCreated = Park.createParkDetails("Outdoors Grand Bay", "Ullal, Mangaluru", 115, 24,
                "Grand Bay Resorts", 9876543215L, 125, 750);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 16
        isDetailsCreated = Park.createParkDetails("BOUNCE Inc.", "Rajajinagar, Bengaluru", 116, 18, "Bounce India",
                9876543216L, 95, 850);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 17
        isDetailsCreated = Park.createParkDetails(null, "Binnypet, Bengaluru", 117, 26, "Lulu Mall", 9876543217L, 135,
                950);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 18
        isDetailsCreated = Park.createParkDetails("Funtura", "Binnypet, Bengaluru", 118, 32, "Lulu Mall", 9876543218L,
                160, 999);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 19
        isDetailsCreated = Park.createParkDetails("Loco Bear", "Koramangala, Bengaluru", 119, 20, "Loco Bear Pvt Ltd",
                9876543219L, 110, 799);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 20
        isDetailsCreated = Park.createParkDetails("Playville Kids Play Zone", "Bommanahalli, Bengaluru", 120, 15,
                "Playville Entertainment", 9876543220L, 75, 450);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 21
        isDetailsCreated = Park.createParkDetails("SkyJumper Trampoline Park", "Garuda Mall, Bengaluru", 121, 24,
                "SkyJumper", 9876543221L, 120, 850);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 22
        isDetailsCreated = Park.createParkDetails("Escape Park", "Bannerghatta, Bengaluru", 122, 18,
                "Escape Adventures", 9876543222L, 0, 650);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 23
        isDetailsCreated = Park.createParkDetails("Ninja Inflatable Park", "Hennur, Bengaluru", 123, 22, "Ninja Parks",
                9876543223L, 90, 700);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 24
        isDetailsCreated = Park.createParkDetails("GRS Snow Park", "Metagalli, Mysuru", 124, 14, "GRS Group",
                9876543224L, 70, 500);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 25
        isDetailsCreated = Park.createParkDetails("Snow Palace", "Mysuru", 125, 16, "Snow Palace Pvt Ltd", 9876543225L,
                80, 550);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 26
        isDetailsCreated = Park.createParkDetails("SMAAASH", "Mangaluru", 126, 28, "SMAAASH Entertainment", 9876543226L,
                140, 900);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 27
        isDetailsCreated = Park.createParkDetails("Fun Galaxy", "Puttur", 127, 17, "Fun Galaxy", 9876543227L, 65, 400);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 28
        isDetailsCreated = Park.createParkDetails("Relax Leisure Park", "Brahmavara", 128, 19, "Relax Group",
                9876543228L, 90, 650);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 29
        isDetailsCreated = Park.createParkDetails("Anjali Water Park", "Karje", 129, 21, "Anjali Resorts", 9876543229L,
                100, 0);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 30
        isDetailsCreated = Park.createParkDetails("Celebre By SkyJumper", "Ashok Nagar, Bengaluru", 130, 0, "SkyJumper",
                9876543230L, 95, 800);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 31
        isDetailsCreated = Park.createParkDetails("S.A.R Fantasy Water Park", "Kolar Gold Fields", 131, 26,
                "SAR Fantasy", 9876543231L, 125, 750);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 32
        isDetailsCreated = Park.createParkDetails("Vels Jollywood Studios and Adventure", "Bidadi", 132, 30,
                "Vels Group", 9876543232L, 150, 850);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 33
        isDetailsCreated = Park.createParkDetails("Wonder Mountain Valley Resort", "Hosapete", 133, 18, "Wonder Valley",
                9876543233L, 110, 900);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 34
        isDetailsCreated = Park.createParkDetails("Sir M Visvesvaraya Rainwater Harvesting Theme Park",
                "Jayanagar, Bengaluru", 134, 10, null, 9876543234L, 60, 150);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 35
        isDetailsCreated = Park.createParkDetails("Krishna Leela Theme Park", "Subramanyapura, Bengaluru", 135, 18,
                "Krishna Leela Group", 9876543235L, 95, 450);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 36
        isDetailsCreated = Park.createParkDetails("Rangoli Gardens", "Jakkur, Bengaluru", 136, 22, "Rangoli Gardens",
                9876543236L, 110, 600);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 37
        isDetailsCreated = Park.createParkDetails("Fun Fusion Mania", "Balagere, Bengaluru", 137, 16,
                "Fun Fusion Pvt Ltd", 9876543237L, 85, 500);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 38
        isDetailsCreated = Park.createParkDetails("Racing Rigs (Go-Karting)", "JP Nagar, Bengaluru", 138, 14,
                "Racing Rigs", 9876543238L, 70, 700);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 39
        isDetailsCreated = Park.createParkDetails(null, "Koramangala, Bengaluru", 139, 20,
                "Splashit Entertainment", 9876543239L, 100, 650);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 40
        isDetailsCreated = Park.createParkDetails("The Rig VR Arcade", "Kothanur, Bengaluru", 140, 18, "Rig VR",
                9876543240L, 80, 550);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 41
        isDetailsCreated = Park.createParkDetails("Jus Jumpin", "Electronic City, Bengaluru", 141, 24,
                "Jus Jumpin Pvt Ltd", 9876543241L, 120, 750);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 42
        isDetailsCreated = Park.createParkDetails("Fever Pitch Holidays", "Kumbalagodu, Bengaluru", 142, 15,
                "Fever Pitch", 9876543242L, 90, 500);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 43
        isDetailsCreated = Park.createParkDetails("Funway Mysore", "Chamundi Hill Road, Mysuru", 143, 19,
                "Funway Pvt Ltd", 9876543243L, 100, 550);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 44
        isDetailsCreated = Park.createParkDetails("Strikers Bowling & Game Zone", "Indiranagar, Mysuru", 144, 17,
                "Strikers", 9876543244L, 85, 450);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 45
        isDetailsCreated = Park.createParkDetails("Coorg Water Park", "Periyapatna", 145, 23, "Coorg Water Park", 0L,
                110, 700);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 46
        isDetailsCreated = Park.createParkDetails("Hidden Heaven Picnic Point", "Neelavara", 146, 12, "Hidden Heaven",
                9876543246L, 65, 300);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 47
        isDetailsCreated = Park.createParkDetails("Shivarama Karantha Children's Amusement Park", "Puttur", 147, 20,
                "Puttur Municipality", 9876543247L, 95, 350);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 48
        isDetailsCreated = Park.createParkDetails("Pilikula Biological Park", "Vamanjoor, Mangaluru", 148, 28,
                "Pilikula Development Authority", 9876543248L, 180, 250);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 49
        isDetailsCreated = Park.createParkDetails("Indian Garden Water Park", "Manipal", 149, 21, "Indian Garden Group",
                9876543249L, 105, 650);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

        // 50
        isDetailsCreated = Park.createParkDetails("Country Club Water World", "Bannerghatta Road, Bengaluru", 150, 30,
                "Country Club", 9876543250L, 150, 0);

        if (isDetailsCreated == true) {
            Park.getDetails();
        } else {
            System.out.println("Details are not created");
        }

    }

}
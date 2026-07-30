class PageOne {

    public static void main(String[] doctorDetails) {

        Doctors doc = new Doctors();

        String[] specializationOfMisra = { "Diabetology/Endocrinology ", " Endocrinology" };

        doc.name = "Dr. Anoop Misra";
        doc.designation = "Executive Chairman Fortis C Doc";
        doc.specialization = specializationOfMisra; // exteranlly passing array
        doc.experienceInYears = 40;
        doc.fees = 2800;

        System.out.println("Name: " + doc.name);
        System.out.println("Designation: " + doc.designation);

        System.out.println("Specialization: ");

        for (String specialize : doc.specialization) {
            System.out.println(specialize);
        }

        System.out.println("Experience : " + doc.experienceInYears);
        System.out.println("Fees : " + doc.fees);

        System.out.println("------------------------------------------------");

       //Doctor2
        Doctors doc1 = new Doctors();

        String[] specializationOfAmit = {"General Surgery","Bariatric Surgery","Robotic Surgery",
                "General and Minimal Access Surgery","General and Laparoscopic Surgery",
                "Oncology","GI Oncology","Surgical Oncology"};

        doc1.name = "Dr. (Prof.) Amit Javed";
        doc1.designation = "Principal Director";
        doc1.specialization = specializationOfAmit;
        doc1.experienceInYears = 25;
        doc1.fees = 1500;

        System.out.println("Name: " + doc1.name);
        System.out.println("Designation: " + doc1.designation);
        System.out.println("Specialization:");
        for (String specialize : doc1.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc1.experienceInYears);
        System.out.println("Fees: " + doc1.fees);
		
	    System.out.println("------------------------------------------------");

        // Doctor 3
        Doctors doc2 = new Doctors();

        String[] specializationOfManjinder = {"Cardiac Sciences","Interventional Cardiology"};

        doc2.name = "Dr. (Col.) Manjinder Sandhu";
        doc2.designation = "Principal Director";
        doc2.specialization = specializationOfManjinder;
        doc2.experienceInYears = 35;
        doc2.fees = 2000;

    
        System.out.println("Name: " + doc2.name);
        System.out.println("Designation: " + doc2.designation);
        System.out.println("Specialization:");
        for (String specialize : doc2.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc2.experienceInYears);
        System.out.println("Fees: " + doc2.fees);
		
		 System.out.println("------------------------------------------------");

       //Doctor 3 
        Doctors doc3 = new Doctors();

        String[] specializationOfAjayAgarwal = {"Support Specialties","General Physician","Internal Medicine"};

        doc3.name = "Dr. Ajay Agarwal";
        doc3.designation = "Chairman";
        doc3.specialization = specializationOfAjayAgarwal;
        doc3.experienceInYears = 25;
        doc3.fees = 1400;
		
        System.out.println("Name: " + doc3.name);
        System.out.println("Designation: " + doc3.designation);
        System.out.println("Specialization:");
        for (String specialize : doc3.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc3.experienceInYears);
        System.out.println("Fees: " + doc3.fees);
		
		 System.out.println("------------------------------------------------");

        // Doctor5
        Doctors doc4 = new Doctors();

        String[] specializationOfAjayKaul = {
                "Cardiac Sciences",
                "Vascular Surgery",
                "Adult CTVS",
                "Paediatric CTVS",
                "Heart Transplant"
        };

        doc4.name = "Dr. Ajay Kaul";
        doc4.designation = "Chairman";
        doc4.specialization = specializationOfAjayKaul;
        doc4.experienceInYears = 38;
        doc4.fees = 1600;

        System.out.println("Name: " + doc4.name);
        System.out.println("Designation: " + doc4.designation);
        System.out.println("Specialization:");
        for (String specialize : doc4.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc4.experienceInYears);
        System.out.println("Fees: " + doc4.fees);
		System.out.println("------------------------------------------------");

        //Doctor 6
        Doctors doc5 = new Doctors();

        String[] specializationOfKriplani = {"General Surgery","General and Minimal Access Surgery",
                "General and Laparoscopic Surgery","Gastroenterology and Hepatobiliary Sciences",
                "Metabolic & Bariatric Surgery","GI, Minimal Access and Bariatric Surgery","Robotic Surgery"};

        doc5.name = "Dr. Ajay Kumar Kriplani";
        doc5.designation = "Principal Director";
        doc5.specialization = specializationOfKriplani;
        doc5.experienceInYears = 40;
        doc5.fees = 1500;


        System.out.println("Name: " + doc5.name);
        System.out.println("Designation: " + doc5.designation);
        System.out.println("Specialization:");
        for (String specialize : doc5.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc5.experienceInYears);
        System.out.println("Fees: " + doc5.fees);
	    System.out.println("------------------------------------------------");

        //Doctor 7
        Doctors doc6 = new Doctors();

        String[] specializationOfNarula = {"Organ Transplant","Kidney Transplant","Nephrology"};

        doc6.name = "Dr. Ajit Singh Narula";
        doc6.designation = "Principal Director";
        doc6.specialization = specializationOfNarula;
        doc6.experienceInYears = 40;
        doc6.fees = 2000;

      
        System.out.println("Name: " + doc6.name);
        System.out.println("Designation: " + doc6.designation);
        System.out.println("Specialization:");
        for (String specialize : doc6.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc6.experienceInYears);
        System.out.println("Fees: " + doc6.fees);
		  System.out.println("------------------------------------------------");
		  

        //Doctor 8
        Doctors doc7 = new Doctors();

        String[] specializationOfAmite = {
                "Orthopaedics",
                "Orthopaedics and Joint Replacement",
                "Sports Medicine",
                "Robotic and Computer Navigated Joint Reconstruction"
        };

        doc7.name = "Dr. Amite Pankaj Aggarwal";
        doc7.designation = "Principal Director";
        doc7.specialization = specializationOfAmite;
        doc7.experienceInYears = 27;
        doc7.fees = 1500;

       
        System.out.println("Name: " + doc7.name);
        System.out.println("Designation: " + doc7.designation);
        System.out.println("Specialization:");
        for (String specialize : doc7.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc7.experienceInYears);
        System.out.println("Fees: " + doc7.fees);
		
		  System.out.println("------------------------------------------------");

        // Doctor 9
        Doctors doc8 = new Doctors();

        String[] specializationOfMandhani = {
                "Urology",
                "Uro-Oncology",
                "Robotic Surgery",
                "Organ Transplant",
                "Kidney Transplant"
        };

        doc8.name = "Dr. Anil Mandhani";
        doc8.designation = "Chairman";
        doc8.specialization = specializationOfMandhani;
        doc8.experienceInYears = 35;
        doc8.fees = 2000;

       
        System.out.println("Name: " + doc8.name);
        System.out.println("Designation: " + doc8.designation);
        System.out.println("Specialization:");
        for (String specialize : doc8.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc8.experienceInYears);
        System.out.println("Fees: " + doc8.fees);
		
		System.out.println("------------------------------------------------");
		
		
        // Doctor 10
        Doctors doc9 = new Doctors();

        String[] specializationOfAnilSaxena = {
                "Cardiac Sciences",
                "Electrophysiology"
        };

        doc9.name = "Dr. Anil Saxena";
        doc9.designation = "Chairman";
        doc9.specialization = specializationOfAnilSaxena;
        doc9.experienceInYears = 35;
        doc9.fees = 2000;

        
        System.out.println("Name: " + doc9.name);
        System.out.println("Designation: " + doc9.designation);
        System.out.println("Specialization:");
        for (String specialize : doc9.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc9.experienceInYears);
        System.out.println("Fees: " + doc9.fees);
		
		  System.out.println("------------------------------------------------");
		  
		  

        //Doctor 11
        Doctors doc10 = new Doctors();

        String[] specializationOfAnita = {
                "Paediatrics",
                "Paediatric Cardiac Sciences"
        };

        doc10.name = "Dr. Anita Saxena";
        doc10.designation = "Executive Director";
        doc10.specialization = specializationOfAnita;
        doc10.experienceInYears = 40;
        doc10.fees = 2000;

       
        System.out.println("Name: " + doc10.name);
        System.out.println("Designation: " + doc10.designation);
        System.out.println("Specialization:");
        for (String specialize : doc10.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc10.experienceInYears);
        System.out.println("Fees: " + doc10.fees);
		
		  System.out.println("------------------------------------------------");

        // DDoctor 12
        Doctors doc11 = new Doctors();

        String[] specializationOfAnkur = {
                "Oncology",
                "Medical Oncology"
        };

        doc11.name = "Dr. Ankur BAHL";
        doc11.designation = "Principal Director";
        doc11.specialization = specializationOfAnkur;
        doc11.experienceInYears = 20;
        doc11.fees = 1800;

   
        System.out.println("Name: " + doc11.name);
        System.out.println("Designation: " + doc11.designation);
        System.out.println("Specialization:");
        for (String specialize : doc11.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc11.experienceInYears);
        System.out.println("Fees: " + doc11.fees);
		
		

    }

}
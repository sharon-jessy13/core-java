class PageFive {

    public static void main(String[] args) {

        // Doctor 1
        Doctors doc48 = new Doctors();

        String[] specializationOfRajinder = { "Urology", "Robotic Surgery", "Kidney Transplant",
                "Uro-Oncology", "Organ Transplant" };

        doc48.name = "Dr. Rajinder Yadav";
        doc48.designation = "Principal Director";
        doc48.specialization = specializationOfRajinder;
        doc48.experienceInYears = 42;
        doc48.fees = 2000;

        System.out.println("Name: " + doc48.name);
        System.out.println("Designation: " + doc48.designation);
        System.out.println("Specialization:");
        for (String specialize : doc48.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc48.experienceInYears);
        System.out.println("Fees: " + doc48.fees);
        System.out.println("------------------------------------------------");

        // Doctor 2
        Doctors doc49 = new Doctors();

        String[] specializationOfRakeshGupta = { "Radiology" };

        doc49.name = "Dr. Rakesh Kumar Gupta";
        doc49.designation = "Principal Director";
        doc49.specialization = specializationOfRakeshGupta;
        doc49.experienceInYears = 35;
        doc49.fees = 2000;

        System.out.println("Name: " + doc49.name);
        System.out.println("Designation: " + doc49.designation);
        System.out.println("Specialization:");
        for (String specialize : doc49.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc49.experienceInYears);
        System.out.println("Fees: " + doc49.fees);
        System.out.println("------------------------------------------------");

        // Doctor 3
        Doctors doc50 = new Doctors();

        String[] specializationOfRakeshDua = { "Neurosurgery", "Neuro and Spine Surgery" };

        doc50.name = "Dr. Rakesh Kumar Dua";
        doc50.designation = "Principal Director";
        doc50.specialization = specializationOfRakeshDua;
        doc50.experienceInYears = 25;
        doc50.fees = 2000;
        System.out.println("Name: " + doc50.name);
        System.out.println("Designation: " + doc50.designation);
        System.out.println("Specialization:");
        for (String specialize : doc50.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc50.experienceInYears);
        System.out.println("Fees: " + doc50.fees);
        System.out.println("------------------------------------------------");

        // Doctor 4
        Doctors doc51 = new Doctors();

        String[] specializationOfRama = { "Oncology", "Gynaecologic Oncology" };

        doc51.name = "Dr. Rama Joshi";
        doc51.designation = "Chairman";
        doc51.specialization = specializationOfRama;
        doc51.experienceInYears = 30;
        doc51.fees = 2000;

        System.out.println("Name: " + doc51.name);
        System.out.println("Designation: " + doc51.designation);
        System.out.println("Specialization:");
        for (String specialize : doc51.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc51.experienceInYears);
        System.out.println("Fees: " + doc51.fees);
        System.out.println("------------------------------------------------");

        // Doctor 5
        Doctors doc52 = new Doctors();

        String[] specializationOfRana = { "Neurosurgery", "Neuro and Spine Surgery" };

        doc52.name = "Dr. Rana Patir";
        doc52.designation = "Chairman";
        doc52.specialization = specializationOfRana;
        doc52.experienceInYears = 32;
        doc52.fees = 2000;

        System.out.println("Name: " + doc52.name);
        System.out.println("Designation: " + doc52.designation);
        System.out.println("Specialization:");
        for (String specialize : doc52.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc52.experienceInYears);
        System.out.println("Fees: " + doc52.fees);
        System.out.println("------------------------------------------------");

        // Doctor 6
        Doctors doc53 = new Doctors();

        String[] specializationOfSandeep = { "Neurosurgery", "Neuro and Spine Surgery" };

        doc53.name = "Dr. SANDEEP VAISHYA";
        doc53.designation = "Executive Director";
        doc53.specialization = specializationOfSandeep;
        doc53.experienceInYears = 30;
        doc53.fees = 2000;

        System.out.println("Name: " + doc53.name);
        System.out.println("Designation: " + doc53.designation);
        System.out.println("Specialization:");
        for (String specialize : doc53.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc53.experienceInYears);
        System.out.println("Fees: " + doc53.fees);
        System.out.println("------------------------------------------------");

        // Doctor 7
        Doctors doc54 = new Doctors();

        String[] specializationOfSalil = { "Organ Transplant", "Kidney Transplant", "Nephrology" };

        doc54.name = "Dr. Salil Jain";
        doc54.designation = "Principal Director";
        doc54.specialization = specializationOfSalil;
        doc54.experienceInYears = 25;
        doc54.fees = 2200;

        System.out.println("Name: " + doc54.name);
        System.out.println("Designation: " + doc54.designation);
        System.out.println("Specialization:");
        for (String specialize : doc54.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc54.experienceInYears);
        System.out.println("Fees: " + doc54.fees);
        System.out.println("------------------------------------------------");

        // Doctor 8
        Doctors doc55 = new Doctors();

        String[] specializationOfSanjeev = { "Organ Transplant", "Kidney Transplant", "Nephrology" };

        doc55.name = "Dr. Sanjeev Gulati";
        doc55.designation = "Chairman";
        doc55.specialization = specializationOfSanjeev;
        doc55.experienceInYears = 30;
        doc55.fees = 2200;

        System.out.println("Name: " + doc55.name);
        System.out.println("Designation: " + doc55.designation);
        System.out.println("Specialization:");
        for (String specialize : doc55.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc55.experienceInYears);
        System.out.println("Fees: " + doc55.fees);
        System.out.println("------------------------------------------------");

        // Doctor 9
        Doctors doc56 = new Doctors();

        doc56.name = "Dr. Sanjeev Gulati";
        doc56.designation = "Chairman";
        doc56.specialization = specializationOfSanjeev;
        doc56.experienceInYears = 31;
        doc56.fees = 2000;

        System.out.println("Name: " + doc56.name);
        System.out.println("Designation: " + doc56.designation);
        System.out.println("Specialization:");
        for (String specialize : doc56.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc56.experienceInYears);
        System.out.println("Fees: " + doc56.fees);
        System.out.println("------------------------------------------------");

        // Doctor 10
        Doctors doc57 = new Doctors();

        String[] specializationOfSatish = { "Internal Medicine", "General Physician" };

        doc57.name = "Dr. Satish Koul";
        doc57.designation = "Principal Director";
        doc57.specialization = specializationOfSatish;
        doc57.experienceInYears = 22;
        doc57.fees = 1800;

        System.out.println("Name: " + doc57.name);
        System.out.println("Designation: " + doc57.designation);
        System.out.println("Specialization:");
        for (String specialize : doc57.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc57.experienceInYears);
        System.out.println("Fees: " + doc57.fees);
        System.out.println("------------------------------------------------");

        // Doctor 11
        Doctors doc58 = new Doctors();

        String[] specializationOfShiv = { "Cardiac Sciences", "Adult CTVS (Cardiothoracic and Vascular Surgery)" };

        doc58.name = "Dr. Shiv Kumar Choudhary";
        doc58.designation = "Executive Director";
        doc58.specialization = specializationOfShiv;
        doc58.experienceInYears = 33;
        doc58.fees = 2000;

        System.out.println("Name: " + doc58.name);
        System.out.println("Designation: " + doc58.designation);
        System.out.println("Specialization:");
        for (String specialize : doc58.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc58.experienceInYears);
        System.out.println("Fees: " + doc58.fees);
        System.out.println("------------------------------------------------");

        // Doctor 12
        Doctors doc59 = new Doctors();

        String[] specializationOfSonal = { "Neurosurgery", "Neuro and Spine Surgery" };

        doc59.name = "Dr. Sonal Gupta";
        doc59.designation = "Principal Director";
        doc59.specialization = specializationOfSonal;
        doc59.experienceInYears = 28;
        doc59.fees = 2000;
        System.out.println("Name: " + doc59.name);
        System.out.println("Designation: " + doc59.designation);
        System.out.println("Specialization:");
        for (String specialize : doc59.specialization) {
            System.out.println(specialize);
        }
        System.out.println("Experience: " + doc59.experienceInYears);
        System.out.println("Fees: " + doc59.fees);

    }
}
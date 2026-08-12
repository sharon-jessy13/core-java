class SpecsRunner {

    public static void main(String[] specs) {

        Specs s1 = new Specs(1, "Ray-Ban", "Black", "Full Rim",
                2500, "Anti-Glare", "Round", 1.5,"Plastic", true);
        s1.display();


        Specs s2 = new Specs(2, "Titan", "Blue", "Half Rim",
                3000, "UV Protection", "Square", 2.0,"Metal", false);
        s2.display();


        Specs s3 = new Specs(3, "Fastrack", "Brown", "Rimless",1800, "Blue Cut", "Oval", 
				1.0,"Stainless Steel", true);
        s3.display();

    }
}
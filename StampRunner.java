class StampRunner {

    public static void main(String[] stamp) {

        Stamp s1 = new Stamp(1, "Approved", "Wood", "Blue",
                100, "Medium", "Office", "Trodat","Office Use", true);
        s1.display();


        Stamp s2 = new Stamp(2, "Paid", "Plastic", "Red",
                150, "Small", "Office", "Colop","Billing", true);
        s2.display();


        Stamp s3 = new Stamp(3, "Verified", "Wood", "Black",
                120, "Large", "Official", "Trodat","Documentation", false);
        s3.display();

    }
}
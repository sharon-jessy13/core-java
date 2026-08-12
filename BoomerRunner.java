class BoomerRunner {

    public static void main(String[] boomer) {

        Boomer b1 = new Boomer(1, "Strawberry", "Boomer", 10,
                "Pink", 5, "Chewing Gum", "Packet", 25, false);
        b1.display();


        Boomer b2 = new Boomer(2, "Watermelon", "Boomer", 20,
                "Green", 10, "Chewing Gum", "Box", 50, false);
        b2.display();


        Boomer b3 = new Boomer(3, "Mint", "Boomer", 15,
                "White", 7, "Chewing Gum", "Packet", 35, true);
        b3.display();

    }
}
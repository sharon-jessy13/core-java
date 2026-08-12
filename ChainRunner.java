class ChainRunner {

    public static void main(String[] chain) {

        Chain c1 = new Chain(1, "Gold", "Yellow", 25000, "Tanishq",
                20.5, 25, "Classic", "Neck Chain", true);
        c1.display();


        Chain c2 = new Chain(2, "Silver", "Silver", 5000, "Malabar",
                18.5, 20, "Designer", "Neck Chain", false);
        c2.display();


        Chain c3 = new Chain(3, "Gold", "Rose Gold", 30000, "Kalyan",
                22.5, 30, "Traditional", "Long Chain", true);
        c3.display();

    }
}
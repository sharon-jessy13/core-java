class UmbrellaRunner {

    public static void main(String[] umbrella) {

        Umbrella u1 = new Umbrella(1, "Puma", "Black", 1200,
                "Nylon", 70, 8, "Straight", "Foldable", true);
        u1.display();


        Umbrella u2 = new Umbrella(2, "Wildcraft", "Blue", 1500,
                "Polyester", 65, 10, "Curved", "Rain Umbrella", true);
        u2.display();


        Umbrella u3 = new Umbrella(3, "Totes", "Red", 1000,
                "Nylon", 60, 8, "Automatic", "Compact", true);
        u3.display();

    }
}
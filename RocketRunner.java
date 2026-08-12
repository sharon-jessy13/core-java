class RocketRunner {

    public static void main(String[] rocket) {

        Rocket r1 = new Rocket(1, "PSLV", "India", 44.4,
                320000, "Solid Fuel", 4, 7800,"ISRO", false);
        r1.display();


        Rocket r2 = new Rocket(2, "Falcon 9", "USA", 70,
                549000, "Liquid Fuel", 2, 10000,"SpaceX", true);
        r2.display();


        Rocket r3 = new Rocket(3, "Ariane 5", "France", 53,
                777000, "Liquid Fuel", 2, 9000,"Arianespace", false);
        r3.display();

    }
}
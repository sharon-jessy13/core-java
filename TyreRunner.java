class TyreRunner {

    public static void main(String[] tyre) {

        Tyre t1 = new Tyre(1, "MRF", "ZVTV", 4500,
                15, "Car", "Rubber", 5,"All Terrain", true);
        t1.display();


        Tyre t2 = new Tyre(2, "CEAT", "Milaze", 4000,
                14, "Car", "Rubber", 4,"Highway", true);
        t2.display();


        Tyre t3 = new Tyre(3, "Bridgestone", "Ecopia", 5500,
                16, "Car", "Synthetic Rubber", 5,"Performance", true);
        t3.display();

    }
}
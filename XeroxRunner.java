class XeroxRunner {

    public static void main(String[] xerox) {

        Xerox x1 = new Xerox(1, "Canon", "IR 2000", 50000,
                "White", 30, "A4", "Laser", 500, true);
        x1.display();


        Xerox x2 = new Xerox(2, "HP", "LaserJet Pro", 45000,
                "Black", 25, "A4", "Laser", 400, true);
        x2.display();


        Xerox x3 = new Xerox(3, "Xerox", "WorkCentre", 60000,
                "Grey", 35, "A3", "Laser", 600, true);
        x3.display();

    }
}
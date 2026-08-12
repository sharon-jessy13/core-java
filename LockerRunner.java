class LockerRunner {

    public static void main(String[] locker) {

        Locker l1 = new Locker(1, "Godrej", "Steel", "Grey",
                15000, "Digital", 100, "Electronic", 120, true);
        l1.display();


        Locker l2 = new Locker(2, "Ozone", "Iron", "Black",
                12000, "Key Lock", 80, "Key", 100, false);
        l2.display();


        Locker l3 = new Locker(3, "Yale", "Steel", "White",
                20000, "Digital", 150, "Fingerprint", 140, true);
        l3.display();

    }
}
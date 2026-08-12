class SoftDrinkRunner {

    public static void main(String[] drink) {

        SoftDrink s1 = new SoftDrink(1, "Coke", "Coca-Cola",
                "Cola", 40, 500, "Plastic", "Black",39, true);
        s1.display();


        SoftDrink s2 = new SoftDrink(2, "Sprite", "Coca-Cola",
                "Lemon", 40, 500, "Plastic", "Transparent",38, true);
        s2.display();


        SoftDrink s3 = new SoftDrink(3, "Fanta", "Coca-Cola",
                "Orange", 40, 500, "Plastic", "Orange",44, true);
        s3.display();

    }
}
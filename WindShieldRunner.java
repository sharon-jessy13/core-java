class WindShieldRunner {

    public static void main(String[] wind) {

        WindShield w1 = new WindShield(1, "Saint-Gobain","Maruti Swift", 
				"Laminated Glass", 8000,"Transparent", 70, 140, "Laminated", false);
        w1.display();


        WindShield w2 = new WindShield(2, "AIS","Hyundai i20", "Tempered Glass", 
				9000,"Green", 72, 145, "Tempered", true);
        w2.display();


        WindShield w3 = new WindShield(3, "Pilkington","Toyota Innova",
				"Laminated Glass", 12000,"Blue", 75, 150, "Laminated", true);
        w3.display();

    }
}
class LocketRunner{
	
	public static void main(String[] lock) {

        Locket l1 = new Locket(1, "Gold", "Yellow", 5000, "Tanishq",
                "Heart", "Simple", 10, "Medium", true);
		l1.display();
		 
		 
		 
        Locket l2 = new Locket(2, "Silver", "Silver", 2500, "Malabar",
                "Round", "Designer", 15, "Large", false);
	    l2.display();



        Locket l3 = new Locket(3, "Gold", "Rose Gold", 7000, "Kalyan",
                "Oval", "Traditional", 12, "Small", true);
        l3.display();
		
		
    }
}
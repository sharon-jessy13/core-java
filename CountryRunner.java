class CountryRunner {
	
	public static void main(String[] world){
		
		String[] names = Country.stateNames("India");
		

		for (String name : names){
			System.out.println(name);
		}
	}
}
class KarnatakaRunner {
	
	public static void main (String pcode[]){
		
		int[] pincodesOfCity = Karnataka.getPinCodesByCity("abcd");

		for (int pincode : pincodesOfCity){
			System.out.println(pincode);
			
		}
		
		
	}

}
class CollegeRunner {
	
	public static void main (String[] clgNames){

		String[] departments =  College.getDepartments("Government Engineering College, Challakere");
		
		if(departments != null){
			for(String departement : departments){
				System.out.println(departement);
			}
		}
		
		
	}
}
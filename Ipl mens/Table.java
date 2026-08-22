class Table{
	
	Season seasons[];
	
	public void getTableInfo(){
		System.out.println("----------table--------");
		
		for (Season season : seasons){
		  season.getSeasonInfo();
		}
		
	}
}
class Meeting {
	
	String title;
	
	Invitee invitee;
	
	String date;
	String startTime;
	String endTime;
	String duration;
	boolean isAllDayEvent;
	
	
	public void getMeetingDetails(){
		System.out.println("Printing Meeting details ");
		
		System.out.println("Title : " + title);
		System.out.println("Date : " + date);
		System.out.println("Start time : " + startTime);
		System.out.println("end time : " + endTime);
		System.out.println("duration : " + duration);
		System.out.println("is event available all day  : " + isAllDayEvent);
		
		invitee.printInviteeDetails();
		
	}
	
}
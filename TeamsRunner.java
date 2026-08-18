class TeamsRunner{
	
	public static void main (String[] args){
		
		Teams teams = new Teams();
		
		Calendar calendar = new Calendar();
		
		Meeting meeting = new Meeting();
		meeting.title = " stand up call ";
		meeting.date = "19/08/2026";
		meeting.startTime = "06:00 PM";
		meeting.endTime = "06:30 PM";
		meeting.duration = "30 min";
		meeting.isAllDayEvent = false ;
		
		Invitee invitee = new Invitee();
		invitee.email = "sharon@gmail.com";
		invitee.name = "Sharon Jessy T S";
		invitee.phoneNumber = 9876543210L;
		
		
		meeting.invitee = invitee;
		
		calendar.meeting = meeting;
		
		teams.calendar = calendar;
		
		teams.printTeamDetails();
		
	}
}
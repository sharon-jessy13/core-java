class IplRunner{
	
	public static void main(String[] args){
		Ipl ipl = new Ipl();
		
		Table table = new Table();
		
		Season season = new Season();
		season.name = 2026;
		
		//RCB
		Teams rcb = new Teams();
		
		rcb.name = "RCB";
		rcb.noOfmatches = 8;
		rcb.won = 6;
		rcb.loss = 2;
		rcb.nrr = "+1.247";
		rcb.pts = 12;
		String rcblast5[] = {"yes", "yes", "no", "no", "yes"};
		rcb.lastFive = rcblast5;
		
		//GG
		Teams gg = new Teams();
		
		gg.name = "GG ";
		gg.noOfmatches = 8;
		gg.won = 5;
		gg.loss = 3;
		gg.nrr = "-0.168";
		gg.pts = 10;
		String gglast5[] = { "no", "no","yes", "yes", "yes"};
		gg.lastFive = gglast5;
		
		//DC
		Teams dc = new Teams();
		
		dc.name = "DC ";
		dc.noOfmatches = 8;
		dc.won = 4;
		dc.loss = 4;
		dc.nrr = "-0.055";
		dc.pts = 8;
		String dclast5[] = {"no", "yes", "yes", "no", "yes"};
		dc.lastFive = dclast5;
		
		//MI
		Teams mi = new Teams();
		
		mi.name = "MI ";
		mi.noOfmatches = 8;
		mi.won = 3;
		mi.loss = 5;
		mi.nrr = "+0.059";
		mi.pts = 6;
		String milast5[] = {"no", "no", "no", "yes", "no"};
		mi.lastFive = milast5;
		
		
		//UPW
		Teams upw = new Teams();
		
		upw.name = "UPW";
		upw.noOfmatches = 8;
		upw.won = 2;
		upw.loss = 6;
		upw.nrr = "-1.076";
		upw.pts = 4;
		String upwlast5[] = {"yes", "yes", "no", "no", "no"};
		upw.lastFive = upwlast5;
		
		
		Teams teams[] = {rcb , gg, dc, mi, upw};
		
		season.teams = teams;
		
		table.season = season;
		
		ipl.table = table;
		
		ipl.getIplInfo();
	}
	
	
}
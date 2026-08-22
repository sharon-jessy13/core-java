class IplRunner{

	public static void main(String[] args){
		Ipl ipl = new Ipl();

		Table table = new Table();

		//2008
		Season seasonone = new Season();
		seasonone.name = 2008;

		Team rrone = new Team();

		rrone.name = "RR";
		rrone.noOfmatches = 14;
		rrone.won = 11;
		rrone.loss = 3;
		rrone.nrr = "+0.632";
		rrone.pts = 22;
		String rronelast5[] = {"yes", "yes", "yes", "yes", "no"};
		rrone.lastFive = rronelast5;

		Team kxipone = new Team();

		kxipone.name = "KXIP";
		kxipone.noOfmatches = 14;
		kxipone.won = 10;
		kxipone.loss = 4;
		kxipone.nrr = "+0.509";
		kxipone.pts = 20;
		String kxiponelast5[] = {"yes", "yes", "yes", "no", "yes"};
		kxipone.lastFive = kxiponelast5;

		Team cskone = new Team();

		cskone.name = "CSK";
		cskone.noOfmatches = 14;
		cskone.won = 8;
		cskone.loss = 6;
		cskone.nrr = "-0.192";
		cskone.pts = 16;
		String cskonelast5[] = {"no", "yes", "no", "no", "yes"};
		cskone.lastFive = cskonelast5;

		Team ddone = new Team();

		ddone.name = "DD";
		ddone.noOfmatches = 14;
		ddone.won = 7;
		ddone.loss = 6;
		ddone.nrr = "+0.342";
		ddone.pts = 15;
		String ddonelast5[] = {"yes", "no", "yes", "NR", "yes"};
		ddone.lastFive = ddonelast5;

		Team mione = new Team();

		mione.name = "MI";
		mione.noOfmatches = 14;
		mione.won = 7;
		mione.loss = 7;
		mione.nrr = "+0.570";
		mione.pts = 14;
		String mionelast5[] = {"yes", "no", "no", "no", "yes"};
		mione.lastFive = mionelast5;

		Team kkrone = new Team();

		kkrone.name = "KKR";
		kkrone.noOfmatches = 14;
		kkrone.won = 6;
		kkrone.loss = 7;
		kkrone.nrr = "-0.147";
		kkrone.pts = 13;
		String kkronelast5[] = {"no", "no", "no", "NR", "yes"};
		kkrone.lastFive = kkronelast5;

		Team rcbone = new Team();

		rcbone.name = "RCB";
		rcbone.noOfmatches = 14;
		rcbone.won = 4;
		rcbone.loss = 10;
		rcbone.nrr = "-1.160";
		rcbone.pts = 8;
		String rcbonelast5[] = {"no", "no", "yes", "yes", "no"};
		rcbone.lastFive = rcbonelast5;

		Team dchone = new Team();

		dchone.name = "DCH";
		dchone.noOfmatches = 14;
		dchone.won = 2;
		dchone.loss = 12;
		dchone.nrr = "-0.467";
		dchone.pts = 4;
		String dchonelast5[] = {"no", "no", "no", "no", "no"};
		dchone.lastFive = dchonelast5;

		Team teams2008[] = {rrone, kxipone, cskone, ddone, mione, kkrone, rcbone, dchone};

		seasonone.teams = teams2008;

		//2009
		Season seasontwo = new Season();
		seasontwo.name = 2009;

		Team ddtwo = new Team();

		ddtwo.name = "DD";
		ddtwo.noOfmatches = 14;
		ddtwo.won = 10;
		ddtwo.loss = 4;
		ddtwo.nrr = "+0.311";
		ddtwo.pts = 20;
		String ddtwolast5[] = {"yes", "no", "yes", "no", "yes"};
		ddtwo.lastFive = ddtwolast5;

		Team csktwo = new Team();

		csktwo.name = "CSK";
		csktwo.noOfmatches = 14;
		csktwo.won = 8;
		csktwo.loss = 5;
		csktwo.nrr = "+0.951";
		csktwo.pts = 17;
		String csktwolast5[] = {"yes", "no", "yes", "no", "yes"};
		csktwo.lastFive = csktwolast5;

		Team rcbtwo = new Team();

		rcbtwo.name = "RCB";
		rcbtwo.noOfmatches = 14;
		rcbtwo.won = 8;
		rcbtwo.loss = 6;
		rcbtwo.nrr = "-0.191";
		rcbtwo.pts = 16;
		String rcbtwolast5[] = {"no", "yes", "yes", "yes", "yes"};
		rcbtwo.lastFive = rcbtwolast5;

		Team dchtwo = new Team();

		dchtwo.name = "DCH";
		dchtwo.noOfmatches = 14;
		dchtwo.won = 7;
		dchtwo.loss = 7;
		dchtwo.nrr = "+0.203";
		dchtwo.pts = 14;
		String dchtwolast5[] = {"yes", "no", "yes", "no", "no"};
		dchtwo.lastFive = dchtwolast5;

		Team kxiptwo = new Team();

		kxiptwo.name = "KXIP";
		kxiptwo.noOfmatches = 14;
		kxiptwo.won = 7;
		kxiptwo.loss = 7;
		kxiptwo.nrr = "-0.483";
		kxiptwo.pts = 14;
		String kxiptwolast5[] = {"yes", "no", "yes", "yes", "no"};
		kxiptwo.lastFive = kxiptwolast5;

		Team rrtwo = new Team();

		rrtwo.name = "RR";
		rrtwo.noOfmatches = 14;
		rrtwo.won = 6;
		rrtwo.loss = 7;
		rrtwo.nrr = "-0.352";
		rrtwo.pts = 13;
		String rrtwolast5[] = {"no", "no", "yes", "no", "no"};
		rrtwo.lastFive = rrtwolast5;

		Team mitwo = new Team();

		mitwo.name = "MI";
		mitwo.noOfmatches = 14;
		mitwo.won = 5;
		mitwo.loss = 8;
		mitwo.nrr = "+0.297";
		mitwo.pts = 11;
		String mitwolast5[] = {"yes", "yes", "no", "no", "no"};
		mitwo.lastFive = mitwolast5;

		Team kkrtwo = new Team();

		kkrtwo.name = "KKR";
		kkrtwo.noOfmatches = 14;
		kkrtwo.won = 3;
		kkrtwo.loss = 10;
		kkrtwo.nrr = "-0.789";
		kkrtwo.pts = 7;
		String kkrtwolast5[] = {"no", "no", "no", "yes", "yes"};
		kkrtwo.lastFive = kkrtwolast5;

		Team teams2009[] = {ddtwo, csktwo, rcbtwo, dchtwo, kxiptwo, rrtwo, mitwo, kkrtwo};

		seasontwo.teams = teams2009;

		//2010
		Season seasonthree = new Season();
		seasonthree.name = 2010;

		Team mithree = new Team();

		mithree.name = "MI";
		mithree.noOfmatches = 14;
		mithree.won = 10;
		mithree.loss = 4;
		mithree.nrr = "+1.084";
		mithree.pts = 20;
		String mithreelast5[] = {"no", "yes", "yes", "yes", "no"};
		mithree.lastFive = mithreelast5;

		Team dchthree = new Team();

		dchthree.name = "DCH";
		dchthree.noOfmatches = 14;
		dchthree.won = 8;
		dchthree.loss = 6;
		dchthree.nrr = "-0.297";
		dchthree.pts = 16;
		String dchthreelast5[] = {"yes", "yes", "yes", "yes", "yes"};
		dchthree.lastFive = dchthreelast5;

		Team cskthree = new Team();

		cskthree.name = "CSK";
		cskthree.noOfmatches = 14;
		cskthree.won = 7;
		cskthree.loss = 7;
		cskthree.nrr = "+0.274";
		cskthree.pts = 14;
		String cskthreelast5[] = {"yes", "no", "yes", "no", "yes"};
		cskthree.lastFive = cskthreelast5;

		Team rcbthree = new Team();

		rcbthree.name = "RCB";
		rcbthree.noOfmatches = 14;
		rcbthree.won = 7;
		rcbthree.loss = 7;
		rcbthree.nrr = "+0.219";
		rcbthree.pts = 14;
		String rcbthreelast5[] = {"no", "yes", "no", "yes", "no"};
		rcbthree.lastFive = rcbthreelast5;

		Team ddthree = new Team();

		ddthree.name = "DD";
		ddthree.noOfmatches = 14;
		ddthree.won = 7;
		ddthree.loss = 7;
		ddthree.nrr = "+0.021";
		ddthree.pts = 14;
		String ddthreelast5[] = {"no", "no", "no", "yes", "no"};
		ddthree.lastFive = ddthreelast5;

		Team kkrthree = new Team();

		kkrthree.name = "KKR";
		kkrthree.noOfmatches = 14;
		kkrthree.won = 7;
		kkrthree.loss = 7;
		kkrthree.nrr = "-0.341";
		kkrthree.pts = 14;
		String kkrthreelast5[] = {"yes", "no", "no", "yes", "yes"};
		kkrthree.lastFive = kkrthreelast5;

		Team rrthree = new Team();

		rrthree.name = "RR";
		rrthree.noOfmatches = 14;
		rrthree.won = 6;
		rrthree.loss = 8;
		rrthree.nrr = "-0.514";
		rrthree.pts = 12;
		String rrthreelast5[] = {"yes", "yes", "no", "no", "no"};
		rrthree.lastFive = rrthreelast5;

		Team kxipthree = new Team();

		kxipthree.name = "KXIP";
		kxipthree.noOfmatches = 14;
		kxipthree.won = 4;
		kxipthree.loss = 10;
		kxipthree.nrr = "-0.478";
		kxipthree.pts = 8;
		String kxipthreelast5[] = {"no", "yes", "yes", "no", "no"};
		kxipthree.lastFive = kxipthreelast5;

		Team teams2010[] = {mithree, dchthree, cskthree, rcbthree, ddthree, kkrthree, rrthree, kxipthree};

		seasonthree.teams = teams2010;

		//2011
		Season seasonfour = new Season();
		seasonfour.name = 2011;

		Team rcbfour = new Team();

		rcbfour.name = "RCB";
		rcbfour.noOfmatches = 14;
		rcbfour.won = 9;
		rcbfour.loss = 4;
		rcbfour.nrr = "+0.326";
		rcbfour.pts = 19;
		String rcbfourlast5[] = {"yes", "yes", "yes", "no", "yes"};
		rcbfour.lastFive = rcbfourlast5;

		Team cskfour = new Team();

		cskfour.name = "CSK";
		cskfour.noOfmatches = 14;
		cskfour.won = 9;
		cskfour.loss = 5;
		cskfour.nrr = "+0.443";
		cskfour.pts = 18;
		String cskfourlast5[] = {"no", "yes", "yes", "yes", "no"};
		cskfour.lastFive = cskfourlast5;

		Team mifour = new Team();

		mifour.name = "MI";
		mifour.noOfmatches = 14;
		mifour.won = 9;
		mifour.loss = 5;
		mifour.nrr = "+0.040";
		mifour.pts = 18;
		String mifourlast5[] = {"yes", "no", "no", "no", "yes"};
		mifour.lastFive = mifourlast5;

		Team kkrfour = new Team();

		kkrfour.name = "KKR";
		kkrfour.noOfmatches = 14;
		kkrfour.won = 8;
		kkrfour.loss = 6;
		kkrfour.nrr = "+0.433";
		kkrfour.pts = 16;
		String kkrfourlast5[] = {"no", "yes", "no", "yes", "no"};
		kkrfour.lastFive = kkrfourlast5;

		Team kxipfour = new Team();

		kxipfour.name = "KXIP";
		kxipfour.noOfmatches = 14;
		kxipfour.won = 7;
		kxipfour.loss = 7;
		kxipfour.nrr = "-0.051";
		kxipfour.pts = 14;
		String kxipfourlast5[] = {"yes", "yes", "yes", "yes", "no"};
		kxipfour.lastFive = kxipfourlast5;

		Team rrfour = new Team();

		rrfour.name = "RR";
		rrfour.noOfmatches = 14;
		rrfour.won = 6;
		rrfour.loss = 7;
		rrfour.nrr = "-0.691";
		rrfour.pts = 13;
		String rrfourlast5[] = {"no", "no", "no", "no", "yes"};
		rrfour.lastFive = rrfourlast5;

		Team dchfour = new Team();

		dchfour.name = "DCH";
		dchfour.noOfmatches = 14;
		dchfour.won = 6;
		dchfour.loss = 8;
		dchfour.nrr = "+0.222";
		dchfour.pts = 12;
		String dchfourlast5[] = {"no", "no", "yes", "yes", "yes"};
		dchfour.lastFive = dchfourlast5;

		Team ktkfour = new Team();

		ktkfour.name = "KTK";
		ktkfour.noOfmatches = 14;
		ktkfour.won = 6;
		ktkfour.loss = 8;
		ktkfour.nrr = "-0.214";
		ktkfour.pts = 12;
		String ktkfourlast5[] = {"yes", "no", "no", "yes", "no"};
		ktkfour.lastFive = ktkfourlast5;

		Team pwifour = new Team();

		pwifour.name = "PWI";
		pwifour.noOfmatches = 14;
		pwifour.won = 4;
		pwifour.loss = 9;
		pwifour.nrr = "-0.134";
		pwifour.pts = 9;
		String pwifourlast5[] = {"yes", "yes", "no", "no", "NR"};
		pwifour.lastFive = pwifourlast5;

		Team ddfour = new Team();

		ddfour.name = "DD";
		ddfour.noOfmatches = 14;
		ddfour.won = 4;
		ddfour.loss = 9;
		ddfour.nrr = "-0.448";
		ddfour.pts = 9;
		String ddfourlast5[] = {"yes", "no", "no", "no", "NR"};
		ddfour.lastFive = ddfourlast5;

		Team teams2011[] = {rcbfour, cskfour, mifour, kkrfour, kxipfour, rrfour, dchfour, ktkfour, pwifour, ddfour};

		seasonfour.teams = teams2011;

		//2012
		Season seasonfive = new Season();
		seasonfive.name = 2012;

		Team ddfive = new Team();

		ddfive.name = "DD";
		ddfive.noOfmatches = 16;
		ddfive.won = 11;
		ddfive.loss = 5;
		ddfive.nrr = "+0.617";
		ddfive.pts = 22;
		String ddfivelast5[] = {"yes", "no", "yes", "no", "yes"};
		ddfive.lastFive = ddfivelast5;

		Team kkrfive = new Team();

		kkrfive.name = "KKR";
		kkrfive.noOfmatches = 16;
		kkrfive.won = 10;
		kkrfive.loss = 5;
		kkrfive.nrr = "+0.561";
		kkrfive.pts = 21;
		String kkrfivelast5[] = {"yes", "no", "no", "yes", "yes"};
		kkrfive.lastFive = kkrfivelast5;

		Team mifive = new Team();

		mifive.name = "MI";
		mifive.noOfmatches = 16;
		mifive.won = 10;
		mifive.loss = 6;
		mifive.nrr = "-0.100";
		mifive.pts = 20;
		String mifivelast5[] = {"no", "yes", "yes", "no", "yes"};
		mifive.lastFive = mifivelast5;

		Team cskfive = new Team();

		cskfive.name = "CSK";
		cskfive.noOfmatches = 16;
		cskfive.won = 8;
		cskfive.loss = 7;
		cskfive.nrr = "+0.100";
		cskfive.pts = 17;
		String cskfivelast5[] = {"no", "yes", "yes", "yes", "no"};
		cskfive.lastFive = cskfivelast5;

		Team rcbfive = new Team();

		rcbfive.name = "RCB";
		rcbfive.noOfmatches = 16;
		rcbfive.won = 8;
		rcbfive.loss = 7;
		rcbfive.nrr = "-0.022";
		rcbfive.pts = 17;
		String rcbfivelast5[] = {"yes", "yes", "no", "yes", "no"};
		rcbfive.lastFive = rcbfivelast5;

		Team kxipfive = new Team();

		kxipfive.name = "KXIP";
		kxipfive.noOfmatches = 16;
		kxipfive.won = 8;
		kxipfive.loss = 8;
		kxipfive.nrr = "-0.216";
		kxipfive.pts = 16;
		String kxipfivelast5[] = {"yes", "yes", "no", "yes", "no"};
		kxipfive.lastFive = kxipfivelast5;

		Team rrfive = new Team();

		rrfive.name = "RR";
		rrfive.noOfmatches = 16;
		rrfive.won = 7;
		rrfive.loss = 9;
		rrfive.nrr = "+0.201";
		rrfive.pts = 14;
		String rrfivelast5[] = {"yes", "no", "yes", "no", "no"};
		rrfive.lastFive = rrfivelast5;

		Team dchfive = new Team();

		dchfive.name = "DCH";
		dchfive.noOfmatches = 16;
		dchfive.won = 4;
		dchfive.loss = 11;
		dchfive.nrr = "-0.509";
		dchfive.pts = 9;
		String dchfivelast5[] = {"no", "no", "no", "yes", "yes"};
		dchfive.lastFive = dchfivelast5;

		Team pwifive = new Team();

		pwifive.name = "PWI";
		pwifive.noOfmatches = 16;
		pwifive.won = 4;
		pwifive.loss = 12;
		pwifive.nrr = "-0.551";
		pwifive.pts = 8;
		String pwifivelast5[] = {"no", "no", "no", "no", "no"};
		pwifive.lastFive = pwifivelast5;

		Team teams2012[] = {ddfive, kkrfive, mifive, cskfive, rcbfive, kxipfive, rrfive, dchfive, pwifive};

		seasonfive.teams = teams2012;

		//2013
		Season seasonsix = new Season();
		seasonsix.name = 2013;

		Team csksix = new Team();

		csksix.name = "CSK";
		csksix.noOfmatches = 16;
		csksix.won = 11;
		csksix.loss = 5;
		csksix.nrr = "+0.530";
		csksix.pts = 22;
		String csksixlast5[] = {"no", "yes", "no", "yes", "no"};
		csksix.lastFive = csksixlast5;

		Team misix = new Team();

		misix.name = "MI";
		misix.noOfmatches = 16;
		misix.won = 11;
		misix.loss = 5;
		misix.nrr = "+0.441";
		misix.pts = 22;
		String misixlast5[] = {"yes", "yes", "yes", "yes", "no"};
		misix.lastFive = misixlast5;

		Team rrsix = new Team();

		rrsix.name = "RR";
		rrsix.noOfmatches = 16;
		rrsix.won = 10;
		rrsix.loss = 6;
		rrsix.nrr = "+0.322";
		rrsix.pts = 20;
		String rrsixlast5[] = {"yes", "yes", "yes", "no", "no"};
		rrsix.lastFive = rrsixlast5;

		Team srhsix = new Team();

		srhsix.name = "SRH";
		srhsix.noOfmatches = 16;
		srhsix.won = 10;
		srhsix.loss = 6;
		srhsix.nrr = "+0.003";
		srhsix.pts = 20;
		String srhsixlast5[] = {"no", "yes", "no", "yes", "yes"};
		srhsix.lastFive = srhsixlast5;

		Team rcbsix = new Team();

		rcbsix.name = "RCB";
		rcbsix.noOfmatches = 16;
		rcbsix.won = 9;
		rcbsix.loss = 7;
		rcbsix.nrr = "+0.457";
		rcbsix.pts = 18;
		String rcbsixlast5[] = {"no", "yes", "no", "no", "yes"};
		rcbsix.lastFive = rcbsixlast5;

		Team kxipsix = new Team();

		kxipsix.name = "KXIP";
		kxipsix.noOfmatches = 16;
		kxipsix.won = 8;
		kxipsix.loss = 8;
		kxipsix.nrr = "+0.226";
		kxipsix.pts = 16;
		String kxipsixlast5[] = {"no", "no", "yes", "yes", "yes"};
		kxipsix.lastFive = kxipsixlast5;

		Team kkrsix = new Team();

		kkrsix.name = "KKR";
		kkrsix.noOfmatches = 16;
		kkrsix.won = 6;
		kkrsix.loss = 10;
		kkrsix.nrr = "-0.095";
		kkrsix.pts = 12;
		String kkrsixlast5[] = {"no", "yes", "yes", "no", "no"};
		kkrsix.lastFive = kkrsixlast5;

		Team pwisix = new Team();

		pwisix.name = "PWI";
		pwisix.noOfmatches = 16;
		pwisix.won = 4;
		pwisix.loss = 12;
		pwisix.nrr = "-1.006";
		pwisix.pts = 8;
		String pwisixlast5[] = {"no", "no", "no", "yes", "yes"};
		pwisix.lastFive = pwisixlast5;

		Team ddsix = new Team();

		ddsix.name = "DD";
		ddsix.noOfmatches = 16;
		ddsix.won = 3;
		ddsix.loss = 13;
		ddsix.nrr = "-0.848";
		ddsix.pts = 6;
		String ddsixlast5[] = {"no", "no", "no", "no", "no"};
		ddsix.lastFive = ddsixlast5;

		Team teams2013[] = {csksix, misix, rrsix, srhsix, rcbsix, kxipsix, kkrsix, pwisix, ddsix};

		seasonsix.teams = teams2013;

		//2014
		Season seasonseven = new Season();
		seasonseven.name = 2014;

		Team kxipseven = new Team();

		kxipseven.name = "KXIP";
		kxipseven.noOfmatches = 14;
		kxipseven.won = 11;
		kxipseven.loss = 3;
		kxipseven.nrr = "+0.968";
		kxipseven.pts = 22;
		String kxipsevenlast5[] = {"yes", "yes", "no", "yes", "yes"};
		kxipseven.lastFive = kxipsevenlast5;

		Team kkrseven = new Team();

		kkrseven.name = "KKR";
		kkrseven.noOfmatches = 14;
		kkrseven.won = 9;
		kkrseven.loss = 5;
		kkrseven.nrr = "+0.418";
		kkrseven.pts = 18;
		String kkrsevenlast5[] = {"yes", "yes", "yes", "yes", "yes"};
		kkrseven.lastFive = kkrsevenlast5;

		Team cskseven = new Team();

		cskseven.name = "CSK";
		cskseven.noOfmatches = 14;
		cskseven.won = 9;
		cskseven.loss = 5;
		cskseven.nrr = "+0.385";
		cskseven.pts = 18;
		String csksevenlast5[] = {"yes", "no", "no", "no", "yes"};
		cskseven.lastFive = csksevenlast5;

		Team miseven = new Team();

		miseven.name = "MI";
		miseven.noOfmatches = 14;
		miseven.won = 7;
		miseven.loss = 7;
		miseven.nrr = "+0.095";
		miseven.pts = 14;
		String misevenlast5[] = {"no", "yes", "yes", "yes", "yes"};
		miseven.lastFive = misevenlast5;

		Team rrseven = new Team();

		rrseven.name = "RR";
		rrseven.noOfmatches = 14;
		rrseven.won = 7;
		rrseven.loss = 7;
		rrseven.nrr = "+0.060";
		rrseven.pts = 14;
		String rrsevenlast5[] = {"no", "yes", "no", "no", "no"};
		rrseven.lastFive = rrsevenlast5;

		Team srhseven = new Team();

		srhseven.name = "SRH";
		srhseven.noOfmatches = 14;
		srhseven.won = 6;
		srhseven.loss = 8;
		srhseven.nrr = "-0.399";
		srhseven.pts = 12;
		String srhsevenlast5[] = {"no", "no", "yes", "yes", "no"};
		srhseven.lastFive = srhsevenlast5;

		Team rcbseven = new Team();

		rcbseven.name = "RCB";
		rcbseven.noOfmatches = 14;
		rcbseven.won = 5;
		rcbseven.loss = 9;
		rcbseven.nrr = "-0.428";
		rcbseven.pts = 10;
		String rcbsevenlast5[] = {"yes", "yes", "no", "no", "no"};
		rcbseven.lastFive = rcbsevenlast5;

		Team ddseven = new Team();

		ddseven.name = "DD";
		ddseven.noOfmatches = 14;
		ddseven.won = 2;
		ddseven.loss = 12;
		ddseven.nrr = "-1.182";
		ddseven.pts = 4;
		String ddsevenlast5[] = {"no", "no", "no", "no", "no"};
		ddseven.lastFive = ddsevenlast5;

		Team teams2014[] = {kxipseven, kkrseven, cskseven, miseven, rrseven, srhseven, rcbseven, ddseven};

		seasonseven.teams = teams2014;

		//2015
		Season seasoneight = new Season();
		seasoneight.name = 2015;

		Team cskeight = new Team();

		cskeight.name = "CSK";
		cskeight.noOfmatches = 14;
		cskeight.won = 9;
		cskeight.loss = 5;
		cskeight.nrr = "+0.709";
		cskeight.pts = 18;
		String cskeightlast5[] = {"yes", "no", "yes", "no", "yes"};
		cskeight.lastFive = cskeightlast5;

		Team mieight = new Team();

		mieight.name = "MI";
		mieight.noOfmatches = 14;
		mieight.won = 8;
		mieight.loss = 6;
		mieight.nrr = "-0.043";
		mieight.pts = 16;
		String mieightlast5[] = {"yes", "yes", "no", "yes", "yes"};
		mieight.lastFive = mieightlast5;

		Team rcbeight = new Team();

		rcbeight.name = "RCB";
		rcbeight.noOfmatches = 14;
		rcbeight.won = 7;
		rcbeight.loss = 5;
		rcbeight.nrr = "+1.037";
		rcbeight.pts = 16;
		String rcbeightlast5[] = {"yes", "yes", "no", "yes", "NR"};
		rcbeight.lastFive = rcbeightlast5;

		Team rreight = new Team();

		rreight.name = "RR";
		rreight.noOfmatches = 14;
		rreight.won = 7;
		rreight.loss = 5;
		rreight.nrr = "+0.062";
		rreight.pts = 16;
		String rreightlast5[] = {"no", "yes", "no", "no", "yes"};
		rreight.lastFive = rreightlast5;

		Team kkreight = new Team();

		kkreight.name = "KKR";
		kkreight.noOfmatches = 14;
		kkreight.won = 7;
		kkreight.loss = 6;
		kkreight.nrr = "+0.253";
		kkreight.pts = 15;
		String kkreightlast5[] = {"yes", "yes", "yes", "no", "no"};
		kkreight.lastFive = kkreightlast5;

		Team srheight = new Team();

		srheight.name = "SRH";
		srheight.noOfmatches = 14;
		srheight.won = 7;
		srheight.loss = 7;
		srheight.nrr = "-0.239";
		srheight.pts = 14;
		String srheightlast5[] = {"yes", "yes", "yes", "no", "no"};
		srheight.lastFive = srheightlast5;

		Team ddeight = new Team();

		ddeight.name = "DD";
		ddeight.noOfmatches = 14;
		ddeight.won = 5;
		ddeight.loss = 8;
		ddeight.nrr = "-0.049";
		ddeight.pts = 11;
		String ddeightlast5[] = {"no", "no", "no", "yes", "NR"};
		ddeight.lastFive = ddeightlast5;

		Team kxipeight = new Team();

		kxipeight.name = "KXIP";
		kxipeight.noOfmatches = 14;
		kxipeight.won = 3;
		kxipeight.loss = 11;
		kxipeight.nrr = "-1.436";
		kxipeight.pts = 6;
		String kxipeightlast5[] = {"no", "no", "no", "yes", "no"};
		kxipeight.lastFive = kxipeightlast5;

		Team teams2015[] = {cskeight, mieight, rcbeight, rreight, kkreight, srheight, ddeight, kxipeight};

		seasoneight.teams = teams2015;

		//2016
		Season seasonnine = new Season();
		seasonnine.name = 2016;

		Team glnine = new Team();

		glnine.name = "GL";
		glnine.noOfmatches = 14;
		glnine.won = 9;
		glnine.loss = 5;
		glnine.nrr = "-0.374";
		glnine.pts = 18;
		String glninelast5[] = {"no", "yes", "no", "yes", "yes"};
		glnine.lastFive = glninelast5;

		Team rcbnine = new Team();

		rcbnine.name = "RCB";
		rcbnine.noOfmatches = 14;
		rcbnine.won = 8;
		rcbnine.loss = 6;
		rcbnine.nrr = "+0.932";
		rcbnine.pts = 16;
		String rcbninelast5[] = {"no", "yes", "yes", "yes", "yes"};
		rcbnine.lastFive = rcbninelast5;

		Team srhnine = new Team();

		srhnine.name = "SRH";
		srhnine.noOfmatches = 14;
		srhnine.won = 8;
		srhnine.loss = 6;
		srhnine.nrr = "+0.245";
		srhnine.pts = 16;
		String srhninelast5[] = {"yes", "no", "yes", "no", "no"};
		srhnine.lastFive = srhninelast5;

		Team kkrnine = new Team();

		kkrnine.name = "KKR";
		kkrnine.noOfmatches = 14;
		kkrnine.won = 8;
		kkrnine.loss = 6;
		kkrnine.nrr = "+0.106";
		kkrnine.pts = 16;
		String kkrninelast5[] = {"no", "yes", "no", "no", "yes"};
		kkrnine.lastFive = kkrninelast5;

		Team minine = new Team();

		minine.name = "MI";
		minine.noOfmatches = 14;
		minine.won = 7;
		minine.loss = 7;
		minine.nrr = "-0.146";
		minine.pts = 14;
		String mininelast5[] = {"no", "yes", "no", "yes", "no"};
		minine.lastFive = mininelast5;

		Team ddnine = new Team();

		ddnine.name = "DD";
		ddnine.noOfmatches = 14;
		ddnine.won = 7;
		ddnine.loss = 7;
		ddnine.nrr = "-0.155";
		ddnine.pts = 14;
		String ddninelast5[] = {"yes", "no", "no", "yes", "no"};
		ddnine.lastFive = ddninelast5;

		Team rpsnine = new Team();

		rpsnine.name = "RPS";
		rpsnine.noOfmatches = 14;
		rpsnine.won = 5;
		rpsnine.loss = 9;
		rpsnine.nrr = "+0.015";
		rpsnine.pts = 10;
		String rpsninelast5[] = {"no", "no", "no", "yes", "yes"};
		rpsnine.lastFive = rpsninelast5;

		Team kxipnine = new Team();

		kxipnine.name = "KXIP";
		kxipnine.noOfmatches = 14;
		kxipnine.won = 4;
		kxipnine.loss = 10;
		kxipnine.nrr = "-0.646";
		kxipnine.pts = 8;
		String kxipninelast5[] = {"no", "yes", "no", "no", "no"};
		kxipnine.lastFive = kxipninelast5;

		Team teams2016[] = {glnine, rcbnine, srhnine, kkrnine, minine, ddnine, rpsnine, kxipnine};

		seasonnine.teams = teams2016;

		//2017
		Season seasonten = new Season();
		seasonten.name = 2017;

		Team miten = new Team();

		miten.name = "MI";
		miten.noOfmatches = 14;
		miten.won = 10;
		miten.loss = 4;
		miten.nrr = "+0.784";
		miten.pts = 20;
		String mitenlast5[] = {"yes", "yes", "no", "no", "yes"};
		miten.lastFive = mitenlast5;

		Team rpsten = new Team();

		rpsten.name = "RPS";
		rpsten.noOfmatches = 14;
		rpsten.won = 9;
		rpsten.loss = 5;
		rpsten.nrr = "+0.176";
		rpsten.pts = 18;
		String rpstenlast5[] = {"yes", "yes", "yes", "no", "yes"};
		rpsten.lastFive = rpstenlast5;

		Team srhten = new Team();

		srhten.name = "SRH";
		srhten.noOfmatches = 14;
		srhten.won = 8;
		srhten.loss = 5;
		srhten.nrr = "+0.599";
		srhten.pts = 17;
		String srhtenlast5[] = {"yes", "no", "no", "yes", "yes"};
		srhten.lastFive = srhtenlast5;

		Team kkrten = new Team();

		kkrten.name = "KKR";
		kkrten.noOfmatches = 14;
		kkrten.won = 8;
		kkrten.loss = 6;
		kkrten.nrr = "+0.641";
		kkrten.pts = 16;
		String kkrtenlast5[] = {"no", "no", "yes", "no", "no"};
		kkrten.lastFive = kkrtenlast5;

		Team kxipten = new Team();

		kxipten.name = "KXIP";
		kxipten.noOfmatches = 14;
		kxipten.won = 7;
		kxipten.loss = 7;
		kxipten.nrr = "-0.009";
		kxipten.pts = 14;
		String kxiptenlast5[] = {"yes", "no", "yes", "yes", "no"};
		kxipten.lastFive = kxiptenlast5;

		Team ddten = new Team();

		ddten.name = "DD";
		ddten.noOfmatches = 14;
		ddten.won = 6;
		ddten.loss = 8;
		ddten.nrr = "-0.512";
		ddten.pts = 12;
		String ddtenlast5[] = {"yes", "no", "yes", "yes", "no"};
		ddten.lastFive = ddtenlast5;

		Team glten = new Team();

		glten.name = "GL";
		glten.noOfmatches = 14;
		glten.won = 4;
		glten.loss = 10;
		glten.nrr = "-0.412";
		glten.pts = 8;
		String gltenlast5[] = {"no", "no", "yes", "no", "no"};
		glten.lastFive = gltenlast5;

		Team rcbten = new Team();

		rcbten.name = "RCB";
		rcbten.noOfmatches = 14;
		rcbten.won = 3;
		rcbten.loss = 10;
		rcbten.nrr = "-1.299";
		rcbten.pts = 7;
		String rcbtenlast5[] = {"no", "no", "no", "no", "yes"};
		rcbten.lastFive = rcbtenlast5;

		Team teams2017[] = {miten, rpsten, srhten, kkrten, kxipten, ddten, glten, rcbten};

		seasonten.teams = teams2017;

		//2018
		Season seasoneleven = new Season();
		seasoneleven.name = 2018;

		Team srheleven = new Team();

		srheleven.name = "SRH";
		srheleven.noOfmatches = 14;
		srheleven.won = 9;
		srheleven.loss = 5;
		srheleven.nrr = "+0.284";
		srheleven.pts = 18;
		String srhelevenlast5[] = {"yes", "yes", "no", "no", "no"};
		srheleven.lastFive = srhelevenlast5;

		Team cskeleven = new Team();

		cskeleven.name = "CSK";
		cskeleven.noOfmatches = 14;
		cskeleven.won = 9;
		cskeleven.loss = 5;
		cskeleven.nrr = "+0.253";
		cskeleven.pts = 18;
		String cskelevenlast5[] = {"yes", "no", "yes", "no", "yes"};
		cskeleven.lastFive = cskelevenlast5;

		Team kkreleven = new Team();

		kkreleven.name = "KKR";
		kkreleven.noOfmatches = 14;
		kkreleven.won = 8;
		kkreleven.loss = 6;
		kkreleven.nrr = "-0.070";
		kkreleven.pts = 16;
		String kkrelevenlast5[] = {"no", "no", "yes", "yes", "yes"};
		kkreleven.lastFive = kkrelevenlast5;

		Team rreleven = new Team();

		rreleven.name = "RR";
		rreleven.noOfmatches = 14;
		rreleven.won = 7;
		rreleven.loss = 7;
		rreleven.nrr = "-0.250";
		rreleven.pts = 14;
		String rrelevenlast5[] = {"yes", "yes", "yes", "no", "yes"};
		rreleven.lastFive = rrelevenlast5;

		Team mieleven = new Team();

		mieleven.name = "MI";
		mieleven.noOfmatches = 14;
		mieleven.won = 6;
		mieleven.loss = 8;
		mieleven.nrr = "+0.317";
		mieleven.pts = 12;
		String mielevenlast5[] = {"yes", "yes", "no", "yes", "no"};
		mieleven.lastFive = mielevenlast5;

		Team rcbeleven = new Team();

		rcbeleven.name = "RCB";
		rcbeleven.noOfmatches = 14;
		rcbeleven.won = 6;
		rcbeleven.loss = 8;
		rcbeleven.nrr = "+0.129";
		rcbeleven.pts = 12;
		String rcbelevenlast5[] = {"no", "yes", "yes", "yes", "no"};
		rcbeleven.lastFive = rcbelevenlast5;

		Team kxipeleven = new Team();

		kxipeleven.name = "KXIP";
		kxipeleven.noOfmatches = 14;
		kxipeleven.won = 6;
		kxipeleven.loss = 8;
		kxipeleven.nrr = "-0.502";
		kxipeleven.pts = 12;
		String kxipelevenlast5[] = {"no", "no", "no", "no", "no"};
		kxipeleven.lastFive = kxipelevenlast5;

		Team ddeleven = new Team();

		ddeleven.name = "DD";
		ddeleven.noOfmatches = 14;
		ddeleven.won = 5;
		ddeleven.loss = 9;
		ddeleven.nrr = "-0.222";
		ddeleven.pts = 10;
		String ddelevenlast5[] = {"no", "no", "no", "yes", "yes"};
		ddeleven.lastFive = ddelevenlast5;

		Team teams2018[] = {srheleven, cskeleven, kkreleven, rreleven, mieleven, rcbeleven, kxipeleven, ddeleven};

		seasoneleven.teams = teams2018;

		//2019
		Season seasontwelve = new Season();
		seasontwelve.name = 2019;

		Team mitwelve = new Team();

		mitwelve.name = "MI";
		mitwelve.noOfmatches = 14;
		mitwelve.won = 9;
		mitwelve.loss = 5;
		mitwelve.nrr = "+0.421";
		mitwelve.pts = 18;
		String mitwelvelast5[] = {"no", "yes", "no", "yes", "yes"};
		mitwelve.lastFive = mitwelvelast5;

		Team csktwelve = new Team();

		csktwelve.name = "CSK";
		csktwelve.noOfmatches = 14;
		csktwelve.won = 9;
		csktwelve.loss = 5;
		csktwelve.nrr = "+0.131";
		csktwelve.pts = 18;
		String csktwelvelast5[] = {"no", "yes", "no", "yes", "no"};
		csktwelve.lastFive = csktwelvelast5;

		Team dctwelve = new Team();

		dctwelve.name = "DC";
		dctwelve.noOfmatches = 14;
		dctwelve.won = 9;
		dctwelve.loss = 5;
		dctwelve.nrr = "+0.044";
		dctwelve.pts = 18;
		String dctwelvelast5[] = {"yes", "yes", "yes", "no", "yes"};
		dctwelve.lastFive = dctwelvelast5;

		Team srhtwelve = new Team();

		srhtwelve.name = "SRH";
		srhtwelve.noOfmatches = 14;
		srhtwelve.won = 6;
		srhtwelve.loss = 8;
		srhtwelve.nrr = "+0.577";
		srhtwelve.pts = 12;
		String srhtwelvelast5[] = {"no", "no", "yes", "no", "no"};
		srhtwelve.lastFive = srhtwelvelast5;

		Team kkrtwelve = new Team();

		kkrtwelve.name = "KKR";
		kkrtwelve.noOfmatches = 14;
		kkrtwelve.won = 6;
		kkrtwelve.loss = 8;
		kkrtwelve.nrr = "+0.028";
		kkrtwelve.pts = 12;
		String kkrtwelvelast5[] = {"no", "no", "yes", "yes", "no"};
		kkrtwelve.lastFive = kkrtwelvelast5;

		Team kxiptwelve = new Team();

		kxiptwelve.name = "KXIP";
		kxiptwelve.noOfmatches = 14;
		kxiptwelve.won = 6;
		kxiptwelve.loss = 8;
		kxiptwelve.nrr = "-0.251";
		kxiptwelve.pts = 12;
		String kxiptwelvelast5[] = {"no", "no", "no", "no", "yes"};
		kxiptwelve.lastFive = kxiptwelvelast5;

		Team rrtwelve = new Team();

		rrtwelve.name = "RR";
		rrtwelve.noOfmatches = 14;
		rrtwelve.won = 5;
		rrtwelve.loss = 8;
		rrtwelve.nrr = "-0.449";
		rrtwelve.pts = 11;
		String rrtwelvelast5[] = {"no", "yes", "yes", "NR", "no"};
		rrtwelve.lastFive = rrtwelvelast5;

		Team rcbtwelve = new Team();

		rcbtwelve.name = "RCB";
		rcbtwelve.noOfmatches = 14;
		rcbtwelve.won = 5;
		rcbtwelve.loss = 8;
		rcbtwelve.nrr = "-0.607";
		rcbtwelve.pts = 11;
		String rcbtwelvelast5[] = {"yes", "yes", "no", "NR", "yes"};
		rcbtwelve.lastFive = rcbtwelvelast5;

		Team teams2019[] = {mitwelve, csktwelve, dctwelve, srhtwelve, kkrtwelve, kxiptwelve, rrtwelve, rcbtwelve};

		seasontwelve.teams = teams2019;

		//2020
		Season seasonthirteen = new Season();
		seasonthirteen.name = 2020;

		Team mithirteen = new Team();

		mithirteen.name = "MI";
		mithirteen.noOfmatches = 14;
		mithirteen.won = 9;
		mithirteen.loss = 5;
		mithirteen.nrr = "+1.107";
		mithirteen.pts = 18;
		String mithirteenlast5[] = {"yes", "no", "yes", "yes", "no"};
		mithirteen.lastFive = mithirteenlast5;

		Team dcthirteen = new Team();

		dcthirteen.name = "DC";
		dcthirteen.noOfmatches = 14;
		dcthirteen.won = 8;
		dcthirteen.loss = 6;
		dcthirteen.nrr = "-0.109";
		dcthirteen.pts = 16;
		String dcthirteenlast5[] = {"no", "no", "no", "no", "yes"};
		dcthirteen.lastFive = dcthirteenlast5;

		Team srhthirteen = new Team();

		srhthirteen.name = "SRH";
		srhthirteen.noOfmatches = 14;
		srhthirteen.won = 7;
		srhthirteen.loss = 7;
		srhthirteen.nrr = "+0.608";
		srhthirteen.pts = 14;
		String srhthirteenlast5[] = {"yes", "no", "yes", "yes", "yes"};
		srhthirteen.lastFive = srhthirteenlast5;

		Team rcbthirteen = new Team();

		rcbthirteen.name = "RCB";
		rcbthirteen.noOfmatches = 14;
		rcbthirteen.won = 7;
		rcbthirteen.loss = 7;
		rcbthirteen.nrr = "-0.172";
		rcbthirteen.pts = 14;
		String rcbthirteenlast5[] = {"yes", "no", "no", "no", "no"};
		rcbthirteen.lastFive = rcbthirteenlast5;

		Team kkrthirteen = new Team();

		kkrthirteen.name = "KKR";
		kkrthirteen.noOfmatches = 14;
		kkrthirteen.won = 7;
		kkrthirteen.loss = 7;
		kkrthirteen.nrr = "-0.214";
		kkrthirteen.pts = 14;
		String kkrthirteenlast5[] = {"no", "yes", "no", "no", "yes"};
		kkrthirteen.lastFive = kkrthirteenlast5;

		Team kxipthirteen = new Team();

		kxipthirteen.name = "KXIP";
		kxipthirteen.noOfmatches = 14;
		kxipthirteen.won = 6;
		kxipthirteen.loss = 8;
		kxipthirteen.nrr = "-0.162";
		kxipthirteen.pts = 12;
		String kxipthirteenlast5[] = {"yes", "yes", "yes", "no", "no"};
		kxipthirteen.lastFive = kxipthirteenlast5;

		Team cskthirteen = new Team();

		cskthirteen.name = "CSK";
		cskthirteen.noOfmatches = 14;
		cskthirteen.won = 6;
		cskthirteen.loss = 8;
		cskthirteen.nrr = "-0.455";
		cskthirteen.pts = 12;
		String cskthirteenlast5[] = {"no", "no", "yes", "yes", "yes"};
		cskthirteen.lastFive = cskthirteenlast5;

		Team rrthirteen = new Team();

		rrthirteen.name = "RR";
		rrthirteen.noOfmatches = 14;
		rrthirteen.won = 6;
		rrthirteen.loss = 8;
		rrthirteen.nrr = "-0.569";
		rrthirteen.pts = 12;
		String rrthirteenlast5[] = {"yes", "no", "yes", "yes", "no"};
		rrthirteen.lastFive = rrthirteenlast5;

		Team teams2020[] = {mithirteen, dcthirteen, srhthirteen, rcbthirteen, kkrthirteen, kxipthirteen, cskthirteen, rrthirteen};

		seasonthirteen.teams = teams2020;

		//2021
		Season seasonfourteen = new Season();
		seasonfourteen.name = 2021;

		Team dcfourteen = new Team();

		dcfourteen.name = "DC";
		dcfourteen.noOfmatches = 14;
		dcfourteen.won = 10;
		dcfourteen.loss = 4;
		dcfourteen.nrr = "+0.481";
		dcfourteen.pts = 20;
		String dcfourteenlast5[] = {"yes", "no", "yes", "yes", "no"};
		dcfourteen.lastFive = dcfourteenlast5;

		Team cskfourteen = new Team();

		cskfourteen.name = "CSK";
		cskfourteen.noOfmatches = 14;
		cskfourteen.won = 9;
		cskfourteen.loss = 5;
		cskfourteen.nrr = "+0.455";
		cskfourteen.pts = 18;
		String cskfourteenlast5[] = {"yes", "yes", "no", "no", "no"};
		cskfourteen.lastFive = cskfourteenlast5;

		Team rcbfourteen = new Team();

		rcbfourteen.name = "RCB";
		rcbfourteen.noOfmatches = 14;
		rcbfourteen.won = 9;
		rcbfourteen.loss = 5;
		rcbfourteen.nrr = "-0.140";
		rcbfourteen.pts = 18;
		String rcbfourteenlast5[] = {"yes", "yes", "yes", "no", "yes"};
		rcbfourteen.lastFive = rcbfourteenlast5;

		Team kkrfourteen = new Team();

		kkrfourteen.name = "KKR";
		kkrfourteen.noOfmatches = 14;
		kkrfourteen.won = 7;
		kkrfourteen.loss = 7;
		kkrfourteen.nrr = "+0.587";
		kkrfourteen.pts = 14;
		String kkrfourteenlast5[] = {"no", "yes", "no", "yes", "yes"};
		kkrfourteen.lastFive = kkrfourteenlast5;

		Team mifourteen = new Team();

		mifourteen.name = "MI";
		mifourteen.noOfmatches = 14;
		mifourteen.won = 7;
		mifourteen.loss = 7;
		mifourteen.nrr = "+0.116";
		mifourteen.pts = 14;
		String mifourteenlast5[] = {"no", "yes", "no", "yes", "yes"};
		mifourteen.lastFive = mifourteenlast5;

		Team kxipfourteen = new Team();

		kxipfourteen.name = "KXIP";
		kxipfourteen.noOfmatches = 14;
		kxipfourteen.won = 6;
		kxipfourteen.loss = 8;
		kxipfourteen.nrr = "-0.001";
		kxipfourteen.pts = 12;
		String kxipfourteenlast5[] = {"yes", "no", "yes", "no", "yes"};
		kxipfourteen.lastFive = kxipfourteenlast5;

		Team rrfourteen = new Team();

		rrfourteen.name = "RR";
		rrfourteen.noOfmatches = 14;
		rrfourteen.won = 5;
		rrfourteen.loss = 9;
		rrfourteen.nrr = "-0.993";
		rrfourteen.pts = 10;
		String rrfourteenlast5[] = {"no", "no", "yes", "no", "no"};
		rrfourteen.lastFive = rrfourteenlast5;

		Team srhfourteen = new Team();

		srhfourteen.name = "SRH";
		srhfourteen.noOfmatches = 14;
		srhfourteen.won = 3;
		srhfourteen.loss = 11;
		srhfourteen.nrr = "-0.545";
		srhfourteen.pts = 6;
		String srhfourteenlast5[] = {"yes", "no", "no", "yes", "no"};
		srhfourteen.lastFive = srhfourteenlast5;

		Team teams2021[] = {dcfourteen, cskfourteen, rcbfourteen, kkrfourteen, mifourteen, kxipfourteen, rrfourteen, srhfourteen};

		seasonfourteen.teams = teams2021;

		//2022
		Season seasonfifteen = new Season();
		seasonfifteen.name = 2022;

		Team gtfifteen = new Team();

		gtfifteen.name = "GT";
		gtfifteen.noOfmatches = 14;
		gtfifteen.won = 10;
		gtfifteen.loss = 4;
		gtfifteen.nrr = "+0.316";
		gtfifteen.pts = 20;
		String gtfifteenlast5[] = {"no", "no", "yes", "yes", "no"};
		gtfifteen.lastFive = gtfifteenlast5;

		Team rrfifteen = new Team();

		rrfifteen.name = "RR";
		rrfifteen.noOfmatches = 14;
		rrfifteen.won = 9;
		rrfifteen.loss = 5;
		rrfifteen.nrr = "+0.298";
		rrfifteen.pts = 18;
		String rrfifteenlast5[] = {"no", "yes", "no", "yes", "yes"};
		rrfifteen.lastFive = rrfifteenlast5;

		Team lsgfifteen = new Team();

		lsgfifteen.name = "LSG";
		lsgfifteen.noOfmatches = 14;
		lsgfifteen.won = 9;
		lsgfifteen.loss = 5;
		lsgfifteen.nrr = "+0.251";
		lsgfifteen.pts = 18;
		String lsgfifteenlast5[] = {"yes", "yes", "no", "no", "yes"};
		lsgfifteen.lastFive = lsgfifteenlast5;

		Team rcbfifteen = new Team();

		rcbfifteen.name = "RCB";
		rcbfifteen.noOfmatches = 14;
		rcbfifteen.won = 8;
		rcbfifteen.loss = 6;
		rcbfifteen.nrr = "-0.253";
		rcbfifteen.pts = 16;
		String rcbfifteenlast5[] = {"yes", "yes", "no", "yes", "yes"};
		rcbfifteen.lastFive = rcbfifteenlast5;

		Team dcfifteen = new Team();

		dcfifteen.name = "DC";
		dcfifteen.noOfmatches = 14;
		dcfifteen.won = 7;
		dcfifteen.loss = 7;
		dcfifteen.nrr = "+0.204";
		dcfifteen.pts = 14;
		String dcfifteenlast5[] = {"yes", "no", "yes", "yes", "no"};
		dcfifteen.lastFive = dcfifteenlast5;

		Team kxipfifteen = new Team();

		kxipfifteen.name = "KXIP";
		kxipfifteen.noOfmatches = 14;
		kxipfifteen.won = 7;
		kxipfifteen.loss = 7;
		kxipfifteen.nrr = "+0.126";
		kxipfifteen.pts = 14;
		String kxipfifteenlast5[] = {"yes", "no", "yes", "no", "yes"};
		kxipfifteen.lastFive = kxipfifteenlast5;

		Team kkrfifteen = new Team();

		kkrfifteen.name = "KKR";
		kkrfifteen.noOfmatches = 14;
		kkrfifteen.won = 6;
		kkrfifteen.loss = 8;
		kkrfifteen.nrr = "+0.146";
		kkrfifteen.pts = 12;
		String kkrfifteenlast5[] = {"yes", "no", "yes", "yes", "no"};
		kkrfifteen.lastFive = kkrfifteenlast5;

		Team srhfifteen = new Team();

		srhfifteen.name = "SRH";
		srhfifteen.noOfmatches = 14;
		srhfifteen.won = 6;
		srhfifteen.loss = 8;
		srhfifteen.nrr = "-0.379";
		srhfifteen.pts = 12;
		String srhfifteenlast5[] = {"no", "no", "no", "yes", "no"};
		srhfifteen.lastFive = srhfifteenlast5;

		Team cskfifteen = new Team();

		cskfifteen.name = "CSK";
		cskfifteen.noOfmatches = 14;
		cskfifteen.won = 4;
		cskfifteen.loss = 10;
		cskfifteen.nrr = "-0.203";
		cskfifteen.pts = 8;
		String cskfifteenlast5[] = {"no", "yes", "no", "no", "no"};
		cskfifteen.lastFive = cskfifteenlast5;

		Team mififteen = new Team();

		mififteen.name = "MI";
		mififteen.noOfmatches = 14;
		mififteen.won = 4;
		mififteen.loss = 10;
		mififteen.nrr = "-0.506";
		mififteen.pts = 8;
		String mififteenlast5[] = {"yes", "no", "yes", "no", "yes"};
		mififteen.lastFive = mififteenlast5;

		Team teams2022[] = {gtfifteen, rrfifteen, lsgfifteen, rcbfifteen, dcfifteen, kxipfifteen, kkrfifteen, srhfifteen, cskfifteen, mififteen};

		seasonfifteen.teams = teams2022;

		//2023
		Season seasonsixteen = new Season();
		seasonsixteen.name = 2023;

		Team gtsixteen = new Team();

		gtsixteen.name = "GT";
		gtsixteen.noOfmatches = 14;
		gtsixteen.won = 10;
		gtsixteen.loss = 4;
		gtsixteen.nrr = "+0.809";
		gtsixteen.pts = 20;
		String gtsixteenlast5[] = {"yes", "yes", "no", "yes", "yes"};
		gtsixteen.lastFive = gtsixteenlast5;

		Team csksixteen = new Team();

		csksixteen.name = "CSK";
		csksixteen.noOfmatches = 14;
		csksixteen.won = 8;
		csksixteen.loss = 5;
		csksixteen.nrr = "+0.652";
		csksixteen.pts = 17;
		String csksixteenlast5[] = {"yes", "no", "yes", "yes", "NR"};
		csksixteen.lastFive = csksixteenlast5;

		Team lsgsixteen = new Team();

		lsgsixteen.name = "LSG";
		lsgsixteen.noOfmatches = 14;
		lsgsixteen.won = 8;
		lsgsixteen.loss = 5;
		lsgsixteen.nrr = "+0.284";
		lsgsixteen.pts = 17;
		String lsgsixteenlast5[] = {"yes", "yes", "yes", "no", "NR"};
		lsgsixteen.lastFive = lsgsixteenlast5;

		Team misixteen = new Team();

		misixteen.name = "MI";
		misixteen.noOfmatches = 14;
		misixteen.won = 8;
		misixteen.loss = 6;
		misixteen.nrr = "-0.044";
		misixteen.pts = 16;
		String misixteenlast5[] = {"yes", "no", "yes", "yes", "no"};
		misixteen.lastFive = misixteenlast5;

		Team rrsixteen = new Team();

		rrsixteen.name = "RR";
		rrsixteen.noOfmatches = 14;
		rrsixteen.won = 7;
		rrsixteen.loss = 7;
		rrsixteen.nrr = "+0.148";
		rrsixteen.pts = 14;
		String rrsixteenlast5[] = {"yes", "no", "yes", "no", "no"};
		rrsixteen.lastFive = rrsixteenlast5;

		Team rcbsixteen = new Team();

		rcbsixteen.name = "RCB";
		rcbsixteen.noOfmatches = 14;
		rcbsixteen.won = 7;
		rcbsixteen.loss = 7;
		rcbsixteen.nrr = "+0.135";
		rcbsixteen.pts = 14;
		String rcbsixteenlast5[] = {"no", "yes", "yes", "no", "no"};
		rcbsixteen.lastFive = rcbsixteenlast5;

		Team kkrsixteen = new Team();

		kkrsixteen.name = "KKR";
		kkrsixteen.noOfmatches = 14;
		kkrsixteen.won = 6;
		kkrsixteen.loss = 8;
		kkrsixteen.nrr = "-0.239";
		kkrsixteen.pts = 12;
		String kkrsixteenlast5[] = {"no", "yes", "no", "yes", "yes"};
		kkrsixteen.lastFive = kkrsixteenlast5;

		Team kxipsixteen = new Team();

		kxipsixteen.name = "KXIP";
		kxipsixteen.noOfmatches = 14;
		kxipsixteen.won = 6;
		kxipsixteen.loss = 8;
		kxipsixteen.nrr = "-0.304";
		kxipsixteen.pts = 12;
		String kxipsixteenlast5[] = {"no", "no", "yes", "no", "no"};
		kxipsixteen.lastFive = kxipsixteenlast5;

		Team dcsixteen = new Team();

		dcsixteen.name = "DC";
		dcsixteen.noOfmatches = 14;
		dcsixteen.won = 5;
		dcsixteen.loss = 9;
		dcsixteen.nrr = "-0.808";
		dcsixteen.pts = 10;
		String dcsixteenlast5[] = {"no", "yes", "no", "no", "yes"};
		dcsixteen.lastFive = dcsixteenlast5;

		Team srhsixteen = new Team();

		srhsixteen.name = "SRH";
		srhsixteen.noOfmatches = 14;
		srhsixteen.won = 4;
		srhsixteen.loss = 10;
		srhsixteen.nrr = "-0.590";
		srhsixteen.pts = 8;
		String srhsixteenlast5[] = {"no", "no", "no", "no", "yes"};
		srhsixteen.lastFive = srhsixteenlast5;

		Team teams2023[] = {gtsixteen, csksixteen, lsgsixteen, misixteen, rrsixteen, rcbsixteen, kkrsixteen, kxipsixteen, dcsixteen, srhsixteen};

		seasonsixteen.teams = teams2023;

		//2024
		Season seasonseventeen = new Season();
		seasonseventeen.name = 2024;

		Team kkrseventeen = new Team();

		kkrseventeen.name = "KKR";
		kkrseventeen.noOfmatches = 14;
		kkrseventeen.won = 9;
		kkrseventeen.loss = 3;
		kkrseventeen.nrr = "+1.428";
		kkrseventeen.pts = 20;
		String kkrseventeenlast5[] = {"yes", "yes", "yes", "yes", "NR"};
		kkrseventeen.lastFive = kkrseventeenlast5;

		Team srhseventeen = new Team();

		srhseventeen.name = "SRH";
		srhseventeen.noOfmatches = 14;
		srhseventeen.won = 8;
		srhseventeen.loss = 5;
		srhseventeen.nrr = "+0.414";
		srhseventeen.pts = 17;
		String srhseventeenlast5[] = {"no", "yes", "NR", "yes"};
		srhseventeen.lastFive = srhseventeenlast5;

		Team rrseventeen = new Team();

		rrseventeen.name = "RR";
		rrseventeen.noOfmatches = 14;
		rrseventeen.won = 8;
		rrseventeen.loss = 5;
		rrseventeen.nrr = "+0.273";
		rrseventeen.pts = 17;
		String rrseventeenlast5[] = {"no", "no", "no", "NR"};
		rrseventeen.lastFive = rrseventeenlast5;

		Team rcbseventeen = new Team();

		rcbseventeen.name = "RCB";
		rcbseventeen.noOfmatches = 14;
		rcbseventeen.won = 7;
		rcbseventeen.loss = 7;
		rcbseventeen.nrr = "+0.459";
		rcbseventeen.pts = 14;
		String rcbseventeenlast5[] = {"yes", "yes", "yes", "yes", "yes"};
		rcbseventeen.lastFive = rcbseventeenlast5;

		Team cskseventeen = new Team();

		cskseventeen.name = "CSK";
		cskseventeen.noOfmatches = 14;
		cskseventeen.won = 7;
		cskseventeen.loss = 7;
		cskseventeen.nrr = "+0.392";
		cskseventeen.pts = 14;
		String cskseventeenlast5[] = {"no", "yes", "no", "yes", "no"};
		cskseventeen.lastFive = cskseventeenlast5;

		Team dcseventeen = new Team();

		dcseventeen.name = "DC";
		dcseventeen.noOfmatches = 14;
		dcseventeen.won = 7;
		dcseventeen.loss = 7;
		dcseventeen.nrr = "-0.377";
		dcseventeen.pts = 14;
		String dcseventeenlast5[] = {"no", "yes", "no", "yes"};
		dcseventeen.lastFive = dcseventeenlast5;

		Team lsgseventeen = new Team();

		lsgseventeen.name = "LSG";
		lsgseventeen.noOfmatches = 14;
		lsgseventeen.won = 7;
		lsgseventeen.loss = 7;
		lsgseventeen.nrr = "-0.667";
		lsgseventeen.pts = 14;
		String lsgseventeenlast5[] = {"no", "no", "no", "yes"};
		lsgseventeen.lastFive = lsgseventeenlast5;

		Team gtseventeen = new Team();

		gtseventeen.name = "GT";
		gtseventeen.noOfmatches = 14;
		gtseventeen.won = 5;
		gtseventeen.loss = 7;
		gtseventeen.nrr = "-1.063";
		gtseventeen.pts = 12;
		String gtseventeenlast5[] = {"no", "yes", "yes", "NR", "NR"};
		gtseventeen.lastFive = gtseventeenlast5;

		Team kxipseventeen = new Team();

		kxipseventeen.name = "KXIP";
		kxipseventeen.noOfmatches = 14;
		kxipseventeen.won = 5;
		kxipseventeen.loss = 9;
		kxipseventeen.nrr = "-0.353";
		kxipseventeen.pts = 10;
		String kxipseventeenlast5[] = {"yes", "no", "no", "yes", "no"};
		kxipseventeen.lastFive = kxipseventeenlast5;

		Team miseventeen = new Team();

		miseventeen.name = "MI";
		miseventeen.noOfmatches = 14;
		miseventeen.won = 4;
		miseventeen.loss = 10;
		miseventeen.nrr = "-0.318";
		miseventeen.pts = 8;
		String miseventeenlast5[] = {"no", "yes", "no", "no", "no"};
		miseventeen.lastFive = miseventeenlast5;

		Team teams2024[] = {kkrseventeen, srhseventeen, rrseventeen, rcbseventeen, cskseventeen, dcseventeen, lsgseventeen, gtseventeen, kxipseventeen, miseventeen};

		seasonseventeen.teams = teams2024;

		//2025
		Season seasoneighteen = new Season();
		seasoneighteen.name = 2025;

		Team kxipeighteen = new Team();

		kxipeighteen.name = "KXIP";
		kxipeighteen.noOfmatches = 14;
		kxipeighteen.won = 9;
		kxipeighteen.loss = 4;
		kxipeighteen.nrr = "+0.372";
		kxipeighteen.pts = 19;
		String kxipeighteenlast5[] = {"no", "yes", "yes", "no", "yes"};
		kxipeighteen.lastFive = kxipeighteenlast5;

		Team rcbeighteen = new Team();

		rcbeighteen.name = "RCB";
		rcbeighteen.noOfmatches = 14;
		rcbeighteen.won = 9;
		rcbeighteen.loss = 4;
		rcbeighteen.nrr = "+0.301";
		rcbeighteen.pts = 19;
		String rcbeighteenlast5[] = {"yes", "yes", "NR", "no", "yes"};
		rcbeighteen.lastFive = rcbeighteenlast5;

		Team gteighteen = new Team();

		gteighteen.name = "GT";
		gteighteen.noOfmatches = 14;
		gteighteen.won = 9;
		gteighteen.loss = 5;
		gteighteen.nrr = "+0.254";
		gteighteen.pts = 18;
		String gteighteenlast5[] = {"yes", "no", "no", "no", "yes"};
		gteighteen.lastFive = gteighteenlast5;

		Team mieighteen = new Team();

		mieighteen.name = "MI";
		mieighteen.noOfmatches = 14;
		mieighteen.won = 8;
		mieighteen.loss = 6;
		mieighteen.nrr = "+1.142";
		mieighteen.pts = 16;
		String mieighteenlast5[] = {"yes", "yes", "no", "yes", "no"};
		mieighteen.lastFive = mieighteenlast5;

		Team dceighteen = new Team();

		dceighteen.name = "DC";
		dceighteen.noOfmatches = 14;
		dceighteen.won = 7;
		dceighteen.loss = 6;
		dceighteen.nrr = "+0.011";
		dceighteen.pts = 15;
		String dceighteenlast5[] = {"no", "no", "NR", "no", "yes"};
		dceighteen.lastFive = dceighteenlast5;

		Team srheighteen = new Team();

		srheighteen.name = "SRH";
		srheighteen.noOfmatches = 14;
		srheighteen.won = 6;
		srheighteen.loss = 7;
		srheighteen.nrr = "-0.241";
		srheighteen.pts = 13;
		String srheighteenlast5[] = {"no", "NR", "yes", "yes", "yes"};
		srheighteen.lastFive = srheighteenlast5;

		Team lsgeighteen = new Team();

		lsgeighteen.name = "LSG";
		lsgeighteen.noOfmatches = 14;
		lsgeighteen.won = 6;
		lsgeighteen.loss = 8;
		lsgeighteen.nrr = "-0.376";
		lsgeighteen.pts = 12;
		String lsgeighteenlast5[] = {"yes", "yes", "no", "yes", "no"};
		lsgeighteen.lastFive = lsgeighteenlast5;

		Team kkreighteen = new Team();

		kkreighteen.name = "KKR";
		kkreighteen.noOfmatches = 14;
		kkreighteen.won = 5;
		kkreighteen.loss = 7;
		kkreighteen.nrr = "-0.305";
		kkreighteen.pts = 12;
		String kkreighteenlast5[] = {"yes", "NR", "no", "NR", "no"};
		kkreighteen.lastFive = kkreighteenlast5;

		Team rreighteen = new Team();

		rreighteen.name = "RR";
		rreighteen.noOfmatches = 14;
		rreighteen.won = 4;
		rreighteen.loss = 10;
		rreighteen.nrr = "-0.549";
		rreighteen.pts = 8;
		String rreighteenlast5[] = {"no", "no", "no", "yes"};
		rreighteen.lastFive = rreighteenlast5;

		Team cskeighteen = new Team();

		cskeighteen.name = "CSK";
		cskeighteen.noOfmatches = 14;
		cskeighteen.won = 4;
		cskeighteen.loss = 10;
		cskeighteen.nrr = "-0.647";
		cskeighteen.pts = 8;
		String cskeighteenlast5[] = {"no", "no", "no", "yes", "no"};
		cskeighteen.lastFive = cskeighteenlast5;

		Team teams2025[] = {kxipeighteen, rcbeighteen, gteighteen, mieighteen, dceighteen, srheighteen, lsgeighteen, kkreighteen, rreighteen, cskeighteen};

		seasoneighteen.teams = teams2025;

		//2026
		Season seasonnineteen = new Season();
		seasonnineteen.name = 2026;

		Team rcbnineteen = new Team();

		rcbnineteen.name = "RCB";
		rcbnineteen.noOfmatches = 14;
		rcbnineteen.won = 9;
		rcbnineteen.loss = 5;
		rcbnineteen.nrr = "+0.783";
		rcbnineteen.pts = 18;
		String rcbnineteenlast5[] = {"no", "yes", "yes", "yes", "no"};
		rcbnineteen.lastFive = rcbnineteenlast5;

		Team gtnineteen = new Team();

		gtnineteen.name = "GT";
		gtnineteen.noOfmatches = 14;
		gtnineteen.won = 9;
		gtnineteen.loss = 5;
		gtnineteen.nrr = "+0.695";
		gtnineteen.pts = 18;
		String gtnineteenlast5[] = {"no", "yes", "yes", "yes", "yes"};
		gtnineteen.lastFive = gtnineteenlast5;

		Team srhnineteen = new Team();

		srhnineteen.name = "SRH";
		srhnineteen.noOfmatches = 14;
		srhnineteen.won = 9;
		srhnineteen.loss = 5;
		srhnineteen.nrr = "+0.524";
		srhnineteen.pts = 18;
		String srhnineteenlast5[] = {"yes", "yes", "no", "yes", "no"};
		srhnineteen.lastFive = srhnineteenlast5;

		Team rrnineteen = new Team();

		rrnineteen.name = "RR";
		rrnineteen.noOfmatches = 14;
		rrnineteen.won = 8;
		rrnineteen.loss = 6;
		rrnineteen.nrr = "+0.189";
		rrnineteen.pts = 16;
		String rrnineteenlast5[] = {"yes", "yes", "no", "no", "no"};
		rrnineteen.lastFive = rrnineteenlast5;

		Team kxipnineteen = new Team();

		kxipnineteen.name = "KXIP";
		kxipnineteen.noOfmatches = 14;
		kxipnineteen.won = 7;
		kxipnineteen.loss = 6;
		kxipnineteen.nrr = "+0.309";
		kxipnineteen.pts = 15;
		String kxipnineteenlast5[] = {"yes", "no", "no", "no", "no"};
		kxipnineteen.lastFive = kxipnineteenlast5;

		Team dcnineteen = new Team();

		dcnineteen.name = "DC";
		dcnineteen.noOfmatches = 14;
		dcnineteen.won = 7;
		dcnineteen.loss = 7;
		dcnineteen.nrr = "-0.651";
		dcnineteen.pts = 14;
		String dcnineteenlast5[] = {"yes", "yes", "yes", "no", "no"};
		dcnineteen.lastFive = dcnineteenlast5;

		Team kkrnineteen = new Team();

		kkrnineteen.name = "KKR";
		kkrnineteen.noOfmatches = 14;
		kkrnineteen.won = 6;
		kkrnineteen.loss = 7;
		kkrnineteen.nrr = "-0.147";
		kkrnineteen.pts = 13;
		String kkrnineteenlast5[] = {"no", "yes", "no", "yes", "yes"};
		kkrnineteen.lastFive = kkrnineteenlast5;

		Team csknineteen = new Team();

		csknineteen.name = "CSK";
		csknineteen.noOfmatches = 14;
		csknineteen.won = 6;
		csknineteen.loss = 8;
		csknineteen.nrr = "-0.345";
		csknineteen.pts = 12;
		String csknineteenlast5[] = {"no", "no", "no", "yes", "yes"};
		csknineteen.lastFive = csknineteenlast5;

		Team minineteen = new Team();

		minineteen.name = "MI";
		minineteen.noOfmatches = 14;
		minineteen.won = 4;
		minineteen.loss = 10;
		minineteen.nrr = "-0.584";
		minineteen.pts = 8;
		String minineteenlast5[] = {"no", "no", "yes", "no", "yes"};
		minineteen.lastFive = minineteenlast5;

		Team lsgnineteen = new Team();

		lsgnineteen.name = "LSG";
		lsgnineteen.noOfmatches = 14;
		lsgnineteen.won = 4;
		lsgnineteen.loss = 10;
		lsgnineteen.nrr = "-0.751";
		lsgnineteen.pts = 8;
		String lsgnineteenlast5[] = {"no", "no", "yes", "no", "yes"};
		lsgnineteen.lastFive = lsgnineteenlast5;

		Team teams2026[] = {rcbnineteen, gtnineteen, srhnineteen, rrnineteen, kxipnineteen, dcnineteen, kkrnineteen, csknineteen, minineteen, lsgnineteen};

		seasonnineteen.teams = teams2026;

		Season seasons[] = {seasonone, seasontwo, seasonthree, seasonfour, seasonfive, seasonsix, seasonseven, seasoneight, seasonnine, seasonten, seasoneleven, seasontwelve, seasonthirteen, seasonfourteen, seasonfifteen, seasonsixteen, seasonseventeen, seasoneighteen, seasonnineteen};

		table.seasons = seasons;

		ipl.table = table;

		ipl.getIplInfo();
	}

}
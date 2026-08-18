class AirportRunner{
	
	public static void main (String[] southIndia){
		
		// 1. Chennai International Airport
        Airport chennai = new Airport();
        chennai.airportID = 1;
        chennai.airportName = "Chennai International Airport";
        chennai.location = "Meenambakkam";
        chennai.city = "Chennai";

        Terminal terminal1 = new Terminal();
        terminal1.terminalId = 1;
        terminal1.noOfGates = 10;

        chennai.terminal = terminal1;
		
		chennai.printAirportDetails();


        // 2. Coimbatore International Airport
        Airport coimbatore = new Airport();
        coimbatore.airportID = 2;
        coimbatore.airportName = "Coimbatore International Airport";
        coimbatore.location = "Peelamedu";
        coimbatore.city = "Coimbatore";

        Terminal terminal2 = new Terminal();
        terminal2.terminalId = 2;
        terminal2.noOfGates = 8;

        coimbatore.terminal = terminal2;
		
		coimbatore.printAirportDetails();
        
		
		 // 3. Tiruchirappalli International Airport
        Airport tiruchirappalli = new Airport();
        tiruchirappalli.airportID = 3;
        tiruchirappalli.airportName = "Tiruchirappalli International Airport";
        tiruchirappalli.location = "Sembattu";
        tiruchirappalli.city = "Tiruchirappalli";

        Terminal terminal3 = new Terminal();
        terminal3.terminalId = 3;
        terminal3.noOfGates = 6;

        tiruchirappalli.terminal = terminal3;
		
		tiruchirappalli.printAirportDetails();


        // 4. Madurai Airport
        Airport madurai = new Airport();
        madurai.airportID = 4;
        madurai.airportName = "Madurai Airport";
        madurai.location = "Avaniyapuram";
        madurai.city = "Madurai";

        Terminal terminal4 = new Terminal();
        terminal4.terminalId = 4;
        terminal4.noOfGates = 5;

        madurai.terminal = terminal4;
		
		madurai.printAirportDetails();
		
		
		
		 // 5. Salem Airport
        Airport salem = new Airport();
        salem.airportID = 5;
        salem.airportName = "Salem Airport";
        salem.location = "Kamalapuram";
        salem.city = "Salem";

        Terminal terminal5 = new Terminal();
        terminal5.terminalId = 5;
        terminal5.noOfGates = 3;

        salem.terminal = terminal5;
		
		salem.printAirportDetails();
		 


        // 6. Tuticorin Airport
        Airport tuticorin = new Airport();
        tuticorin.airportID = 6;
        tuticorin.airportName = "Tuticorin Airport";
        tuticorin.location = "Vagaikulam";
        tuticorin.city = "Thoothukudi";

        Terminal terminal6 = new Terminal();
        terminal6.terminalId = 6;
        terminal6.noOfGates = 4;

        tuticorin.terminal = terminal6;
       
        tuticorin.printAirportDetails();
        
       
		 // 7. Neyveli Airport
        Airport neyveli = new Airport();
        neyveli.airportID = 7;
        neyveli.airportName = "Neyveli Airport";
        neyveli.location = "Neyveli";
        neyveli.city = "Neyveli";

        Terminal terminal7 = new Terminal();
        terminal7.terminalId = 7;
        terminal7.noOfGates = 2;

        neyveli.terminal = terminal7;
		
		neyveli.printAirportDetails();


        // 8. Vellore Airport
        Airport vellore = new Airport();
        vellore.airportID = 8;
        vellore.airportName = "Vellore Airport";
        vellore.location = "Vellore";
        vellore.city = "Vellore";

        Terminal terminal8 = new Terminal();
        terminal8.terminalId = 8;
        terminal8.noOfGates = 2;

        vellore.terminal = terminal8;
		
		vellore.printAirportDetails();
		
		
		
		// 9. Kempegowda International Airport
        Airport bangalore = new Airport();
        bangalore.airportID = 9;
        bangalore.airportName = "Kempegowda International Airport";
        bangalore.location = "Devanahalli";
        bangalore.city = "Bengaluru";

        Terminal terminal9 = new Terminal();
        terminal9.terminalId = 9;
        terminal9.noOfGates = 10;

        bangalore.terminal = terminal9;
		
		bangalore.printAirportDetails();
  

        // 10. Mangaluru International Airport
        Airport mangaluru = new Airport();
        mangaluru.airportID = 10;
        mangaluru.airportName = "Mangaluru International Airport";
        mangaluru.location = "Bajpe";
        mangaluru.city = "Mangaluru";

        Terminal terminal10 = new Terminal();
        terminal10.terminalId = 10;
        terminal10.noOfGates = 6;

        mangaluru.terminal = terminal10; 
		
		mangaluru.printAirportDetails();
		
		 // 11. Hubballi Airport
        Airport hubballi = new Airport();
        hubballi.airportID = 11;
        hubballi.airportName = "Hubballi Airport";
        hubballi.location = "Gokul Road";
        hubballi.city = "Hubballi";

        Terminal terminal11 = new Terminal();
        terminal11.terminalId = 11;
        terminal11.noOfGates = 4;

        hubballi.terminal = terminal11;
		
		hubballi.printAirportDetails();


        // 12. Belagavi Airport
        Airport belagavi = new Airport();
        belagavi.airportID = 12;
        belagavi.airportName = "Belagavi Airport";
        belagavi.location = "Sambra";
        belagavi.city = "Belagavi";

        Terminal terminal12 = new Terminal();
        terminal12.terminalId = 12;
        terminal12.noOfGates = 4;

        belagavi.terminal = terminal12;
		
		belagavi.printAirportDetails();
		
		
		 // 13. Mysuru Airport
        Airport mysuru = new Airport();
        mysuru.airportID = 13;
        mysuru.airportName = "Mysuru Airport";
        mysuru.location = "Mandakalli";
        mysuru.city = "Mysuru";

        Terminal terminal13 = new Terminal();
        terminal13.terminalId = 13;
        terminal13.noOfGates = 3;

        mysuru.terminal = terminal13;
		
		mysuru.printAirportDetails();


        // 14. Kalaburagi Airport
        Airport kalaburagi = new Airport();
        kalaburagi.airportID = 14;
        kalaburagi.airportName = "Kalaburagi Airport";
        kalaburagi.location = "Srinivas Saradagi";
        kalaburagi.city = "Kalaburagi";

        Terminal terminal14 = new Terminal();
        terminal14.terminalId = 14;
        terminal14.noOfGates = 3;

        kalaburagi.terminal = terminal14;
		
		kalaburagi.printAirportDetails();
		
		
		 // 15. Bidar Airport
        Airport bidar = new Airport();
        bidar.airportID = 15;
        bidar.airportName = "Bidar Airport";
        bidar.location = "Bidar";
        bidar.city = "Bidar";

        Terminal terminal15 = new Terminal();
        terminal15.terminalId = 15;
        terminal15.noOfGates = 2;

        bidar.terminal = terminal15;
		
		bidar.printAirportDetails();
        

        // 16. Jindal Vijaynagar Airport
        Airport vijaynagar = new Airport();
        vijaynagar.airportID = 16;
        vijaynagar.airportName = "Jindal Vijaynagar Airport";
        vijaynagar.location = "Toranagallu";
        vijaynagar.city = "Vijayanagara";

        Terminal terminal16 = new Terminal();
        terminal16.terminalId = 16;
        terminal16.noOfGates = 2;

        vijaynagar.terminal = terminal16;
		
		vijaynagar.printAirportDetails();
       
		
		  // 17. Kuvempu Airport
        Airport shivamogga = new Airport();
        shivamogga.airportID = 17;
        shivamogga.airportName = "Kuvempu Airport";
        shivamogga.location = "Sogane";
        shivamogga.city = "Shivamogga";

        Terminal terminal17 = new Terminal();
        terminal17.terminalId = 17;
        terminal17.noOfGates = 3;

        shivamogga.terminal = terminal17;
		
		shivamogga.printAirportDetails();



        // 18. Cochin International Airport
        Airport cochin = new Airport();
        cochin.airportID = 18;
        cochin.airportName = "Cochin International Airport";
        cochin.location = "Nedumbassery";
        cochin.city = "Kochi";

        Terminal terminal18 = new Terminal();
        terminal18.terminalId = 18;
        terminal18.noOfGates = 8;

        cochin.terminal = terminal18;
		
		cochin.printAirportDetails();
       
		
		
		 // 19. Thiruvananthapuram International Airport
        Airport trivandrum = new Airport();
        trivandrum.airportID = 19;
        trivandrum.airportName = "Thiruvananthapuram International Airport";
        trivandrum.location = "Shangumugham";
        trivandrum.city = "Thiruvananthapuram";

        Terminal terminal19 = new Terminal();
        terminal19.terminalId = 19;
        terminal19.noOfGates = 6;

        trivandrum.terminal = terminal19;
		trivandrum.printAirportDetails();
        


        // 20. Calicut International Airport
        Airport calicut = new Airport();
        calicut.airportID = 20;
        calicut.airportName = "Calicut International Airport";
        calicut.location = "Karipur";
        calicut.city = "Kozhikode";

        Terminal terminal20 = new Terminal();
        terminal20.terminalId = 20;
        terminal20.noOfGates = 5;

        calicut.terminal = terminal20;
		calicut.printAirportDetails();
       
		
		
		 // 21. Kannur International Airport
        Airport kannur = new Airport();
        kannur.airportID = 21;
        kannur.airportName = "Kannur International Airport";
        kannur.location = "Mattannur";
        kannur.city = "Kannur";

        Terminal terminal21 = new Terminal();
        terminal21.terminalId = 21;
        terminal21.noOfGates = 5;

        kannur.terminal = terminal21;
		kannur.printAirportDetails();


        // 22. Visakhapatnam Airport
        Airport vizag = new Airport();
        vizag.airportID = 22;
        vizag.airportName = "Visakhapatnam International Airport";
        vizag.location = "Madhurawada";
        vizag.city = "Visakhapatnam";

        Terminal terminal22 = new Terminal();
        terminal22.terminalId = 22;
        terminal22.noOfGates = 6;

        vizag.terminal = terminal22;
		
		vizag.printAirportDetails();
        

		
		 // 23. Tirupati International Airport
        Airport tirupati = new Airport();
        tirupati.airportID = 23;
        tirupati.airportName = "Tirupati International Airport";
        tirupati.location = "Renigunta";
        tirupati.city = "Tirupati";

        Terminal terminal23 = new Terminal();
        terminal23.terminalId = 23;
        terminal23.noOfGates = 4;

        tirupati.terminal = terminal23;
		
		tirupati.printAirportDetails();
		


        // 24. Vijayawada International Airport
        Airport vijayawada = new Airport();
        vijayawada.airportID = 24;
        vijayawada.airportName = "Vijayawada International Airport";
        vijayawada.location = "Gannavaram";
        vijayawada.city = "Vijayawada";

        Terminal terminal24 = new Terminal();
        terminal24.terminalId = 24;
        terminal24.noOfGates = 5;

        vijayawada.terminal = terminal24;
		
		vijayawada.printAirportDetails();
        
		
		 // 25. Rajahmundry Airport
        Airport rajahmundry = new Airport();
        rajahmundry.airportID = 25;
        rajahmundry.airportName = "Rajahmundry Airport";
        rajahmundry.location = "Madhurapudi";
        rajahmundry.city = "Rajahmundry";

        Terminal terminal25 = new Terminal();
        terminal25.terminalId = 25;
        terminal25.noOfGates = 3;

        rajahmundry.terminal = terminal25;
		
		rajahmundry.printAirportDetails();
        


        // 26. Kadapa Airport
        Airport kadapa = new Airport();
        kadapa.airportID = 26;
        kadapa.airportName = "Kadapa Airport";
        kadapa.location = "Kadapa";
        kadapa.city = "Kadapa";

        Terminal terminal26 = new Terminal();
        terminal26.terminalId = 26;
        terminal26.noOfGates = 3;

        kadapa.terminal = terminal26;
		
		kadapa.printAirportDetails();
		
		
		
		 // 27. Uyyalawada Narasimha Reddy Airport
        Airport kurnool = new Airport();
        kurnool.airportID = 27;
        kurnool.airportName = "Uyyalawada Narasimha Reddy Airport";
        kurnool.location = "Orvakal";
        kurnool.city = "Kurnool";

        Terminal terminal27 = new Terminal();
        terminal27.terminalId = 27;
        terminal27.noOfGates = 3;

        kurnool.terminal = terminal27;
		
		kurnool.printAirportDetails();
        

        // 28. Sri Sathya Sai Airport
        Airport puttaparthi = new Airport();
        puttaparthi.airportID = 28;
        puttaparthi.airportName = "Sri Sathya Sai Airport";
        puttaparthi.location = "Puttaparthi";
        puttaparthi.city = "Puttaparthi";

        Terminal terminal28 = new Terminal();
        terminal28.terminalId = 28;
        terminal28.noOfGates = 2;

        puttaparthi.terminal = terminal28;
		
		puttaparthi.printAirportDetails();
		
		
		
		 // 29. Rajiv Gandhi International Airport
        Airport hyderabad = new Airport();
        hyderabad.airportID = 29;
        hyderabad.airportName = "Rajiv Gandhi International Airport";
        hyderabad.location = "Shamshabad";
        hyderabad.city = "Hyderabad";

        Terminal terminal29 = new Terminal();
        terminal29.terminalId = 29;
        terminal29.noOfGates = 10;

        hyderabad.terminal = terminal29;
		
		hyderabad.printAirportDetails();
        


        // 30. Begumpet Airport
        Airport begumpet = new Airport();
        begumpet.airportID = 30;
        begumpet.airportName = "Begumpet Airport";
        begumpet.location = "Begumpet";
        begumpet.city = "Hyderabad";

        Terminal terminal30 = new Terminal();
        terminal30.terminalId = 30;
        terminal30.noOfGates = 2;

        begumpet.terminal = terminal30;
		
		begumpet.printAirportDetails();
        
		
		// 31. Warangal Airport
        Airport warangal = new Airport();
        warangal.airportID = 31;
        warangal.airportName = "Warangal Airport";
        warangal.location = "Mamnoor";
        warangal.city = "Warangal";

        Terminal terminal31 = new Terminal();
        terminal31.terminalId = 31;
        terminal31.noOfGates = 2;

        warangal.terminal = terminal31;
		
		warangal.printAirportDetails();

       

        // 32. Veer Savarkar International Airport
        Airport portBlair = new Airport();
        portBlair.airportID = 32;
        portBlair.airportName = "Veer Savarkar International Airport";
        portBlair.location = "Port Blair";
        portBlair.city = "Port Blair";

        Terminal terminal32 = new Terminal();
        terminal32.terminalId = 32;
        terminal32.noOfGates = 4;

        portBlair.terminal = terminal32;
		
		portBlair.printAirportDetails();
        

		
		 // 33. Agatti Airport
        Airport agatti = new Airport();
        agatti.airportID = 33;
        agatti.airportName = "Agatti Airport";
        agatti.location = "Agatti Island";
        agatti.city = "Agatti";

        Terminal terminal33 = new Terminal();
        terminal33.terminalId = 33;
        terminal33.noOfGates = 2;

        agatti.terminal = terminal33;
		
		agatti.printAirportDetails();
        

        // 34. Puducherry Airport
        Airport puducherry = new Airport();
        puducherry.airportID = 34;
        puducherry.airportName = "Puducherry Airport";
        puducherry.location = "Lawspet";
        puducherry.city = "Puducherry";

        Terminal terminal34 = new Terminal();
        terminal34.terminalId = 34;
        terminal34.noOfGates = 2;

        puducherry.terminal = terminal34;
		
		puducherry.printAirportDetails();

		
		
		
		 // 35. Car Nicobar Air Force Station
        Airport carNicobar = new Airport();
        carNicobar.airportID = 35;
        carNicobar.airportName = "Car Nicobar Air Force Station";
        carNicobar.location = "Car Nicobar";
        carNicobar.city = "Car Nicobar";

        Terminal terminal35 = new Terminal();
        terminal35.terminalId = 35;
        terminal35.noOfGates = 2;

        carNicobar.terminal = terminal35;
		
		carNicobar.printAirportDetails();

		
	}
}
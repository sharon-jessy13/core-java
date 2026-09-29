package com.xworkzz.library;

import com.xworkzz.library.Product.*;

public class Runner {
    public static void main(String[] args) {

        Board board = new Board();
        board.boardId = 1;
        board.boardType = "White Board";
        board.brand = "Classmate";
        board.price = 1500.00;
        board.color = "White";

        Board board1 = new Board();
        board1.boardId = 1;
        board1.boardType = "White Board";
        board1.brand = "Classmate";
        board1.price = 1500.00;
        board1.color = "White";

        System.out.println("Board example");
        System.out.println("using == operator ");
        System.out.println(board == board1);

        boolean isEqual = board.equals(board1);
        System.out.println("using equals method");
        System.out.println(isEqual);


        //-----------------------------------//

        Course course = new Course();
        course.courseId = 1;
        course.courseName = "Full Stack Development";
        course.instructor = "John";
        course.duration = 6;
        course.fees = 50000.00;

        Course course1 = new Course();
        course1.courseId = 1;
        course1.courseName = "Full Stack Development";
        course1.instructor = "John";
        course1.duration = 6;
        course1.fees = 50000.00;

        System.out.println("Course example");
        System.out.println("using == operator ");
        System.out.println(course == course1);

        boolean isEqualCourse = course.equals(course1);
        System.out.println("using equals method");
        System.out.println(isEqualCourse);


        //------------------------------------//

        Fan fan = new Fan();
        fan.fanId = 1;
        fan.brand = "Crompton";
        fan.color = "White";
        fan.price = 2500.00;
        fan.speed = 5;

        Fan fan1 = new Fan();
        fan1.fanId = 1;
        fan1.brand = "Crompton";
        fan1.color = "White";
        fan1.price = 2500.00;
        fan1.speed = 5;

        System.out.println("Fan example");
        System.out.println("using == operator ");
        System.out.println(fan == fan1);

        boolean isEqualFan = fan.equals(fan1);
        System.out.println("using equals method");
        System.out.println(isEqualFan);


        //------------------------------------//

        Pen pen = new Pen();
        pen.penId = 1;
        pen.brand = "Cello";
        pen.color = "Blue";
        pen.price = 20.00;
        pen.inkType = "Gel";

        Pen pen1 = new Pen();
        pen1.penId = 1;
        pen1.brand = "Cello";
        pen1.color = "Blue";
        pen1.price = 20.00;
        pen1.inkType = "Gel";

        System.out.println("Pen example");
        System.out.println("using == operator ");
        System.out.println(pen == pen1);

        boolean isEqualPen = pen.equals(pen1);
        System.out.println("using equals method");
        System.out.println(isEqualPen);

        //-------------------------------------//

        Podium podium = new Podium();
        podium.podiumId = 1;
        podium.material = "Wood";
        podium.color = "Brown";
        podium.price = 5000.00;
        podium.type = "Standing";

        Podium podium1 = new Podium();
        podium1.podiumId = 1;
        podium1.material = "Wood";
        podium1.color = "Brown";
        podium1.price = 5000.00;
        podium1.type = "Standing";

        System.out.println("Podium example");
        System.out.println("using == operator ");
        System.out.println(podium == podium1);

        boolean isEqualPodium = podium.equals(podium1);
        System.out.println("using equals method");
        System.out.println(isEqualPodium);


        //-----------------------------------------//

        Order order = new Order();
        order.orderId = 1;
        order.customerName = "Sharon";
        order.productName = "Laptop";
        order.quantity = 1;
        order.totalAmount = 55000.00;

        Order order1 = new Order();
        order1.orderId = 1;
        order1.customerName = "Sharon";
        order1.productName = "Laptop";
        order1.quantity = 1;
        order1.totalAmount = 55000.00;

        System.out.println("Orders example");
        System.out.println("using == operator ");
        System.out.println(order == order1);

        boolean isEqualOrder = order.equals(order1);
        System.out.println("using equals method");
        System.out.println(isEqualOrder);

        //------------------------//

        Ticket ticket = new Ticket();
        ticket.ticketId = 1;
        ticket.passengerName = "Sharon";
        ticket.source = "Bangalore";
        ticket.destination = "Mumbai";
        ticket.fare = 2500.00;

        Ticket ticket1 = new Ticket();
        ticket1.ticketId = 1;
        ticket1.passengerName = "Sharon";
        ticket1.source = "Bangalore";
        ticket1.destination = "Mumbai";
        ticket1.fare = 2500.00;

        System.out.println("Ticket example");
        System.out.println("using == operator ");
        System.out.println(ticket == ticket1);

        boolean isEqualTicket = ticket.equals(ticket1);
        System.out.println("using equals method");
        System.out.println(isEqualTicket);

        //-----------------------------------------//

        Industry industry = new Industry();
        industry.industryId = 1;
        industry.industryName = "Information Technology";
        industry.location = "Bangalore";
        industry.type = "Software";
        industry.annualRevenue = 70000000.00;

        Industry industry1 = new Industry();
        industry1.industryId = 1;
        industry1.industryName = "Information Technology";
        industry1.location = "Bangalore";
        industry1.type = "Software";
        industry1.annualRevenue = 50000000.00;

        System.out.println("Industry example");
        System.out.println("using == operator ");
        System.out.println(industry == industry1);

        boolean isEqualIndustry = industry.equals(industry1);
        System.out.println("using equals method");
        System.out.println(isEqualIndustry);

        //-----------------------------------------//

        Institute institute = new Institute();
        institute.instituteId = 1;
        institute.instituteName = "X-Workz";
        institute.address = "Bangalore";
        institute.course = "Full Stack Development";
        institute.fees = 50000.00;

        Institute institute1 = new Institute();
        institute1.instituteId = 1;
        institute1.instituteName = "X-Workz";
        institute1.address = "Bangalore";
        institute1.course = "Full Stack Development";
        institute1.fees = 50000.00;

        System.out.println("Institute example");
        System.out.println("using == operator ");
        System.out.println(institute == institute1);

        boolean isEqualInstitute = institute.equals(institute1);
        System.out.println("using equals method");
        System.out.println(isEqualInstitute);

        //--------------------------------------//

        Ornament ornament = new Ornament();
        ornament.ornamentId = 1;
        ornament.ornamentName = "Necklace";
        ornament.material = "Gold";
        ornament.price = 75000.00;
        ornament.design = "Traditional";

        Ornament ornament1 = new Ornament();
        ornament1.ornamentId = 1;
        ornament1.ornamentName = "Necklace";
        ornament1.material = "Silver";
        ornament1.price = 75000.00;
        ornament1.design = "Traditional";

        System.out.println("Ornament example");
        System.out.println("using == operator ");
        System.out.println(ornament == ornament1);

        boolean isEqualOrnament = ornament.equals(ornament1);
        System.out.println("using equals method");
        System.out.println(isEqualOrnament);

        //--------------------------------------------------//

        Road road = new Road();
        road.roadId = 1;
        road.roadName = "M.G. Road";
        road.location = "Bangalore";
        road.roadType = "Highway";
        road.length = 10.5;

        Road road1 = new Road();
        road1.roadId = 1;
        road1.roadName = "M.G. Road";
        road1.location = "Bangalore";
        road1.roadType = "Highway";
        road1.length = 10.5;

        System.out.println("using == operator ");
        System.out.println(road == road1);

        System.out.println("road example");
        boolean isEqualRoad = road.equals(road1);
        System.out.println("using equals method");
        System.out.println(isEqualRoad);

        //----------------------------------------//

        Country country = new Country();
        country.countryId = 1;
        country.countryName = "India";
        country.capital = "New Delhi";
        country.continent = "Asia";
        country.population = 1400000000L;

        Country country1 = new Country();
        country1.countryId = 1;
        country1.countryName = "India";
        country1.capital = "New Delhi";
        country1.continent = "Asia";
        country1.population = 1400000000L;

        System.out.println("Country example");
        System.out.println("using == operator ");
        System.out.println(country == country1);

        boolean isEqualCountry = country.equals(country1);
        System.out.println("using equals method");
        System.out.println(isEqualCountry);


        //-----------------------------------------//

        Light light = new Light();
        light.lightId = 1;
        light.brand = "Philips";
        light.type = "LED";
        light.color = "White";
        light.price = 500.00;

        Light light1 = new Light();
        light1.lightId = 1;
        light1.brand = "Philips";
        light1.type = "LED";
        light1.color = "White";
        light1.price = 500.00;

        System.out.println("Light example");
        System.out.println("using == operator ");
        System.out.println(light == light1);

        boolean isEqualLight = light.equals(light1);
        System.out.println("using equals method");
        System.out.println(isEqualLight);

        //-------------------------------------------//


        Season season = new Season();
        season.seasonId = 1;
        season.seasonName = "Summer";
        season.climate = "Hot";
        season.averageTemperature = 32.5;
        season.months = "March to May";

        Season season1 = new Season();
        season1.seasonId = 1;
        season1.seasonName = "Summer";
        season1.climate = "Hot";
        season1.averageTemperature = 32.5;
        season1.months = "March to May";

        System.out.println("Season Example");
        System.out.println("using == operator ");
        System.out.println(season == season1);

        boolean isEqualSeason = season.equals(season1);
        System.out.println("using equals method");
        System.out.println(isEqualSeason);

        //------------------------------------//

        MobileApplication application = new MobileApplication();
        application.applicationId = 1;
        application.applicationName = "Instagram";
        application.developer = "Meta";
        application.platform = "Android";
        application.size = 250.50;

        MobileApplication application1 = new MobileApplication();
        application1.applicationId = 1;
        application1.applicationName = "Whatsapp";
        application1.developer = "Meta";
        application1.platform = "Android";
        application1.size = 250.50;

        System.out.println("Mobile Application Example");
        System.out.println("using == operator ");
        System.out.println(application == application1);

        boolean isEqualApps = application.equals(application1);
        System.out.println("using equals method");
        System.out.println(isEqualApps);

        //-------------------------------------------------//

        Form form = new Form();
        form.formId = 1;
        form.formName = "Admission Form";
        form.applicantName = "Sharon";
        form.purpose = "College Admission";
        form.status = "Submitted";

        Form form1 = new Form();
        form1.formId = 1;
        form1.formName = "Admission Form";
        form1.applicantName = "Sharon";
        form1.purpose = "College Admission";
        form1.status = "Submitted";

        System.out.println("Form example");
        System.out.println("using == operator ");
        System.out.println(form == form1);

        boolean isEqualForm = form.equals(form1);
        System.out.println("using equals method");
        System.out.println(isEqualForm);

    }
}

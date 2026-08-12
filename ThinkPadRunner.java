class ThinkPadRunner {

    public static void main(String[] think) {

        ThinkPad t1 = new ThinkPad(1, "ThinkPad E14","Lenovo", 60000,
				"Intel i5", 16, 512,"14 inch", "Windows 11", false);
        t1.display();


        ThinkPad t2 = new ThinkPad(2, "ThinkPad T14","Lenovo", 85000,
				"Intel i7", 16, 1024,"14 inch", "Windows 11", false);
        t2.display();


        ThinkPad t3 = new ThinkPad(3, "ThinkPad X1 Carbon","Lenovo", 120000,
				"Intel i7", 32, 1024,"14 inch", "Windows 11", true);
        t3.display();

    }
}
class ThinkPad {

    int id;
    String model;
    String brand;
    double price;
    String processor;
    int ram;
    int storage;
    String display;
    String operatingSystem;
    boolean touchScreen;

    ThinkPad(int id, String model, String brand, double price,
             String processor, int ram, int storage, String display,
             String operatingSystem, boolean touchScreen) {

        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.operatingSystem = operatingSystem;
        this.touchScreen = touchScreen;
    }

   public void display() {
        System.out.println("id : " +id);
        System.out.println("model:" +model);
        System.out.println("brand:" + brand);
        System.out.println("Price: "+ price);
        System.out.println("Processor: "+processor);
        System.out.println("RAM: "+ram);
        System.out.println("Storage: "+storage);
        System.out.println("Display: "+display);
        System.out.println("OS: "+operatingSystem);
        System.out.println("Touch Screen: "+touchScreen);
    }
}
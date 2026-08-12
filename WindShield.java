class WindShield {

    int id;
    String brand;
    String vehicle;
    String material;
    double price;
    String color;
    double height;
    double width;
    String glassType;
    boolean tinted;

    WindShield(int id, String brand, String vehicle, String material,
               double price, String color, double height, double width,
               String glassType, boolean tinted) {

        this.id = id;
        this.brand = brand;
        this.vehicle = vehicle;
        this.material = material;
        this.price = price;
        this.color = color;
        this.height = height;
        this.width = width;
        this.glassType = glassType;
        this.tinted = tinted;
    }

    void display() {
        System.out.println("id: "+id);
        System.out.println("Brand: "+brand);
        System.out.println("Vehicle: "+vehicle);
        System.out.println("Material: "+material);
        System.out.println("Price"+price);
        System.out.println("Color: "+color);
        System.out.println("height: "+height);
        System.out.println("width: "+width);
        System.out.println("Galss type"+glassType);
        System.out.println("is this tinted: "+tinted);
    }
}
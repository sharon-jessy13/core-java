class SoftDrink {

    int id;
    String name;
    String brand;
    String flavor;
    double price;
    int volume;
    String bottleType;
    String color;
    double sugar;
    boolean carbonated;

    SoftDrink(int id, String name, String brand, String flavor,
              double price, int volume, String bottleType, String color,
              double sugar, boolean carbonated) {

        this.id = id;
        this.name = name;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.volume = volume;
        this.bottleType = bottleType;
        this.color = color;
        this.sugar = sugar;
        this.carbonated = carbonated;
    }

   public void display() {
		System.out.println("id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Brand: " + brand);
		System.out.println("Flavor: " + flavor);
		System.out.println("Price: " + price);
		System.out.println("Volume: " + volume);
		System.out.println("Bottle Type: " + bottleType);
		System.out.println("Color: " + color);
		System.out.println("Sugar: " + sugar);
		System.out.println("Is Carbonated: " + carbonated);
	}
}
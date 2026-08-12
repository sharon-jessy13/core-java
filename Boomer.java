class Boomer {

    int id;
    String flavor;
    String brand;
    double price;
    String color;
    int quantity;
    String type;
    String packaging;
    int weight;
    boolean sugarFree;

    Boomer(int id, String flavor, String brand, double price,
           String color, int quantity, String type, String packaging,
           int weight, boolean sugarFree) {

        this.id = id;
        this.flavor = flavor;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
        this.type = type;
        this.packaging = packaging;
        this.weight = weight;
        this.sugarFree = sugarFree;
    }

   public void display() {
		System.out.println("id: " + id);
		System.out.println("Flavor: " + flavor);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("Color: " + color);
		System.out.println("Quantity: " + quantity);
		System.out.println("Type: " + type);
		System.out.println("Packaging: " + packaging);
		System.out.println("Weight: " + weight);
		System.out.println("Is Sugar Free: " + sugarFree);
	}
}
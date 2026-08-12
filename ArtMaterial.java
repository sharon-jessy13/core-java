class ArtMaterial {

    int id;
    String name;
    String brand;
    String type;
    String color;
    double price;
    int quantity;
    String material;
    String usage;
    boolean washable;

    ArtMaterial(int id, String name, String brand, String type,
                String color, double price, int quantity, String material,
                String usage, boolean washable) {

        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.usage = usage;
        this.washable = washable;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Material: " + material);
		System.out.println("Usage: " + usage);
		System.out.println("Is Washable: " + washable);
	}
}
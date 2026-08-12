class InkPad {

    int id;
    String brand;
    String color;
    String inkType;
    double price;
    String material;
    int width;
    int height;
    String usage;
    boolean washable;

    InkPad(int id, String brand, String color, String inkType,
           double price, String material, int width, int height,
           String usage, boolean washable) {

        this.id = id;
        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.price = price;
        this.material = material;
        this.width = width;
        this.height = height;
        this.usage = usage;
        this.washable = washable;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Ink Type: " + inkType);
		System.out.println("Price: " + price);
		System.out.println("Material: " + material);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Usage: " + usage);
		System.out.println("Is Washable: " + washable);
	}
}
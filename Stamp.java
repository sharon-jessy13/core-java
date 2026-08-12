class Stamp {

    int id;
    String design;
    String material;
    String color;
    double price;
    String size;
    String type;
    String brand;
    String usage;
    boolean selfInking;

    Stamp(int id, String design, String material, String color,
          double price, String size, String type, String brand,
          String usage, boolean selfInking) {

        this.id = id;
        this.design = design;
        this.material = material;
        this.color = color;
        this.price = price;
        this.size = size;
        this.type = type;
        this.brand = brand;
        this.usage = usage;
        this.selfInking = selfInking;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Design: " + design);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Size: " + size);
		System.out.println("Type: " + type);
		System.out.println("Brand: " + brand);
		System.out.println("Usage: " + usage);
		System.out.println("Is Self Inking: " + selfInking);
	}
}
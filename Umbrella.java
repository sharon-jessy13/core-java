class Umbrella {

    int id;
    String brand;
    String color;
    double price;
    String material;
    int length;
    int ribs;
    String handleType;
    String type;
    boolean waterproof;

    Umbrella(int id, String brand, String color, double price,
             String material, int length, int ribs, String handleType,
             String type, boolean waterproof) {

        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.length = length;
        this.ribs = ribs;
        this.handleType = handleType;
        this.type = type;
        this.waterproof = waterproof;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Material: " + material);
		System.out.println("Length: " + length);
		System.out.println("Number of Ribs: " + ribs);
		System.out.println("Handle Type: " + handleType);
		System.out.println("Type: " + type);
		System.out.println("Is Waterproof: " + waterproof);
	}
}
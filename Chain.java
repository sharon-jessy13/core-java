class Chain {

    int id;
    String material;
    String color;
    double price;
    String brand;
    double length;
    int weight;
    String design;
    String type;
    boolean isGold;

    Chain(int id, String material, String color, double price, String brand,
          double length, int weight, String design, String type, boolean isGold) {

        this.id = id;
        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.length = length;
        this.weight = weight;
        this.design = design;
        this.type = type;
        this.isGold = isGold;
    }

   
	public void display() {
		System.out.println("id: " + id);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Brand: " + brand);
		System.out.println("Length: " + length);
		System.out.println("Weight: " + weight);
		System.out.println("Design: " + design);
		System.out.println("Type: " + type);
		System.out.println("Is this Gold: " + isGold);
	}
}
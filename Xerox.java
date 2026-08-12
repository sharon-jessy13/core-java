class Xerox {

    int id;
    String brand;
    String model;
    double price;
    String color;
    int speed;
    String paperSize;
    String technology;
    int capacity;
    boolean scanner;

    Xerox(int id, String brand, String model, double price,
          String color, int speed, String paperSize, String technology,
          int capacity, boolean scanner) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.speed = speed;
        this.paperSize = paperSize;
        this.technology = technology;
        this.capacity = capacity;
        this.scanner = scanner;
    }

   public void display() {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed);
		System.out.println("Paper Size: " + paperSize);
		System.out.println("Technology: " + technology);
		System.out.println("Capacity: " + capacity);
		System.out.println("Has Scanner: " + scanner);
	}
}
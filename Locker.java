class Locker {

    int id;
    String brand;
    String material;
    String color;
    double price;
    String type;
    int capacity;
    String lockType;
    double height;
    boolean fireProof;

    Locker(int id, String brand, String material, String color,
           double price, String type, int capacity, String lockType,
           double height, boolean fireProof) {

        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.type = type;
        this.capacity = capacity;
        this.lockType = lockType;
        this.height = height;
        this.fireProof = fireProof;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Type: " + type);
		System.out.println("Capacity: " + capacity);
		System.out.println("Lock Type: " + lockType);
		System.out.println("Height: " + height);
		System.out.println("Is Fire Proof: " + fireProof);
	}
}
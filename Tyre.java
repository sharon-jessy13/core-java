class Tyre {

    int id;
    String brand;
    String model;
    double price;
    int size;
    String vehicleType;
    String material;
    int warranty;
    String treadType;
    boolean tubeless;

    Tyre(int id, String brand, String model, double price,
         int size, String vehicleType, String material, int warranty,
         String treadType, boolean tubeless) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
        this.vehicleType = vehicleType;
        this.material = material;
        this.warranty = warranty;
        this.treadType = treadType;
        this.tubeless = tubeless;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Size: " + size);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Material: " + material);
		System.out.println("Warranty: " + warranty);
		System.out.println("Tread Type: " + treadType);
		System.out.println("Is Tubeless: " + tubeless);
	
}
class Specs {

    int id;
    String brand;
    String frameColor;
    String frameType;
    double price;
    String lensType;
    String shape;
    double lensPower;
    String material;
    boolean polarized;

    Specs(int id, String brand, String frameColor, String frameType,
          double price, String lensType, String shape, double lensPower,
          String material, boolean polarized) {

        this.id = id;
        this.brand = brand;
        this.frameColor = frameColor;
        this.frameType = frameType;
        this.price = price;
        this.lensType = lensType;
        this.shape = shape;
        this.lensPower = lensPower;
        this.material = material;
        this.polarized = polarized;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Frame Color: " + frameColor);
		System.out.println("Frame Type: " + frameType);
		System.out.println("Price: " + price);
		System.out.println("Lens Type: " + lensType);
		System.out.println("Shape: " + shape);
		System.out.println("Lens Power: " + lensPower);
		System.out.println("Material: " + material);
		System.out.println("Is Polarized: " + polarized);
	}
}
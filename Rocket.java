class Rocket {

    int id;
    String name;
    String country;
    double height;
    double weight;
    String fuelType;
    int stages;
    double speed;
    String manufacturer;
    boolean reusable;

    Rocket(int id, String name, String country, double height,
           double weight, String fuelType, int stages, double speed,
           String manufacturer, boolean reusable) {

        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.fuelType = fuelType;
        this.stages = stages;
        this.speed = speed;
        this.manufacturer = manufacturer;
        this.reusable = reusable;
    }

    public void display() {
		System.out.println("id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Country: " + country);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Stages: " + stages);
		System.out.println("Speed: " + speed);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Is Reusable: " + reusable);
	}
}
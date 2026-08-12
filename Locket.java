class Locket {

    int id;
    String material;
    String color;
    double price;
    String brand;
    String shape;
    String design;
    int weight;
    String size;
    boolean isGold;

    Locket(int id, String material, String color, double price, String brand,
           String shape, String design, int weight, String size, boolean isGold) {

        this.id = id;
        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.shape = shape;
        this.design = design;
        this.weight = weight;
        this.size = size;
        this.isGold = isGold;
    }

    public void display() {
        System.out.println("id is : "+id);
        System.out.println("material: " + material);
        System.out.println("color: "+color);
        System.out.println("Price: " +price);
        System.out.println("Brand :" + brand);
        System.out.println("Shape:"+ shape);
        System.out.println("Design:"+ design);
        System.out.println("Weight:" + weight);
        System.out.println("Size:" + size);
        System.out.println("is it gold: " +isGold);
    }
}
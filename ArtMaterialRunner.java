class ArtMaterialRunner {

    public static void main(String[] art) {

        ArtMaterial a1 = new ArtMaterial(1, "Water Color","Camlin", "Paint", 
				"Blue", 150, 12,"Water Color", "Painting", true);
        a1.display();


        ArtMaterial a2 = new ArtMaterial(2, "Sketch Pens","Faber-Castell", "Pen",
				"Multi Color", 200, 24,"Plastic", "Sketching", false);
        a2.display();


        ArtMaterial a3 = new ArtMaterial(3, "Acrylic Paint","Brustro", "Paint",
				"Red", 300, 10,"Acrylic", "Canvas Painting", true);
        a3.display();

    }
}
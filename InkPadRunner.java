class InkPadRunner {

    public static void main(String[] ink) {

        InkPad i1 = new InkPad(1, "Camlin", "Blue", "Water Based",
                50, "Foam", 10, 15, "Stamping", true);
        i1.display();


        InkPad i2 = new InkPad(2, "Brustro", "Black", "Oil Based",
                80, "Foam", 12, 18, "Crafting", false);
        i2.display();


        InkPad i3 = new InkPad(3, "Faber-Castell", "Red", "Water Based",
                60, "Foam", 11, 16, "Printing", true);
        i3.display();

    }
}
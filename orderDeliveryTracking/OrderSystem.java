class OrderSystem {

    public static void takeOrder() {

        System.out.println("takeOrder started");

        InventoryCheck.validate();

        System.out.println("takeOrder ended");
    }
}
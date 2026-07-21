class InventoryCheck {

    public static void validate() {

        System.out.println("validate started");

        Warehouse.fetchFromAisle();

        System.out.println("validate ended");
    }
}
class DispatchVehicle {

    public static void outOfDelivery() {

        System.out.println("outOfDelivery started");

        DeliveryAgent.reachDoorStep();

        System.out.println("outOfDelivery ended");
    }
}
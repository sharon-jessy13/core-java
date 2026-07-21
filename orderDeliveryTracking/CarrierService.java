class CarrierService {

    public static void pickupPackage() {

        System.out.println("pickupPackage started");

        HubRouter.sortToZipCode();

        System.out.println("pickupPackage ended");
    }
}
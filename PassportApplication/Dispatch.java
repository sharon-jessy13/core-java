class Dispatch {

    public static void sendPassport() {

        System.out.println("sendPassport started");
		
		SignaturePortal.collectSignature();

       
        System.out.println("sendPassport ended");
    }
}
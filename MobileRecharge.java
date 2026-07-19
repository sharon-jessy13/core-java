class MobileRecharge {

    static boolean isCreated;

    static String customerName;
    static long mobileNumber;
    static String serviceProvider;
    static String rechargePlan;
    static int validity;
    static int amount;
    static String paymentMode;
    static String status;

    public static boolean createRechargeDetails(String cName, long cMobileNumber,
            String cServiceProvider, String cRechargePlan,
            int cValidity, int cAmount,
            String cPaymentMode, String cStatus) {

        isCreated = false;

        boolean isCustomerNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isServiceProviderValid = false;
        boolean isRechargePlanValid = false;
        boolean isValidityValid = false;
        boolean isAmountValid = false;
        boolean isPaymentModeValid = false;
        boolean isStatusValid = false;

        if (cName != null) {
            customerName = cName;
            isCustomerNameValid = true;
        } else {
            System.out.println("Invalid Customer Name");
        }

        if (cMobileNumber > 0) {
            mobileNumber = cMobileNumber;
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        if (cServiceProvider != null) {
            serviceProvider = cServiceProvider;
            isServiceProviderValid = true;
        } else {
            System.out.println("Invalid Service Provider");
        }

        if (cRechargePlan != null) {
            rechargePlan = cRechargePlan;
            isRechargePlanValid = true;
        } else {
            System.out.println("Invalid Recharge Plan");
        }

        if (cValidity > 0) {
            validity = cValidity;
            isValidityValid = true;
        } else {
            System.out.println("Invalid Validity");
        }

        if (cAmount > 0) {
            amount = cAmount;
            isAmountValid = true;
        } else {
            System.out.println("Invalid Amount");
        }

        if (cPaymentMode != null) {
            paymentMode = cPaymentMode;
            isPaymentModeValid = true;
        } else {
            System.out.println("Invalid Payment Mode");
        }

        if (cStatus != null) {
            status = cStatus;
            isStatusValid = true;
        } else {
            System.out.println("Invalid Status");
        }

        if (isCustomerNameValid == true && isMobileNumberValid == true && isServiceProviderValid == true &&
                isRechargePlanValid == true && isValidityValid == true && isAmountValid == true
                && isPaymentModeValid == true && isStatusValid == true) {

            isCreated = true;
        }

        return isCreated;
		
    }

    public static void getDetails() {

        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Service Provider : " + serviceProvider);
        System.out.println("Recharge Plan : " + rechargePlan);
        System.out.println("Validity : " + validity + " Days");
        System.out.println("Amount : " + amount);
        System.out.println("Payment Mode : " + paymentMode);
        System.out.println("Status : " + status);
		
		
    }
	
	
}
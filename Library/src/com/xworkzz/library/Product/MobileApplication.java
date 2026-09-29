package com.xworkzz.library.Product;

public class MobileApplication {

    public int applicationId;
    public String applicationName;
    public String developer;
    public String platform;
    public double size;

    @Override
    public boolean equals(Object obj) {

        MobileApplication application = (MobileApplication) obj;

        if (this.applicationId == application.applicationId
                && this.applicationName.equals(application.applicationName)
                && this.developer.equals(application.developer)
                && this.platform.equals(application.platform)
                && this.size == application.size) {

            return true;
        }

        return false;
    }
}

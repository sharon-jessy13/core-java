package com.xworkzz.library.Product;

public class Industry {

    public int industryId;
    public String industryName;
    public String location;
    public String type;
    public double annualRevenue;

    @Override
    public boolean equals(Object obj) {

        Industry industry = (Industry) obj;

        if (this.industryId == industry.industryId
                && this.industryName.equals(industry.industryName)
                && this.location.equals(industry.location)
                && this.type.equals(industry.type)
                && this.annualRevenue == industry.annualRevenue) {

            return true;
        }

        return false;
    }
}

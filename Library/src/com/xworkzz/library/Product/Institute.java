package com.xworkzz.library.Product;

public class Institute {

    public int instituteId;
    public String instituteName;
    public String address;
    public String course;
    public double fees;

    @Override
    public boolean equals(Object obj) {

        Institute institute = (Institute) obj;

        if (this.instituteId == institute.instituteId
                && this.instituteName.equals(institute.instituteName)
                && this.address.equals(institute.address)
                && this.course.equals(institute.course)
                && this.fees == institute.fees) {

            return true;
        }

        return false;
    }
}

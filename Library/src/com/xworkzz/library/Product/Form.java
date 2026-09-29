package com.xworkzz.library.Product;

public class Form {

    public int formId;
    public String formName;
    public String applicantName;
    public String purpose;
    public String status;

    @Override
    public boolean equals(Object obj) {

        Form form = (Form) obj;

        if (this.formId == form.formId
                && this.formName.equals(form.formName)
                && this.applicantName.equals(form.applicantName)
                && this.purpose.equals(form.purpose)
                && this.status.equals(form.status)) {

            return true;
        }

        return false;
    }
}

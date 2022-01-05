package holidayTasks;

public class CommissionEmployee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSalesNumber;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalesNumber, double commissionRate) {

        if ( grossSalesNumber < 0.0 || commissionRate < 0.0){
            throw new IllegalArgumentException("invalid gross sales or commission rate");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSalesNumber = grossSalesNumber;
        this.commissionRate = commissionRate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSalesNumber(double grossSalesNumber) {
        this.grossSalesNumber = grossSalesNumber;
    }


    public double getGrossSalesNumber() {
        return grossSalesNumber;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


    public double getCommissionRate() {
        return commissionRate;
    }


    public double getEarnings(){
        return grossSalesNumber * commissionRate;
    }

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber, "gross sales", grossSalesNumber,
                "commission rate", commissionRate);

    }



}

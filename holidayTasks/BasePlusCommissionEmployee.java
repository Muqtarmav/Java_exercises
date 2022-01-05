package holidayTasks;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalesNumber, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSalesNumber, commissionRate);

            if (baseSalary < 0.0) {
                throw new IllegalArgumentException("base salary must be greater than 0");
            }
                this.baseSalary = baseSalary;

    }


    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("no valid");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double getEarnings(){
        return baseSalary +( getGrossSalesNumber() * getCommissionRate());
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSalesNumber(), "commission rate", getCommissionRate(),
                "base salary", baseSalary);
    }
}

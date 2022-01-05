package Tasks2;

public class SalariedEmployee extends Employee{

    private final double weeklySalary;


    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary < 0.0){
            throw new IllegalArgumentException("invalid week salary");
        }

    }


    public double getWeeklySalary(){
        return weeklySalary;
    }


    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}

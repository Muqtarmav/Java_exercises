package Tasks2;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if ( grossSales < 0.0 || commissionRate < 0.0 ){
            throw new IllegalArgumentException("invalid gross sales or commission rate");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("not valid");
        }

        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if ( commissionRate < 0.0){
            throw new IllegalArgumentException("commission not valid");
        }

        this.commissionRate = commissionRate;
    }

    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
        return  commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }


    @Override
    public  String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }

    @Override
    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }
}

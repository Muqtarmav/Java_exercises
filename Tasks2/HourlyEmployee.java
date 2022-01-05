package Tasks2;

public class HourlyEmployee extends Employee {

    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage) {
        super(firstName, lastName, socialSecurityNumber);

        if (hour < 0.0) {
            throw new IllegalArgumentException("hour is not valid");
        }

        if (wage < 0.0) {
            throw new IllegalArgumentException("wage is not valid");
        }
        this.hour = hour;
        this.wage = wage;
    }

        public void setHour(double hour){

        if ( hour < 0.0){
            throw new IllegalArgumentException("hour not valid");
        }

        this.hour = hour;
        }

        public double getHour(){
        return hour;
        }

        public void setWage(double wage){
        if ( wage < 0.0){
            throw  new IllegalArgumentException("wage is not valid");
        }
                this.wage = wage;
    }

        public double getWage(){
            return wage;
    }


    @Override
    public double earnings() {
            if (getHour() <= 40) // no overtime
                return getWage() * getHour();
            else
                return 40 * getWage() + (getHour() - 40) * getWage() * 1.5;
    }

    public String toString(){

        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHour());
    }


    @Override
    public double getPaymentAmount() {
        return getWage();
    }
}

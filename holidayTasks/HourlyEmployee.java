package holidayTasks;

public class HourlyEmployee extends CommissionEmployee {

    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalesNumber, double commissionRate, double hour, double wage) {
        super(firstName, lastName, socialSecurityNumber, grossSalesNumber, commissionRate);

        if ( hour < 0 || hour > 169 ){
            throw new IllegalArgumentException("hours is not valid");
        }

        if ( wage < 0.0){
            throw new IllegalArgumentException("wage is invalid");
        }

        this.hour = hour;
        this.wage = wage;

    }


        public void setHour(double hour){
        if ( hour < 0 || hour > 169){
            throw new IllegalArgumentException("hour is not valid");
        }

        this.hour = hour;
        }

        public double getHour(){
        return hour;
    }

        public void setWage(double wage){

        if (wage < 0.0){
            throw new IllegalArgumentException("wage is not valid");
        }

        this.wage = wage;
        }

        public double getWage(){
        return wage;
        }

        @Override
        public double getEarnings() {

            if (getHour() <= 40) {
                return getWage() * getHour();
            }
            else {
                return 40 * getWage() + (getHour() - 40) * getWage() * 1.5;
            }
        }


}

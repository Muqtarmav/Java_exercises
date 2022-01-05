package holidayTasks;

public class Account {

    private String name;
    private double balance;

//    public Account(String name, double balance) {
//        this.name = name;
//
//        if (balance > 0.0) {
//            this.balance = balance;
//
//        }
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double depositAmount) {

        if (depositAmount > 0.0)
            balance = balance + depositAmount;

    }

    public void setBalance2( double withdrawAmount){

        if ( withdrawAmount < balance)
            balance = balance - withdrawAmount;

    }


    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }




}

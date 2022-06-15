package Practise.oop;

public class Account {

    private String name;
    private double balance;


   public  void setName(String name){
        this.name = name;
    }

    public void setDeposit(double deposit){
        if (deposit > 0.0){
            balance = balance + deposit;
        }

    }

    public void setWithdraw( double withdraw) {
        if (withdraw <= balance) {
            balance = balance - withdraw;
        }
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }



}

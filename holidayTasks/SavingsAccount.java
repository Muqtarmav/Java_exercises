package holidayTasks;

public class SavingsAccount {
    protected static  double annualInterestRate = 4.0;

    private double savingsBalance;

    public void setSavingsBalance(double amountDeposit){
        if ( amountDeposit < 0.0){
            throw new IllegalArgumentException("not valid");
        }

          savingsBalance = amountDeposit;
    }


        public double getSavingsBalance() {
            return savingsBalance + calculateMonthlyInterest();
    }

        public double calculateMonthlyInterest(){
            return savingsBalance * annualInterestRate / 12;
    }
//
//        public double newSavingBalance(){
//        return calculateMonthlyInterest();
//        }
//

        public static void modifyInterestRate(double newInterestRate) {
            if (newInterestRate >= 5.0) {
                annualInterestRate = newInterestRate;
            }
            else{
                throw new IllegalArgumentException("interest rate must be >=5.0");
            }
        }
}

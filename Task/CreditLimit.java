package holidayTasks;

import java.util.Scanner;

public class CreditLimit {

    public static void main(String[] args) {

        int accountNumber;
        int beginningBalance;
        int itemTotal;
        int creditTotal;
        int creditLimit;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the beggining balance");
        beginningBalance = input.nextInt();

        System.out.println("enter the charges");
        itemTotal = input.nextInt();

        System.out.println("enter crdeit total");
        creditTotal = input.nextInt();

        int newBalance = beginningBalance + itemTotal - creditTotal;

        System.out.println(newBalance);



    }
}

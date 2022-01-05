package holidayTasks;

import java.util.Scanner;

public class Quotients {

    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter numerator");
        int numerator = input.nextInt();

        System.out.println("enter denominator");
        int denominator = input.nextInt();

        try {
            int resUlt = numerator/ denominator;

            if (denominator == 0) {
                throw new IllegalArgumentException();
            }
        }

        catch (ArithmeticException ex){
            System.out.println("cannot be divisible by zero");
        }



        System.out.println(quotient(numerator, denominator));
    }
}

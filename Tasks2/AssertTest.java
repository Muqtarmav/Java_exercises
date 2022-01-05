package Tasks2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number between 0 and 10");
        int number = input.nextInt();

        assert ( number >=0 && number <=10) : "bad number: "  + number;

        System.out.printf("you entered : %d%n", number);
    }
}


class ExceptionIf{
    public static int  quotient(int numerator, int denominator){

        if ( denominator == 0){
            //System.exit(1);
            System.out.println("cannot be divisible by 0");
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int numerator = input.nextInt();

        System.out.println("enter denominator");
        int denominator = input.nextInt();

        //int result = numerator / denominator;

        System.out.println(quotient(numerator, denominator));
    }

}



class ExceptionIfElse{
    public static int  quotient(int numerator, int denominator){

        if ( denominator == 0){
            throw new ArithmeticException("cannot be divisible b y 0");
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int numerator = input.nextInt();

        System.out.println("enter denominator");
        int denominator = input.nextInt();


        try {
            if( denominator == 0) {
                int result = numerator / denominator;
            }
        }
        catch (ArithmeticException e) {
            System.out.println("not divisible bvy 0");
        }

        catch (InputMismatchException e){
            System.out.println("wrong value");
        }
        //int result = numerator / denominator;

        System.out.println(quotient(numerator, denominator));
    }

}


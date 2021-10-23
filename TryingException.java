package Jexercises;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryingException {
    public static void main(String[] args) {
        int num1;
        int num2;
        int total;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();

        try {
            total = num1 / num2;
            System.out.println("this is the total" + total);
        }

        catch(ArithmeticException ex){
            System.out.println("cannot be divisible by 0");
        }

    }
}

class tryye{
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
try {
    System.out.println("eNTER NUMBER");
    num = input.nextInt();

}
catch (InputMismatchException ex){
    System.out.println("this is wrong try again!, enter an integer");

    input.nextLine();
}


    }
}

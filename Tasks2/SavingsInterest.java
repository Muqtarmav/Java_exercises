package Tasks2;

import java.util.Scanner;

public class SavingsInterest {

    public static void main(String[] args) {

        double principal = 1000;
        double r = 0.05;
        //int n = 10;
        double a;



        System.out.printf("%s %n", "Year", "Amount on deposit");

        for ( int year = 1 ; year <= 10; year++) {

            a = principal * Math.pow(1.0 + r, year);

            System.out.printf("%4d%,20.2f%n", year, a);
        }

    }
}

    class jfjk{
        public static void main(String[] args) {

            System.out.println("enter your name ");
            System.out.print("muqtar adetunji");

            System.out.println("\"in quotes\"");
        }
    }


    class computeArea{
        public static void main(String[] args) {

            double area;
            double radius;

            Scanner input = new Scanner(System.in);

            System.out.println("enter radius");
            radius = input.nextDouble();

            area = radius * radius * Math.PI;


            System.out.println(area);

        }
    }

    class Average{
        public static void main(String[] args) {

            int number1;
            int number2;
            int number3;


            Scanner input = new Scanner(System.in);

            System.out.println("enter first number");
            number1 = input.nextInt();

            System.out.println("enter secound number");
            number2 = input.nextInt();

            System.out.println("enter third number");
            number3 = input.nextInt();


            int average = (number1 + number2 + number3) / 3;


            System.out.println(average);
        }
    }

    class EvenOrOdd{
        public static void main(String[] args) {

            int number;

            Scanner input = new Scanner(System.in);
            System.out.println("enter a number");

            number = input.nextInt();

            if ( number % 2 == 0){
                System.out.println("its an even number");
            }
            else {
                System.out.println("its an odd number");
            }
        }
    }



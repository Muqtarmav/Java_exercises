package Practise.chap18;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveMethod {

    public static long Factorial(long number) {

        if (number <= 1) {
            return 1;
        } else {
            return number * Factorial(number - 1);
        }

    }


    public static void main(String[] args) {

        for (int count = 0; count <= 21; count++) {
            System.out.printf("\"%d! = %d%n", count, Factorial(count));
        }


    }
}

    class Fibonacci{

        private static BigInteger TWO = BigInteger.valueOf(2);

        public static BigInteger fibonacci(BigInteger number) {

            if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
                return number;
            } else {
                return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
            }
        }

        public static void main(String[] args) {

            for ( int count = 0; count <= 40; count++){
                System.out.printf("Fibonacci of %d is: %d%n", count,
                fibonacci(BigInteger.valueOf(count)));
            }
        }
    }


    class jkkewl{

        public static int factorial(int number) {

            if ( number == 1){
                return 1;
            }
            else {
                return number * factorial(number - 1);
            }

        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter a number");
            int number = input.nextInt();

            System.out.println("the factorial of  " + number  + " is "  + factorial(number) );

        }

        }

        class kjdk{

            public static int  factorial(int number ) {

                if ( number == 1 ){
                    return 1;
                }
                else {
                    return number * factorial(number - 1);
                }

            }
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("enter a number");

                int number = input.nextInt();

                for ( int count = 0 ; count <= number; count++){
                }
                System.out.println("the factorial of  " + number  + " is "  + factorial(number) );
            }
        }

        class ComputeFibonacci{

            public static long fib(long number) {

                if ( number == 0){
                    return 1;
                }
                else if (number == 1){
                    return 1;
                }
                else {
                    return fib(number -1) + fib(number + 2);
                }

            }

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("enter index");

                long number = input.nextLong();


        System.out.println("The Fibonacci number at index "
                + number + " is " + fib(number));
            }
        }


        class sumNum{

            public static int sum(int number) {

                if ( number > 0){
                    return number + sum(number - 1);
                }
                else
                    return 0;

            }

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("enter number");
                int number = input.nextInt();

                System.out.println(sum(number));

            }
        }

        class eike{

            public static  int  factorial(int number) {

                if ( number == 0){
                    return 1;
                }
                else {
                    return number * factorial(number - 1);
                }

            }

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("enter a  umber");
                int number = input.nextInt();


                System.out.println(factorial(number));
            }
        }


        class HollowSquare {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("enter square sides");
                int squareSides = input.nextInt();

                for (int column = 0; column < squareSides; column++) {

                    for (int row = 0; row < column + 1; row++)
                        System.out.print("*");

                    System.out.println();
                }
                ;
            }

            class asteri {
                public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);

                    System.out.println("enter a number");
                    int number = input.nextInt();

                    for (int count = 0; count < number; count++) {

                        for (int row = number; row > 0; row--)
                            System.out.println("*");

                        System.out.println();
                    }

                }
            }

        }

        class kjfk {

            public static int  factorial(int number) {
                if ( number <= 1){
                    return 1;
                }
                else{
                    return number * factorial(number - 1);
                }

            }
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("enter number");
                int number = input.nextInt();

                System.out.println(factorial(number));

                }

            }


            class dllw {
                public static void main(String[] args) {

                    int factorial = 1;
                    Scanner input = new Scanner(System.in);

                    System.out.println("enter number");
                    int number = input.nextInt();

                    for (int count = 1; count <= number; count++) {
                        factorial = factorial * count;
                    }

                    System.out.printf("Factorial of %d = %d", number, factorial);

                }
            }
                class swapNum{
                    public static void main(String[] args) {

                        int temporary;
                        int permanent;
                        Scanner input = new Scanner(System.in);

                        System.out.println("enter first number");
                        int number1 = input.nextInt();

                        System.out.println("enter second number");
                        int number2 = input.nextInt();

                        temporary = number1;
                        System.out.println("first number before swap" + temporary);

                        number1 = number2;


                        number2 = temporary;

                        System.out.println("after swap");
                        System.out.println(number1);
                        System.out.println(number2);
                    }

        }


        class reversedr {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("enter word");
                String word = input.next();

                for (int count = word.length() - 1; count >= 0; count--) {
                    System.out.print(word.charAt(count));
                }
            }
        }


        class reverseNumber{

        public static int reverse(int number) {
            int rev = 0;
            int rem;

            while (number > 0){
                rem = number % 10;
                rev = rev * 10 + rem;

                number = number / 10;
            }


            return rev;
        }


            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("enter the  number");
                int number = input.nextInt();

                System.out.println(reverse(number));

            }
        }

        class edk{
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("enter first number");
                int number1 = input.nextInt();

                System.out.println("enter second number");
                int number2 = input.nextInt();

                int temporay = number1;

                number1 = number2;

              number2 = temporay;

                System.out.println(number1);
                System.out.println(number2);


            }
        }

        class odd{
            public static void main(String[] args) {

                int product =1;
                for ( int count = 1; count <= 15; count+=2) {

                    product = product * count;
                    System.out.println(count);
                }

                }


            }

            class repl{
                public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);

                    System.out.println("enter number");
                    int number1 = input.nextInt();


                    System.out.println("enter number");
                    int number2 = input.nextInt();

                    int temporary = number1;

                    number1 = number2;

                    number2 = temporary;

                    System.out.println("after swap");

                    System.out.println(number1);
                    System.out.println(number2);

                }
            }

            class ekk{

                public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);

                    System.out.println("enter word");
                    String word = input.next();

                    for ( int count = word.length() - 1 ; count >= 0; count--){
                        System.out.print(word.charAt(count));
                    }
                }
            }

            class slkd{
                public static int reversedd(int number) {

                    int rev = 0;
                    int rem;

                    while (number > 0) {
                        rem = number % 10;
                        rev = rev * 10 + rem;
                        number = number / 10;
                    }
                    return rev;
                }

                public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);

                    System.out.println("enter number");
                    int number = input.nextInt();

                    System.out.println(reversedd(number));
                }
}


    class kk{
        public static int factorial(int number) {

            if ( number <= 1){
                return 1;
            }
            else {
                return factorial( number - 1) * number;
            }

        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            System.out.println("enter a number");
            int number = input.nextInt();

            System.out.println(factorial(number));
        }
    }

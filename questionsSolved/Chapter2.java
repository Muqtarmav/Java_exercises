package Practise.questionsSolved;

import java.util.Scanner;
public class Chapter2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number 1");
        int number1 = input.nextInt();


        System.out.println("enter number 2");
        int number2 = input.nextInt();

        int addition = number1 + number2;
        int division = number1 / number2;
        int multiply = number1 * number2;
        int substract = number1 - number2;


        System.out.println(addition);
        System.out.println(division);
        System.out.println(multiply);
        System.out.println(substract);



    }
}

class Comparison{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int number = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();


        if ( number > number2){
            System.out.println("this is the largest " + number);
        }
        else if ( number == number2){
            System.out.println("these numbers are equal");
        }

        else {
            System.out.println("number 2 is the largest " + number2);
        }

    }
}

class ThreeIntegers{
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter number 1");
            int number1 = input.nextInt();

            System.out.println("enter number 2");
            int number2 = input.nextInt();

            System.out.println("enter thrid number");
            int number3 = input.nextInt();


            int addition = number1 + number2 + number3;
            int division = number1 / number2 + number3;
            int multiply = number1 * number2 + number3;
            int substract = number1 - number2 + number3;


            System.out.println(addition);
            System.out.println(division);
            System.out.println(multiply);
            System.out.println(substract);

          int resultMin =  Math.min(number1, Math.min(number2, number3));
          int resultMax = Math.max(number1, Math.max(number2, number3));

        System.out.println(resultMin);
        System.out.println(resultMax);
    }

}

//comparing five integers

class FiveIntegers{



    public static void main(String[] args) {

        int largest;
        int smallest;

        Scanner input = new Scanner(System.in);

        System.out.println("enter number 1");
        int number1 = input.nextInt();

        System.out.println("enter number 2");
        int number2 = input.nextInt();

        System.out.println("enter thrid number");
        int number3 = input.nextInt();

        System.out.println("enter thrid number");
        int number4 = input.nextInt();

        System.out.println("enter thrid number");
        int number5 = input.nextInt();


         largest = number1;
         smallest = number1;

         if ( number2 > largest ){
             largest = number2;

         }

         if ( number3 > largest){
             largest = number3;

         }

          if ( number4 > largest ){
             largest = number4;

         }

          if (number5 > largest){
             largest = number5;

         }


        if ( number2 < smallest ){
            smallest = number2;
        }

        if ( number3 < smallest){
            smallest = number3;
        }

        if ( number4 < smallest ){
            smallest = number4;
        }

        if (number5 < smallest){
            smallest = number5;
        }

        System.out.println(largest);
        System.out.println(smallest);
    }
}


class OddAndEven{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number 1 ");
        int number = input.nextInt();

        if ( number % 2 == 0){
            System.out.println("this number is even");
        }

        else{
            System.out.println("number is odd");
        }
    }
}

class Multiple{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();

        if ( number1 % number2 == 0){
            System.out.println("number is a multiple");
        }

        else {
            System.out.println("number is not a multiple");
        }
    }
}

class Circumference{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter radius as integer");
        int radius = input.nextInt();

        // diamter

       int  diameter = radius * radius;

       double circum = 2 * Math.PI * radius;

       double area = Math.PI * radius * radius;

        System.out.println(diameter);
        System.out.println(circum);
        System.out.println(area);

    }
}

class CountPositive{
    public static void main(String[] args) {

        int numPositive = 0;
        int numNegative = 0;
        int numZero = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();

        System.out.println("enter third number");
        int number3 = input.nextInt();

        System.out.println("enter fourth number");
        int number4 = input.nextInt();

        System.out.println("enter five number");
        int number5 = input.nextInt();


        if ( number1 > 0) {
            numPositive = numPositive + 1;
        }
        if ( number2 > 0) {
            numPositive = numPositive + 1;
        }
        if ( number3 > 0) {
            numPositive = numPositive + 1;
        }
        if ( number4 > 0) {
            numPositive = numPositive + 1;
        }
        if ( number5 > 0) {
            numPositive = numPositive + 1;
        }

        if ( number1 < 0) {
            numNegative = numNegative + 1;
        }
        if ( number2 < 0) {
            numNegative = numNegative + 1;
        }
        if ( number3 < 0) {
            numNegative = numNegative + 1;
        }
        if ( number4 < 0) {
            numNegative = numNegative + 1;
        }
        if ( number5 < 0) {
            numNegative = numNegative + 1;
        }

        if ( number1 == 0) {
            numZero = numZero + 1;
        }
        if ( number2 == 0) {
            numZero = numZero + 1;
        }
        if ( number3 == 0) {
            numZero = numZero + 1;
        }
        if ( number4 == 0) {
            numZero = numZero + 1;
        }
        if ( number5 == 0) {
            numZero = numZero + 1;
        }


        System.out.println(numPositive);
        System.out.println(numNegative);
        System.out.println(numZero);

    }



    }


    class CheckBmi{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("enter weight");
            double weight = input.nextDouble();

            System.out.println("enter height");
            double height = input.nextDouble();

        double BMi = weight * 703 / height * height;

        if (BMi < 18.5){
            System.out.println("underweight");
        }

        if (BMi >= 18.5 && BMi <= 24.9) {
            System.out.println("NORMAL");
        }

        if (BMi > 25 && BMi <= 29){
                System.out.println("overweight");
            }

        if (BMi > 30){
            System.out.println("overweight");
        }

        }
    }
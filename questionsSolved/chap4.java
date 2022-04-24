package Practise.questionsSolved;

import java.util.Scanner;

public class chap4 {
    public static void main(String[] args) {
        int gallon = 0;

        double milesPerGallon = 0;
        int totalMiles = 0;
        int totalGallons = 0;
        double totalMpg = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("enter miles number");
        int miles = input.nextInt();

        if (miles != -1) {
            System.out.println("enter gallons");
            gallon = input.nextInt();
        }

        while (miles != -1) {
            totalMiles = miles + 1;
            totalGallons = gallon + 1;
            totalMpg = (double) totalMiles  / totalGallons;
            milesPerGallon = (double) miles/ gallon;

            System.out.println(milesPerGallon);

            System.out.println(totalMpg);

            System.out.println("enter numbers or -1 to quit");
            miles = input.nextInt();

            if (miles != -1) {
                System.out.println("enter gallons");
                gallon = input.nextInt();
            }
        }
    }


        }


class LargestNumber{
    public static void main(String[] args) {
        int largestValue = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);

        for(int counter = 0; counter <= 10; counter++) {
            System.out.println("enter unit sold by person");
            number = input.nextInt();

            //largestValue = number;


            if (number > largestValue) {
                largestValue = number;
            }
        }

            System.out.println(largestValue);
        }

    }

class ValidateInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        int number = input.nextInt();

        while (number != 1 && number != 2) {
            System.out.println("enter number");
            number = input.nextInt();

        }

    }

}
class OddProduct {
    public static void main(String[] args) {

        int count;
        int product = 1;
        for (count = 0; count < 15; count += 2) {
            product = product + count;
        }

            System.out.print( product);
        }
    }


    class HollowAsterisk {
        public static void main(String[] args) {

            for (int count = 0; count <= 4; count++) {
                for (int column = 0; column <= 9; column++) {

                    if (count == 0 || count == 4 || column == 0 || column == 9) {
                        System.out.print("*");
                    } else {

                        System.out.print(" ");
                    }
                }

                System.out.println();

            }
        }
    }

    class filledAsterisks{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter length");
            int  number = input.nextInt();


            for ( int row = 0; row < number; row ++){
                for (int column = 0; column < 10; column++){
                    System.out.print("*");
                }

                System.out.println();
            }

        }
        }


        class TrianglePattern1{
            public static void main(String[] args) {

                for ( int count = 0; count < 9; count++){
                    for (int column = 0; column < count; column++){
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }

        class TrianglePattern2{
            public static void main(String[] args) {

                for ( int count = 1; count <= 10; count++){
                    for ( int column = 10; column > count; column--){
                        System.out.print("*");
                    }

                    System.out.println();
                }

            }

            }

       class TrianglePattern3{
        public static void main(String[] args) {

            for (int count = 10; count > 0; count--) {
                for (int column = 0; column < 10; column++) {

                    System.out.print("*");
                }

                System.out.println();

            }
        }
       }


       class TriangleSides{
           public static void main(String[] args) {

               Scanner input = new Scanner(System.in);

               int a = input.nextInt();
               int b = input.nextInt();
               int c = input.nextInt();


               if ((a + b) > c){
                   if ((a + c) > b){
                       if ((b + c) > a ){
                           System.out.println("sides are a form of triangle");
                       }
                   }

               }
           }

}

class Square{
    public static void main(String[] args) {

        for (int count = 0; count <= 4; count++){
            for(int column = 0; column <= 9; column++) {

                if (count == 0 || count == 4 || column == 0 || column == 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();

        }
    }

}

class square2{
    public static void main(String[] args) {

        for ( int count = 0; count < 10; count++){
            for (int column = 0; column < 10; column++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

class SmallestValue{
    public static void main(String[] args) {

int smallestValue = 100;
        int values;
        Scanner input = new Scanner(System.in);

        System.out.println("enter number");

        int number = input.nextInt();


        for (int count = 0; count <= number; count++) {
            System.out.println("enter values");
            values = input.nextInt();


            if ( values < smallestValue){

                smallestValue = values;
            }
        }


        System.out.println(smallestValue);


    }
}


class Factorial{
    public static void main(String[] args) {

        int factorial = 1;

        for ( int count = 1; count < 10; count++){
            factorial = factorial * count;
        }

        System.out.println(factorial);



    }
}


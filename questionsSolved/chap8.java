package Practise.questionsSolved;

import java.util.Arrays;
import java.util.Scanner;

class chap7{
    public static void main(String[] args) {

        int [] b = new int[5];


        System.out.println("index " +  "count ");

        for ( int count = 0; count < b.length; count++){
            System.out.printf("%5d%8d%n",count,  b[count]);
        }


    }
}

class evenArray {
    public static void main(String[] args) {


        final int ARRAY_Length = 10;
         int[] array = new int[ARRAY_Length];
        for (int count = 0; count < ARRAY_Length; count++) {
            array[count] = 2 + 2 * count;

        }
            System.out.println("index " + "count ");

            for (int count = 0; count < ARRAY_Length; count++) {
                System.out.printf("%5d%8d%n", count, array[count]);
            }
        }
    }

class dkelk {
    public static void main(String[] args) {
        int[] n = new int[5];

        int max = n[0];
        Scanner input = new Scanner(System.in);

        int total = 0;
        System.out.println("enter values" + n.length);


        for (int count = 0; count < n.length; count++) {
            n[count] = input.nextInt();
            total = total + n[count];


            if (n[count] > max) {
                max = n[count];

            }
        }
        System.out.println("this is the maximum " + max);
        System.out.println("here is the sum " + total);
    }
}

class AnalysingNumbers{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total= 0;
        double average = 0.0;

        System.out.println("enter number of input");
        int number = input.nextInt();

        for ( int count = 0; count < number; count++){

            int [] array = new int[number];
            System.out.println("enter number values" + array.length);
            array[count] = input.nextInt();

            total = total + array[count];
          average =(double) total / number;

        }


        System.out.println("this is the average " + average);


    }
}

class MultiArray{
    public static void main(String[] args) {

        int[][] array = {{1, 2 ,3}, {4, 5, 6}};
       // int arrayB [][] = {{7, 8,},  {9}, {3, 6 ,9}};

        for ( int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++)

                System.out.printf ("%d", array[row][column]);

                System.out.println();
            }
        }
    }


    class NMDK{
        public static void main(String[] args) {

            String [][] arrays = {{"X, O, X"}, {"O, X, O"}, {"X, O, X"}};

            for (int row = 0; row < arrays.length; row++){

                for ( int column = 0; column < arrays[row].length; column++)
                System.out.print(arrays[row][column]);
                System.out.println();
            }
        }
    }

    class Vag {
        public static double average(int... numbers) {

            double total = 0.0;

            for ( int t : numbers){
                total = total  + t;
            }

            return total / numbers.length;

        }

        public static void main(String[] args) {

            int d1 = 4;
            int d2 = 6;
            int d3 = 8;
            int d4 = 10;

            System.out.println(average(d1, d2));
            System.out.println(average(d2, d4));
        }

        }

        class ArrayManipulator {

            public static void main(String[] args) {

                int[] intArray = {3, 4, 6, 7, 9};
                Arrays.sort(intArray);

                System.out.printf("%nintArray: ");


                for (int value : intArray) {
                    System.out.println(value);
                }

                    int location = Arrays.binarySearch(intArray, 6);

                System.out.println("this is the location " + location);
                }
            }

//            public static void displayArray(int [] array, String description){
//                System.out.println(description);
//
//
//            for(int value : array) {
//                System.out.println(value);
//            }
//            }
//        }


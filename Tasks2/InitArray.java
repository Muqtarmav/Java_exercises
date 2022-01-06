package Practise.Tasks2;

import java.util.Scanner;

public class InitArray {
    public static void main(String[] args) {

        int [] c = new int [10];

        System.out.printf("%s%8s%n", "index", "value");
        for (int count = 0; count < c.length; count++){

            System.out.printf("%5d%8d%n", count, c[count]);
        }
            }
}

class arrayValue{
    public static void main(String[] args) {

        int [] array = new int[10];

        System.out.printf("%s%8s%n", "index", "value");
        for ( int count = 0; count <array.length; count++){

            System.out.printf("%5d%8d%n", count, array[count]);
        }
    }
}

class sumArray{
    public static void main(String[] args) {

        int [] c = {10, 20, 30, 40, 50,};

        int sum = 0;

        System.out.printf("%s%8s%n", "index", "value" );

        for (int count = 0; count < c.length; count++){
            System.out.printf("%s%8s%n", count, c[count]);

            sum = sum + c[count];
        }
        System.out.println("total value of array " + sum);
    }
}

class EvenNumbers{
    public static void main(String[] args) {

        int [] array = new int[10];

        int sum = 0;

        for ( int count = 0; count < array.length; count += 2) {
            System.out.println(count);
        }
         //   sum = sum + array[count];
        //}

        //System.out.println(sum);
    }
}
//
//class ArrayValue{
//    public static void main(String[] args) {
//
//         final int arrayValue = 10;
//        int [] c = new int[arrayValue];
//
//        for (int count = 0; count < c.length; count++) {
//            c[count] = 2 + 2 * count;
//        }
//            System.out.printf("%s%8s%n", "index", "value");
//
//            for (int count = 0; count < c.length; count++ ){
//                System.out.printf("%5d%8d%n", count, c[arrayValue]);
//            }
//        }
//        }
//    }
//}


class ArraySum{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter values");
        int values = input.nextInt();

          int[] array = new int [values];

        System.out.printf("%s%8s%n", "index", "values");

          for (int count = 0; count < array.length; count++){
              System.out.printf("%5d%8d%n", count, array[count]);
          }

    }
}

class StudentPoll{
    public static void main(String[] args) {

        int [] response = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        int[] frequency = new int[6];

        for ( int count = 0; count < response.length; count++){

            try {
                ++frequency[response[count]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n%n", count, response[count]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

         // output each array element's value
         for (int rating = 1; rating < frequency.length; rating++)
             System.out.printf("%6d%10d%n", rating, frequency[rating]);

    }
}

    class EnhancedSt{
        public static void main(String[] args) {

            int total = 0;
            int [] array = {10, 20, 30, 40, 50, 60};

            for ( int arrays : array){
                System.out.println(arrays);

                total = total + arrays;
            }
            System.out.println(total);
        }
    }

    class passArray {
        public static void main(String[] args) {

            int[] array = {1, 2, 3, 4, 5};

            System.out.println("values of original array");

            for (int value : array) {
                System.out.printf("%d", value);

                modifyArray(array);
                System.out.println("values of modified array");
            }

            for (int value : array) {
                System.out.printf("%d", value);
            }

            System.out.printf(
                    "%n%nEffects of passing array element value:%n" +
                            "array[3] before modifyElement: %d%n", array[3]);
            System.out.printf(
                    "array[3] after modifyElement: %d%n", array[3]);


        }

        public static void modifyArray(int[] array) {

            for (int count = 0; count < array.length; count++) {
                array[count] *= 2;
            }
        }

        // multiply argument by 2
        public static void modifyElement(int element) {
            element *= 2;
            System.out.printf(
                    "Value of element in modifyElement: %d%n", element);
        }
    }

    class ArrayProcessing {
        public static void main(String[] args) {

            int [] array =  new int[10];
            Scanner input = new Scanner(System.in);

            System.out.println("enter number" + array.length + "values");
          //  int number = input.nextInt();

            for (int count = 0; count < array.length; count++){
                array[count] = input.nextInt();
            }
            System.out.println(array);
            }

    }


package Practise;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}, {10 , 11 , 12}};

        for (int i = 0; i < array.length; i++) {
            for (int column = 0; column < array[i].length; column++)
                System.out.print(array[i][column]);

            System.out.println();
        }
    }

}

class trh {
    public static void main(String[] args) {

        int[][] b = new int[4][3];

        b[0][0] = 1;
        b[0][1] = 2;
        b[0][2] = 3;
        b[1][0] = 4;
        b[1][1] = 5;
        b[1][2] = 6;
        b[2][0] = 7;
        b[2][1] = 8;
        b[2][2] = 9;
        b[3][0] = 10;
        b[3][1] = 11;
        b[3][2] = 12;

        for (int count = 0; count < b.length; count++) {
            for (int colum = 0; colum < b[count].length; colum++)
                System.out.print(b[count][colum]);
            System.out.println();
        }
    }
}


class ryry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] b = {1, 33, 55, 77, 44};


        int max = b[0];
        int indexOfMax = 0;
        for (int count = 0; count < b.length; count++) {
            if ( b[count] > max){
                max = b[count];
                indexOfMax = count;
            }
            System.out.println("max number is " + b[count]);
        }
    }
}

class hhf{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  [] month =  {"January", "February",   "December"};
        System.out.println("enter a month 1 - 12");
        int monthNumber = input.nextInt();
        System.out.println(month [monthNumber -  1]);
    }
}

class hrh{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("enter number");
        int number = input.nextInt();

        int[] array = new int[number];
        System.out.println("enter items per number ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            total = total + array[i];


        }
        System.out.println(total);
        double average = total / number;

        int count = 0;
        for (int i = 0; i < number; i++) {
            if (array[i] > average) ;
            count++;
        }

            System.out.println(average);
            System.out.println(+count);
        }
    }

    class yurure{
    public static int sum(int i1, int i2) {
                int result = 0;
                for (int i = i1; i <= i2; i++) {
                    result = result + i;
                }
                return result;

            }
                public static void main (String [] args ){
                    System.out.println(sum(1, 10));
                    System.out.println(sum(20, 37));
                    System.out.println(sum(35, 49));
                }
            }

class hdh{
    public static int max(int i1, int i2) {
        int maximum;
        maximum = i1;

        if (i2 > i1) {
            maximum = i2;
        }

        return maximum;
    }

    public static void main(String[] args) {
        System.out.println(max(50, 16));
    }


    }

    class fjjf{
        public static void main(String[] args) {
            int i  = 5;
            int j = 2;

            int k =max( i, j);

            System.out.println("max is " + i + "and"+ j  + "is" + k   );
        }

        public static int  max(int num1, int num2) {
            int result;
            if ( num1 > num2){
                result = num1;
            }
            else{
                result = num2;
            }

            return result;


        }


    }

    class jj{
        public static void main(String[] args) {
            System.out.println("grade is");
            printGrade(78.5);

            System.out.println("grade is");
            printGrade(58.5);

        }

        public static void printGrade(double score) {
            if ( score >= 90.0) {
                System.out.println("A");
            }
            else if ( score >= 80.0) {
                System.out.println("B");
            }
                else if ( score >= 770.0) {
                System.out.println("C");
            }
                    else if ( score >= 60.0){
                        System.out.println("D");
             }
             else{
                            System.out.println("f");}
                    }
            }


            class urur{
                public static int sum(int i1, int i2) {
                    int total = 0;

                    for (int i = i1; i <= i2; i ++){
                        total = total + i;

                    }
                    return  total;

                }

                public static void main(String[] args) {
                    System.out.println(sum(1, 10));
                }
            }


            class nd{
                public static int displayPattern(int n){

                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++)
                            System.out.print("*");
                        System.out.println();
                    }

                    return displayPattern(n);

                }

                public static void main(String[] args) {
                    System.out.println(displayPattern(10 ));
                }
            }








package Practise;

import java.util.Scanner;

public class ChineseZodaicSign {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("enter year");
        year = input.nextInt();

        while ( year != 0) {

            switch (year % 12) {
                case 0:
                    System.out.println("Monkey");
                    break;
                case 1:
                    System.out.println("rat");
                    break;
                case 2:
                    System.out.println("snake");
                    break;
                case 3:
                    System.out.println("Mice");
                    break;
                case 4:
                    System.out.println("baboon");
                    break;
                case 5:
                    System.out.println("goat");
                    break;
                case 6:
                    System.out.println("cow");
                    break;
                case 7:
                    System.out.println("elephant");
                    break;
                case 8:
                    System.out.println("squirrel");
                    break;
                case 9:
                    System.out.println("dog");
                case 10:
                    System.out.println("dragon");
                case 11:
                    System.out.println("dinosaur");

            }
            System.out.println("enter year");
            year = input.nextInt();


        }

        }

 }

 class ejj {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("enter a character");
         String s = input.nextLine();

         char ch = s.charAt(0);
         System.out.println(s);
     }
 }

 class heh{
     public static void main(String[] args) {

         int [] array = new int[10];

         for (int count = 0; count < array.length; count++){
          //   array[count] =  Math.random() * 100;
             System.out.printf("%s%8s%n" ,array[count], count);
         }
     }
 }

 class gyeye{
     public static void main(String[] args) {
         String [][] array = { {"x 0 X"}, {"O X O"}, {"X O X"}};


         for ( int count = 0 ; count < array.length; count++){
             for (int column = 0; column < array[count].length; column++)
             System.out.println(array[count][column]);
         }

         System.out.println();
     }
 }
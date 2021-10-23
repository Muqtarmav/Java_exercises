package Jexercises;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
    int num1 = (int) (Math.random() * 100);


    Scanner input = new Scanner(System.in);
        System.out.println("enter a two digit number");
        int guess = input.nextInt();

        int lottery1 = num1 / 10;
        int lottery2 = num1 % 10;

        int guess1 = guess / 10;
        int guess2 = guess % 10;

        System.out.println("this is the lottery number " + num1);

        if ( guess == num1){
            System.out.println("you just won $10000");
        }
        else if (guess2 == lottery1 && guess1 == lottery2) {
            System.out.println("you just won $3000");
        }
        else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2){
            System.out.println("you just won $1000");
        }
        else{
            System.out.println("no correct matches");
        }

    }
    }

    class Constant {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            final double PI = 3.147;

            System.out.println("Enter radius");
            int radius = input.nextInt();

            double result = (double) radius * PI;

            System.out.println(result);

        }
    }

        class ye{
            public static void main(String[] args) {
                double [] myList = new double[10];

                Scanner input = new Scanner(System.in);
                for(int count = 0; count < myList.length; count++){
                   //System.out.println("enter " + myList.length + "values");
                   myList[count] = Math.random() * 100;
                    //myList[count] = input.nextInt();

                }
            }
        }

        class yyr{
            public static void main(String[] args) {
                int total = 0;
                Scanner input = new Scanner(System.in);
                System.out.println("enter number of items");
                int n = input.nextInt();

                int [] b = new int[n];


                System.out.println("enter numbers");
                for ( int count = 0; count < n; count ++){
                    b[count] = input.nextInt();

                    total = total + b[count];

                }


                int average = total / 10;

                System.out.println(average);

                System.out.println(total);



            }
        }




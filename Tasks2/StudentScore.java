package Tasks2;

import java.util.Scanner;

public class StudentScore {

    public static void main(String[] args) {

        int total = 0;
        int average;

        Scanner input = new Scanner(System.in);
        for ( int count = 1; count <= 10; count++) {

            System.out.println("enter scores " +count);
            int score = input.nextInt();

            total = total + score;

        }
           double averages =  (double) total / 10;


            System.out.println(total);
            System.out.println(averages);
        }

    }

    class sentinel {
        public static void main(String[] args) {
            int gradeCounter = 0;
            int total = 0;
            Scanner input = new Scanner(System.in);

            System.out.println("enter score or -1 to quit");
            int scores = input.nextInt();

            while (scores != -1) {
                gradeCounter++;
                total = total + scores;

                System.out.println("enter grades or -1 to quit");
                scores = input.nextInt();

            }

            System.out.println(total);

        }
    }
        class Analysis{
            public static void main(String[] args) {

                int passes = 0;
                int failure = 0;
                int scores = 0;

                Scanner input = new Scanner(System.in);
                while ( scores <= 10){
                    scores++;

                    System.out.println("enter result, 1 = passes, 0 = failure");
                    int result = input.nextInt();

                    if ( result == 1){
                        passes = passes + 1;
                    }
                    else  {
                        failure = failure + 1;
                    }
                }

                System.out.println("number of passes" + passes);
                System.out.println("number of failures" + failure);
            }
        }

        class Largest {
            public static void main(String[] args) {

                int number;
                int largest = 0;
                Scanner input = new Scanner(System.in);

                for (int count = 0; count < 10; count++) {

                    System.out.println("enter numbers");
                    number = input.nextInt();

                    //System.out.println(number);


                    if (number > largest) {
                        largest = number;

                    }

                    System.out.println(largest);

                }
            }
        }



        class Validation{
            public static void main(String[] args) {

                int total = 0;
                int counter = 0;
                Scanner input = new Scanner(System.in);

                System.out.println("enter number or number 1 0r 2 to quit");
                int number = input.nextInt();



                while ( number != 2 ) {
                    counter++;
                    total = total + number;

                    System.out.println("enter 1 0r 2 to quit");
                     number = input.nextInt();

                }
                    System.out.println(total);
                }
            }


            class Asterisks{
                public static void main(String[] args) {


                    for ( int count = 0; count <= 5; count++){
                        for ( int row = 0 ; row <= count + 1; row++)
                        System.out.print("*");

                        System.out.println();
                    }
                }
            }


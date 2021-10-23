package Jexercises;

import java.util.Scanner;

public class Loopers {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.println("what is the answer" + num1 + "+" + num2);
        int answer = num1 + num2;

        answer = input.nextInt();

    if ( num1 + num2 == answer) {
        System.out.println("you are correct");
    }

        while(answer != num1 + num2){
            System.out.println("not correct, what is the answer" + num1 + "+" + num2);
            answer = input.nextInt();
        }
        }
    }


    class Guessing{
        public static void main(String[] args) {
            int number = (int) (Math.random() * 101);

            Scanner input = new Scanner(System.in);

            System.out.println("guess a number");
            int guess  = input.nextInt();

            if (guess == number){
                System.out.println("yes you are correct");
            }
            else if (guess > number){
                System.out.println("Number is too high");

            }
            else {
                System.out.println("number is too low");
            }

            while (guess != number){
                System.out.println("guess another number");

                guess = input.nextInt();
                if (guess == number){
                    System.out.println("yes you are correct");
                }
                else if (guess > number){
                    System.out.println("Number is too high");

                }
                else {
                    System.out.println("number is too low");
                }


            }

        }
    }

    class SubstarctionQuiz{
        public static void main(String[] args) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            Scanner input = new Scanner(System.in);
            System.out.println("enter the correct answer");
            System.out.println("what is " + num1 + "-" + num2);
            int answer = num1 - num2;
            answer = input.nextInt();

            if ( num1 - num2 == answer){
                System.out.println("answer is correct");
            }

            while( num1 - num2 != answer){
                System.out.println( "not correct what is " + num1 + "-" + num2);
                answer = input.nextInt();
            }

        }
    }

    class Sentinel{
        public static void main(String[] args) {
            int count = 0;
            int correctCount = 0;
            final int Number_OF_QUESTION = 5;
           // int number = 10;
            long startTime =System.currentTimeMillis();
            String output = " ";
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number");

            while ( count < Number_OF_QUESTION){
                int num1 = (int) (Math.random() * 10);
                int num2 = (int) (Math.random() * 10);

                if (num1 < num2){
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }

                System.out.println("what is" + num1 + "-" + num2);
                int answer = input.nextInt();

                if (num1 - num2 == answer){
                    System.out.println("you are correct");
                    correctCount++;

                }
                else{
                    System.out.println("wrong what is " + num1 + "-" + num2 );
                    count++;
                }
                output += "\n" + num1 + "-" + num2 + "=" + answer +
                        ((num1 - num2 == answer) ? " correct" : " wrong");
            }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("Correct count is " + correctCount +
                    "\nTest time is " + testTime / 1000 + " seconds\n" + output);
            }

        }


package Tasks2;

import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {

        for (int count = 1; count <= 100; count++) {

            System.out.println("welcome to java");
        }


    }

}


    class summ{
        public static void main(String[] args) {

            int sum = 0;

            for ( int count = 0; count <= 10; count++){

                sum = sum + count;

                System.out.println(sum);
            }


        }
    }

    class addition{
        public static void main(String[] args) {

            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            Scanner input = new Scanner(System.in);

            System.out.println("what is " +  number1 + "+" +   number2 );
            int answer = input.nextInt();

//            if ( number1 + number2 == answer) {
//                System.out.println("correct");
//            }
//
//            else {
//                System.out.println("false");
//            }
//
            while (number1 + number2 != answer) {
                System.out.println("what is" + number1 + "+" + number2);
                answer = input.nextInt();
            }
                System.out.println("correct");


        }

            }

class guessing{
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int guessNo = -1;

        while (guessNo != number) {

            System.out.println("guess a number");
            guessNo = input.nextInt();


            if (guessNo == number) {
                System.out.println("you are correct! genius");
            } else if (guessNo > number) {
                System.out.println("number is too high");
            } else {
                System.out.println("number is too low");
            }
        }
    }
}

    class tryAgain{
        public static void main(String[] args) {

            int number = (int) (Math.random() * 100);


            Scanner input = new Scanner(System.in);

           // System.out.println("enter a number");
            //int guessNo = input.nextInt();


               int guessNo = -1;
            while (guessNo != number) {

                System.out.println("enter a number");
                guessNo = input.nextInt();

                if (guessNo == number) {
                    System.out.println("you are correct");
                } else if (guessNo < number) {
                    System.out.println("number is too low");
                } else {
                    System.out.println("number is too high");
                }
            }

        }
}

class sumTest{
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);


        Scanner input = new Scanner(System.in);

        System.out.println("what is" + number1 + "+" + number2);
        int answer = input.nextInt();


        while (number1 + number2 != answer) {
            System.out.println("wrong, try again! what is " + number1 + "+" + number2);
            answer = input.nextInt();
        }
            System.out.println("you are correct");

    }
}

    class sentinelValue{
        public static void main(String[] args) {

            int sum = 0;
            int count = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("enter a number");
            int number = input.nextInt();

            while (number != 0){
                sum = sum + number;
                count++;


                System.out.println("enter a number");
                number = input.nextInt();

            }


            System.out.println(sum);

        }
    }

    class yryu {
        public static void main(String[] args) {
            int total = 0;

            for (int count = 0; count < 10; count++) {
                total = total + count;
            }
            System.out.println(total);
        }
    }



    class peie{
    public static void main(String[]args){

        //int sum = 0;

        for ( int count = 10; count > 1; count--){

            System.out.println(count);
        }
        }
        }

        class kdk{
            public static void main(String[] args) {

                int sum = 0;

                for (float i = 0.01f; i < 10.0f; i++) {
                  float sums = (float) sum + i;

                    System.out.println(sums);
                }
            }
}

    class TestBreak{
        public static void main(String[] args) {

            int sum = 0;

            for ( int count =  0; count < 20; count++) {
                sum = sum + count;

                if (sum > 120) {
                    break;
                }

            }

            System.out.println(sum);

            }
        }

        class TestContinue{
            public static void main(String[] args) {

                int sum = 0;

                for (int count = 0; count < 20; count++) {
                    sum = sum + count;

                    if (count == 10) {
                        continue;
                    }
                }

                    System.out.println(sum);


            }
        }

        class star1{
            public static void main(String[] args) {

                for (int count = 0; count < 10; count++){

                    for ( int row = 0; row < count + 1; row++)
                    System.out.print("*");

                    System.out.println();
               }
            }
        }

        class star2{
            public static void main(String[] args) {

                for ( int count = 0; count < 10; count++){

                    for (int row = 10; row > count; row--)
                    System.out.print("*");

                    System.out.println();
                }
            }
        }

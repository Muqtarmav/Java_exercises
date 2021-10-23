package Jexercises;
import java.util.Scanner;
public class $_test1 {
    public static void main(String [] args){
        int num1;
        int num2;
        int total;

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = input.nextInt();

        System.out.println("enter second number");
        num2 = input.nextInt();

        total = num1 + num2;

        System.out.println(total);

    }
}

class Multiply_float{
    public static void main(String[] args) {
        float num1 = 33.9f;
        float num2 = 44.5f;
       // float total;

        Scanner input = new Scanner(System.in);
        //System.out.println("enter number with decimal");
        //num1 = input.nextFloat();
        //System.out.println("enter second number");
        //num2 = input.nextFloat();

       float total = num1 * num2;
        System.out.println(total);
    }

}

class Ascii_value{
    public static void main(String [] args ) {
        char ch = 'r';
        int Ascii = ch;

         Ascii = (int) ch;

         System.out.println("the value of " + ch + Ascii);
    }
}

class EvenOrOdd{
    public static void main (String [] args){
        int num1;

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = input.nextInt();


        if ( num1 % 2 == 0){
            System.out.println("its even");
        }
        else
        {
            System.out.println("its odd");
        }
    }
}

class EvenOdd{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
       int  num1 = input.nextInt();

       String EvenOdd = (num1 % 2 == 0) ? "even" : "odd";

        System.out.println(EvenOdd);

    }
}

class LargestAmongThreeNumbers{
    public static void main(String [] args ){
        int num1;
        int num2;
        int num3;
        int maximum;

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
         num1 = input.nextInt();
        System.out.println("enter second number");
        num2 = input.nextInt();
        System.out.println("enter third number");
        num3 = input.nextInt();

        maximum = num1;
        if ( num2 > maximum) {
            maximum = num2;
        }
         if (num3 > maximum){
             maximum = num3;
         }

        System.out.println(maximum);

    }
}

class SwapNumber{
    public static void main(String [] args){
     float num1 = 4.5f;
     float num2 = 55.4f;

     float temporary = num1;
     num1 = num2;
     num2 = temporary;

     System.out.println(num1);
     System.out.println(num2);
    }
}

class VowelConsonant{
    public static void main(String [] args){
         //char ch;

         Scanner input = new Scanner(System.in);
         System.out.println("enter alphabet");
        char ch = input.findInLine(".").charAt(0);

         if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
             System.out.println("its a vowel");
         }
         else{
             System.out.println("its a consonant");
         }
    }
}

class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;

        System.out.println("enter first number");
        num1 = input.nextInt();

        if (num1 > 0) {
            System.out.println("its a psotive number");
        } else if (num1 < 0) {
            System.out.println("its a negative number");
        } else {
            System.out.println("its equal to zero");
        }

    }
}

    class Alphabet{
        public static void main(String [] args){
            char ch;

            Scanner input = new Scanner(System.in);
            System.out.println("enter char value");
            ch = input.findInLine(".").charAt(0);

//            if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e'){
            if (ch >= 'a' && ch <= 'z'){
               System.out.println("its an alphabet");
            }
            else {
                System.out.println("its not AN ALPHABET");
            }
        }
    }


    class NaturalNumber{
    public static void main(String [] args){

        int sum =  0;

        for ( int count = 0; count <= 100; count ++){
            sum = sum + count;

        }
        System.out.println(sum);


    }
    }

    class Multiplication{
    public static void main(String [] args) {
    int num = 7;

    for (int count = 0; count <= 10; count++){

            System.out.printf("%d * %d = %d \n", num, count, num * count);
        }
        }
    }


    class Factorial{
    public static void main(String [] args) {

        int factorial = 1;
        int num = 6;

        for ( int count = 1; count <= num; count ++){
            factorial = factorial * count;

            System.out.println(factorial);
        }
    }

    }

    class Fibonacci {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int nextTerm = 0;
            int firstTerm = 1;
            int num;

            System.out.println("enter number");
            num = input.nextInt();

            for (int count = 0; count < num; count++) {
                nextTerm = num + firstTerm;

                System.out.println(nextTerm);
            }
        }
    }

        class Reversed{
            public static void main (String [] args){
//
                Scanner input = new Scanner(System.in);

                int num;

                System.out.println("enter 4 numbers");
                num = input.nextInt();

                int reversed = 0;

                while (num != 0){

                    int digit = num % 10;
                    reversed = reversed * 10 + digit;

                    num = num / 10;
                }
                System.out.println(reversed);


            }
}

class Palindrome{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int num = 4554;
        int reversed = 0;
        int oriNum = 0;

        oriNum = num;
          while ( num != 0){
              int digit = num % 10;
              reversed = reversed * 10 + digit;

              num = num / 10;

              if ( oriNum == reversed) {
                  System.out.println("its a palindrome" + reversed);
              }
                  else
                  {
                      System.out.println("not a palindrome");
                  }
              }

        }

    }

    class Prime{
    public static void main(String [] arg){
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("enter num");
        num = input.nextInt();

        if ( num / 2 == 0 ){
            System.out.println("its a prime number");
        }
        else
            System.out.println("not a prime");

    }

    }

    class Pali{
    public static void main (String [] args ){
        int num = 4443;
        int reverse = 0;

        while ( num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;

            num = num / 10;

            System.out.println(reverse);
        }
        }
    }

    class Average {
    public static void main (String [] args){
        int [] array = {12, 13, 14, 55, 66, 77};
        int total = 0;

        for ( int count = 0; count < array.length; count++){
            total = total + array[count];



        }
        System.out.println(total);

        double average =  (double) total / 6;
        System.out.println("this is the" + average);

    }
    }


 class Factor{
    public static void main(String [] args) {
        int num = 60;

        for (int count = 1; count <= num; count++) {

          //  System.out.println(count);


            if (num % count == 0) {
                System.out.println(count);
            }

        }
    }
}

class NegativeFactors {
    public static void main(String[] args) {
        int num = -60;

        for (int count = 1; count <= Math.abs(num); ++count) {

            if (count == 0) {
                continue;
            } else {
                if (num % count == 0) {
                    System.out.println(count);
                }
            }
        }
    }
}

class HalfPyramid{
    public static void main(String [] args){
        int row = 5;
        for (int count = 0; count <= row; count++){
            for ( int column = 0; column <= count; column++){
            System.out.print("*");

        }

        System.out.println();
    }
}
}

class NumPyramid{
    public static void main(String [] args){

        int num = 5;

        for ( int count = 1; count <= num; count ++) {
            for (int column = 1; column <= count; column++) {
                System.out.print(column);

            }


            System.out.println();
        }
    }
}

class Inverted{
    public static void main (String [] args ){
        int num = 5;

        for (int count = num; count >= 1; count--){
            for(int column = 0; column <=  count; column++){
                System.out.print("*");

            }
                System.out.println();
        }

    }
}







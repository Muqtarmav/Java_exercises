package Tasks2;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter purchase amount");
        double purchase = input.nextDouble();

        double tax = purchase * 0.06;

        System.out.println("this is the tax $" + tax);
    }
}

class Arithmetic{
    public static void main(String[] args) {

        int largest;
        int smallest;

        int number1;
        int number2;
        int number3;

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        number1 = input.nextInt();
        System.out.println("enter second number");
        number2 = input.nextInt();
        System.out.println("enter third number");
        number3 = input.nextInt();


        int sum = number1 + number2 + number3;
        System.out.println(sum);

        int product = number1 * number2 * number3;
        System.out.println(product);

        int division = (sum) / 3;
        System.out.println(division);


          largest = number1;

        if ( number2 > largest){
             largest = number2;
        }
        if (number3 > largest){
             largest = number3;
        }

        System.out.println(largest);


        smallest = number1;

        if ( number2 < smallest){
            smallest = number2;
        }
        else{
            smallest = number3;
        }

        System.out.println(smallest);

    }
}

class BMI{
    public static void main(String[] args) {

        double pounds;
        double height;


        Scanner input = new Scanner(System.in);

        System.out.println("enter pounds");
        pounds = input.nextDouble();

        System.out.println("enter height");
        height = input.nextDouble();


        double BMIS = (pounds * 703)  / (height * height);
        System.out.println(BMIS);

        if (BMIS < 18.5){
            System.out.println("underweight");
        }

        else if  (BMIS >= 18.5 && BMIS < 24.5 ) {
            System.out.println("normal");
        }
         else if (BMIS >= 25 && BMIS <= 29.9){
            System.out.println("overweight");
        }
        else if( BMIS > 30) {
            System.out.println("OBESE");

        }


        //System.out.println(BMIS);


    }
}
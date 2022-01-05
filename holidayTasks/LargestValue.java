package holidayTasks;

import java.util.Scanner;

public class LargestValue {

    public static void main(String[] args) {

        int sum = 0;
       int number;
        int largest = 0;

        Scanner input = new Scanner(System.in);

     // System.out.println("enter a number");
       // int number = input.nextInt();

        for ( int count = 0; count < 10; count++) {
            System.out.println("enter a number");
            number = input.nextInt();

            sum = sum + number;

            if ( number > largest){
                largest = number;
            }
        }


        System.out.println("this is the largest" + largest);
        System.out.println(sum);



      //  System.out.println(largest);

    }
}

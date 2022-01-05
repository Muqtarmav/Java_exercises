package holidayTasks;

import java.util.Scanner;

public class TwoLargestNumber {

    public static void main(String[] args) {

        int largest1 = 0;
       int largest2 = largest1;


        Scanner input = new Scanner(System.in);


        for ( int count = 0; count < 10; count ++) {

            System.out.println("enter number");
            int number = input.nextInt();

            if (number > largest1) {
                largest1 = number;
            }
            else if  ( number <  largest2){
                largest2 = number;

            }


        }
            System.out.println(largest1);

        System.out.println(largest2);
    }

    // Inconclusive
}

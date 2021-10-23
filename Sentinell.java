package Practise;

import java.util.Scanner;

public class Sentinell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int total = 0;
        int average;

        System.out.println("enter a number");
        num = input.nextInt();


        while(num != 0) {

            total = total + num;

            System.out.println("enter a number");
            num = input.nextInt();

        }
        System.out.println(total);




//        average = total / num;
//
//        System.out.println(average);



    }
}

package Tasks2;

import java.util.Scanner;

public class Maximum {

    public static int max(int a, int b) {

        if (  a > b){
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter for a value");

        int a =input.nextInt();

        System.out.println("enter for b value");

        int b = input.nextInt();

        System.out.println(max( a,  b));
    }
}

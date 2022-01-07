package Practise.Task;

import java.util.Locale;
import java.util.Scanner;

public class StringPlay {
    public static void main(String[] args) {

        String s1 =  "hello";
        String s2 = "welcome here";
        String s3 = "you are back";
        String s4 = "HELLO";


        if ( s1.equals(s4)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        if (s1 == s4){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        if (s1.equalsIgnoreCase(s4)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


        System.out.println(s1.compareTo(s4));

      //  System.out.println(s1.equals(s4));

    }
}



class pdp{
    public static void main(String[] args) {

        String s = "happy ";
        String s1 = "new year";

        System.out.println(s.concat(s1));

        System.out.println(s.toUpperCase(Locale.ROOT));
    }
}

class Builder{
    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");


        System.out.println(buffer);
        System.out.println(buffer2);
        System.out.println(buffer3);
    }

}

class kkd{
    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("hello how are you");

        System.out.println(buffer.toString());
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());

        buffer.ensureCapacity(75);

        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        System.out.println(buffer.capacity());
    }
}

class StaticCharMethods{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter new character or string");

        String word = input.next();
       // char c = input.charAt(0);

      //  System.out.println(Character.isLetter(c));


    }
}
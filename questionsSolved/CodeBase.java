package Practise.questionsSolved;

import java.util.Scanner;

public class CodeBase {

    public static boolean containDigit(String word) {

        for (int count = 0; count < word.length(); count++) {
            if (!Character.isDigit(word.charAt(count))) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter word");
        String word = input.nextLine();

        System.out.println(containDigit(word));
    }

}

class countVowels{
    public static void main(String[] args) {

        String word = "This is an amazing project";

        int vowels = 0;
        int consonant = 0;
        int digits = 0;
        int spaces = 0;

        for ( int count = 0; count < word.length(); count++){
            char ch = word.charAt(count);

             if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }

            else if (ch >= 'a' && ch <= 'z'){
                consonant++;
            }

            else if(ch >= '0'  && ch <= '9'){
                digits++;
            }

            else if (ch == ' '){
                spaces++;
            }
        }


        System.out.println("the  number of vowels " + vowels);
        System.out.println("the  number of consonant " + consonant);
        System.out.println("the  number of digits " + digits);
        System.out.println("the  number of spaces  " + spaces);

        }

    }


    class countAlphabets{
        public static void main(String[] args) {

            int vowels = 0;
            int consonant = 0;
            int digits = 0;
            int spaces = 0;

            String word = "Always live everyday like its your last day 33";

        for (int count = 0; count < word.length(); count ++) {
            char ch = word.charAt(count);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }




            System.out.println("this is the number of vowels " + vowels);
            System.out.println("this is the number of consonants " + consonant);
            System.out.println("this is the number of digits " + digits);
            System.out.println("this is the number of spaces " + spaces );


        }

    }

    //counting the occurrence of characters
    class CharacterCount{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter words");
            String word = input.nextLine();
            int count = word.length();
            int countWithoutA = word.replace("a", "").length();

            int total = count - countWithoutA;

            System.out.println("this is the number of a " + total);


        }
    }

    class countWords{


        public static int countEWords(String words) {
            int count = 0;

            if (!(words == null || words.isEmpty())) {

                String[] w = words.split("\\s+");

                count = w.length;
            }

            return count;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter words");

            String s = input.nextLine();

            System.out.println(countEWords(s));

        }
    }


    class countW{
        public static int countWw(String str) {
            int count = 0;

            if ( !(str == null || str.isEmpty())){

                String [] w = str.split("\\s++");

                count = w.length;
            }

            return count;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter words");

            String str = input.nextLine();

            System.out.println(countWw(str));
        }
    }



class Convert{

    public static void main(String[] args) {

        String str = "4567522223";

        Long change = Long.parseLong(str);
        System.out.println(change);

    }
}

class RemoveSpace{
    public static void main(String[] args) {

        String [] array = {"hello there "  , "hi world"   };

        for ( String y : array){
            System.out.println( y.replaceAll("\\+", ""));
        }
    }
}

class eke {
    public static boolean checkWords(String name ) {

        for ( int count = 0; count < name.length(); count++) {
            if (!Character.isDigit(name.charAt(count))) {
                return false;
            }
        }
            return true;
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter name");

        String name = input.next();

        System.out.println(checkWords(name));
    }
}
        //        int vowels = 0;
//        int consonant = 0;
//        int digit = 0;
//        int spaces = 0;
//
//
//        String word = "you guys are so amazing bless up with the job";
//
//        for ( int count = 0 ; count < word.length(); count++){
//          char ch =  word.charAt(count);
//
//
//        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
//        vowels++;
//        }
//
//        else if ( ch >= 'a' && ch <= 'z'){
//            consonant++;
//        }
//
//        else if ( ch >= '0' && ch <= '9'){
//            digit++;
//        }
//
//        else if(ch == ' '){
//            spaces++;
//        }
//        }
//
//        System.out.println("this is the total number of vowels " + vowels);
//        System.out.println("this is the total number of consonant " + consonant);
//        System.out.println("this is the total number of digit " + digit);
//        System.out.println("this is the total number of spaces " + spaces);

            // String name = "amazing";
//
//        int total = name.length();
//
//        int newTotal = name.replace("a", "").length();
//
//        int result = total - newTotal;
//
//        System.out.println(result);

//        int number = 9839234;
//        int count = 0;
//
//        while (number != 0){
//            number = number / 10;
//            count++;
//        }
//
//        System.out.println(count);





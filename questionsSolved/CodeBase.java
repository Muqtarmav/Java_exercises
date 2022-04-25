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

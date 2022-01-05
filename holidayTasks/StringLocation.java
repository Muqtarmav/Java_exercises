package holidayTasks;

public class StringLocation {

    public static void main(String[] args) {

        String letters = "abcdefghijklmnopqrstuv";

        System.out.println(letters.length());

        System.out.println(letters.indexOf("p"));

        System.out.println(letters.indexOf("u"));
        System.out.println(letters.lastIndexOf("u"));

        System.out.println(letters.substring(15));
        System.out.println(letters.substring(7, 11));

        for ( int count = letters.length() - 1; count >= 0; count--){
            System.out.print(letters.charAt(count));
        }
    }
}

class StringBuilders{
    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder();
        StringBuilder buffer1 = new StringBuilder(10);
        StringBuilder buffer2 = new StringBuilder("hello");


        System.out.println(buffer);
        System.out.println(buffer1);
        System.out.println(buffer2);
    }
}


class StringBuffers {

    public static void main(String[] args) {

            StringBuilder buffer = new StringBuilder("hey, hello how are you");

        System.out.println(buffer.length());
        System.out.println(buffer.capacity());

        buffer.ensureCapacity(75);
       // System.out.printf("New capacity = %d%n%n", buffer.ensureCapacity(75));
        //System.out.println(buffer.ensureCapacity());

        buffer.setLength(10);
    }
}


class YUE{
    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("hello there");

        System.out.println(buffer.toString());
        System.out.println(buffer.charAt(0));
        System.out.println(buffer.charAt(4));

        char [] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("the characters are");


        for ( char character : charArray){
            System.out.println(character);
        }

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.println(buffer.toString());

        buffer.reverse();
        System.out.println(buffer.toString());
    }
}
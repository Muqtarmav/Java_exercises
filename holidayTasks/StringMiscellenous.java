package holidayTasks;

public class StringMiscellenous {
    public static void main(String[] args) {

        String s = new String("hello there");

        char [] charArray = new char[5];

        System.out.println(s);
        System.out.println(s.length());

      for ( int count = s.length() - 1 ; count >= 0; count--){
          System.out.print(s.charAt(count));

      }    }
}

class Trial{
    public static void main(String[] args) {

        String name = "Adetunji";

        System.out.println(name);
        System.out.println(name.length());

        for ( int count = name.length() -1 ; count >= 0; count--){
            System.out.print(name.charAt(count));
        }
    }
}


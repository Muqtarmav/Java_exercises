package holidayTasks;

public class StringCompares {
    public static void main(String[] args) {

        String s1 =  "hello";
        String s2 = "goodbye";
        String s3 = "happy birthday";
        String s4 = "HAPPY BIRTHDAY";

        System.out.printf("%s%n%s%n%s%n%s%n", s1, s2, s3, s4);

        //testing for equality

        if ( s1.equals("hello")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if ( s1 == "hello"){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        if ( s3.equalsIgnoreCase(s4)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1));
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.compareTo(s4));
    }
}

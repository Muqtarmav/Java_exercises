package holidayTasks;

public class StringStartEnd {

    public static void main(String[] args) {

        String [] strings = {"started", "starting", "ended", "ending"};


        for ( String string : strings){
            if (string.startsWith("st")){
                System.out.println(string);
            }
        }


        for ( String string : strings){
            if (string.startsWith("end")){
                System.out.println(string);
            }
        }


        for ( String string : strings){
            if ( string.endsWith("ng")){
                System.out.println(string);
            }
        }


        for ( String string : strings){
            if ( string.startsWith("art", 2)){
                System.out.println(string);
            }
        }


    }
}

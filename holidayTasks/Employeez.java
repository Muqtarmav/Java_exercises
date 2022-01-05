package holidayTasks;

public class Employeez {


    private final String  firstName;
    private final String lastName;
    private static int count = 0;

    public Employeez(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }


    public static int getCount(){
        return count;
    }
}

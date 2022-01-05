package holidayTasks;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hiredDate;


    public Employee(String firstName, String lastName, Date birthDate, Date hiredDate){
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiredDate = hiredDate;
    }


    public String toString(){
        return String.format("%s, %s hired: %s Birthday : %s", firstName, lastName, hiredDate, birthDate);
    }
    }

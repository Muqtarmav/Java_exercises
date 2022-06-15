package Practise.oop;

import chap15.Date;

public class Employee {

    private static int count = 0;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Date hireday;


    public Employee(String firstName, String lastName, Date birthday, Date hireday){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.hireday = hireday;

        count++;

    }

    public int getCount() {
        return count;
    }


    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireday, birthday);

          }
}

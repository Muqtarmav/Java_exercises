package holidayTasks;

public class ValidateInput {

    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
        public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }




}

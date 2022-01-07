package holidayTasks;

public class ValidateInput {

    public static boolean validateFirstName(String firstName) {

        return firstName.matches("[A-Z][a-zA-Z]*");
    }
        public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }

    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}]");




}

package holidayTasks;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a sentence");

       String words = input.nextLine();

        String [] token = words.split("");
        System.out.println(token.length);

        for (String tokens : token){
            System.out.print(tokens);
        }
    }
}

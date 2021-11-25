package chap17;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomInteger {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        System.out.println("random number on separate lines");
        randomNumber.ints(10, 1, 7).forEach(System.out::println);



            String numbers = randomNumber.ints(10, 1, 7).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.printf("%n random numbers on one line : %s%n", numbers);
    }
}

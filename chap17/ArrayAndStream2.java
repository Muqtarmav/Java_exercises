package chap17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAndStream2 {
    public static void main(String[] args) {

        String [] strings = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};

        System.out.printf("original strings : %s%n", Arrays.asList(strings));

        System.out.printf("String in uppercase : %s%n", Arrays.stream(strings).map(String :: toUpperCase).collect(Collectors.toList()));

        System.out.printf("strings less than n sorted ascending %s%n", Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));

        System.out.printf("strings less than n sorted ascending %s%n", Arrays.stream(strings).
                filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));

    }
}

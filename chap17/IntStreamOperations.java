package chap17;

import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {

        int [] values = {3, 10, 6, 1, 4, 8,2,5,9,7};

        System.out.println("Original values : ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d", value));
        System.out.println();

        System.out.printf("%nCount : %d%n", IntStream.of(values).count());
        System.out.printf("Min : %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("max : %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum : %d%n", IntStream.of(values).sum());
        System.out.printf("average : %.2f%n", IntStream.of(values).average().getAsDouble());

        System.out.printf("%nSum via reduce method : %d%n",

            IntStream.of(values)
                    .reduce(0, (x, y) -> x + y));

        System.out.printf("sum of squares via reduce method ; %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y * y));


        System.out.printf("Product via reduce method: %d%n", IntStream.of(values)
                .reduce(1, (x, y) -> x * y));


        System.out.printf("values displayed in sorted order : %s%n", IntStream.of(values).sorted().mapToObj(String::valueOf).collect(Collectors.joining("")));
//
//        IntStream.of(values)
//                .filter(value -> value % 2 == 0)
//                .sorted()
//                .forEach(value -> System.out.printf("%d ", value))

    }
}

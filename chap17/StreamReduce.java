package chap17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {

        System.out.printf("finding the sum of 1 to 10 IS %d%n", IntStream.rangeClosed(1, 10).sum());
    }
}


class StreamEvenNumber{
    public static void main(String[] args) {

        System.out.printf("sum of even number from 2 to 20 is %d%n", IntStream.rangeClosed(1, 10).map((int x) ->{return x * 2;}).sum());
    }
}

class StreamFilter{
    public static void main(String[] args) {
        System.out.printf("sum of integer of the even number 2 through 10 is  %d%n", IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0).map(x -> x * 3).sum());
    }
}
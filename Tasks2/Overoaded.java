package Tasks2;

public class Overoaded {

    public static int square(int intValue) {

        return intValue * intValue;

    }

    public static double square(double doubleValue) {

        return doubleValue * doubleValue;

    }


    public static void main(String[] args) {

        System.out.println(square(7));
        System.out.println(square(7.5));
    }
}

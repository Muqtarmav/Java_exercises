package Tasks2;

import java.security.SecureRandom;

public class Dieroll {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        for ( int count = 1; count <= 20; count ++) {

            int dice = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d" , dice);

            if (count % 5 == 0)
                System.out.println();

        }
    }
}


    class RollDie{

        public static void main(String[] args) {

            SecureRandom randomNumbers = new SecureRandom();

            int frequency1 = 0;
            int frequency2 = 0;
            int frequency3 = 0;
            int frequency4 = 0;
            int frequency5 = 0;
            int frequency6 = 0;

            for (int count = 1; count <= 6000000; count++) {

                int face = 1 + randomNumbers.nextInt(6);

                switch (face) {
                    case 1 -> ++frequency1;
                    case 2 -> ++frequency2;
                    case 3 -> ++frequency3;
                    case 4 -> ++frequency4;
                    case 5 -> ++frequency5;
                    case 6 -> ++frequency6;
                }
            }

            System.out.println("Face\tFrequency"); // output headers
            System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                     frequency1, frequency2, frequency3, frequency4,
                     frequency5, frequency6);
             }

}






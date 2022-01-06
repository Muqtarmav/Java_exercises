package Practise.Tasks2;

public class DimensionalArray {
    public static void main(String[] args) {

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("values in array1 by row are");
        outputArray(array1);

        System.out.println("values in array2 are");
        outputArray(array2);


    }

    public static void outputArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++)

                System.out.printf("%d ", array[row][column]);

            System.out.println();
            }

        }
    }

    class jfk{
        public static void main(String[] args) {

            String [][]  array = {{"X  0  X"}, {"O  X  O"}, {"X  O  X"}};

            for ( int row = 0; row < array.length; row ++){

                for (int column = 0; column < array[row].length; column++)
                    System.out.printf("%s ", array[row][column]);

                    System.out.println();
                }
            }
        }


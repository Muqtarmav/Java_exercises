package Practise;

import java.util.ArrayList;

public class ArrayListTrial {
    public static void main(String[] args) {

        ArrayList<String> object = new ArrayList<String>();

        object.add("car");
        object.add("broom");
        object.add("cat");
        object.add("boss");

        object.remove(0);
        for(int count = 0; count < object.size(); count++){

        }
        System.out.println(object);

        System.out.println("this is the size of an array" + object.size());
    }

}

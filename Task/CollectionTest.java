package holidayTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
public class CollectionTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        String[] colors = {"Maganata", "brown", "green", "blue"};

//        for ( String color : colors){
//            System.out.println(color);
//
//            list.add("black");
//          //  System.out.println(color);

        for ( String color : colors){
            list.add("red");
            System.out.println(color);
        }


        String[] removeColors = {"brown", "green"};

//        for ( String removeColor : removeColors){
//            removeColor.add
//        }
     }

    }


    class LinkedListE{
        public static void main(String[] args) {

            String [] color = {"black", "yellow", "green", "blue"};
            List<String> list1 = new java.util.LinkedList<>();

            for (String colors : color){
                list1.add(colors);
            }

            String [] color3 = {"gold", "white", "gray" };

            List<String> List2 = new java.util.LinkedList<>();

            for (String colors : color3){
                List2.add(colors);
            }

            list1.addAll(List2);

            System.out.println(List2);

        }
    }

    class UsingToArray{
        public static void main(String[] args) {

            String [] colors = {"black", "red", "cyan"};
            List<String> link = new LinkedList<>(Arrays.asList(colors));

            link.add("blue");
            link.add("greem");
            link.add("yellow");
            link.add("brown");

           colors = link.toArray(new String[link.size()]);

            System.out.println("colors");

           for (String color : colors)
               System.out.println(color);
        }
    }
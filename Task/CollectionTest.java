package holidayTasks;

import java.util.*;

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


    class TestCollections{
        public static void main(String[] args) {

            ArrayList<String> colors = new ArrayList<>();

            colors.add("green");
            colors.add("yellow");
            colors.add("blue");
            colors.add("red");

            System.out.println(colors);

            ArrayList<String>color = new ArrayList();

            color.add("purple");
            color.add("pink");


            System.out.println(color);

            ArrayList<String> c1 = (ArrayList<String>) (colors.clone());
            c1.addAll(color);

            System.out.println(c1);


            c1 =(ArrayList<String>) (colors.clone());
            c1.removeAll(color);

            System.out.println(c1);

        }

    }


    class LinkedListss{
        public static void main(String[] args) {


            String [] array = {"blue", "red"};

            LinkedList<String> cities = new LinkedList<>(Arrays.asList(array));

            cities.add("lagos");
            cities.addFirst("ibadan");
            cities.addLast("ilorin");
            cities.add("kano");

            System.out.println(cities);


            array = cities.toArray(new String[cities.size()]);

            System.out.println("array");

            for ( String name : array){
                System.out.println(name);
            }
        }
    }


    class Sort1{
        public static void main(String[] args) {

            String [] suits = {"hearts", "diamond", "clubs", "spades"};

            List<String> list = Arrays.asList(suits);

            System.out.println(list);

            Collections.sort(list);

            System.out.println(list);
        }
    }

    class SortDescending{
        public static void main(String[] args) {

            String [] suits = {"hearts", "diamond", "clubs", "spades"};

            List<String> list = Arrays.asList(suits);

            System.out.println(list);

            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
        }
    }
    class JFD{
        public static void main(String[] args) {

            String [] colors = {"blue", "red", "orange", "purple"};

            List<String> link = Arrays.asList(colors);

            System.out.println(link);

            Collections.sort(link);

            System.out.println(link);
        }
    }
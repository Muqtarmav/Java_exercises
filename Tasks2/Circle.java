package Practise.Tasks2;

public class Circle {

    private double radius;
    private static int numberOfObjects;


    public Circle(){

        radius = 1;
        numberOfObjects++;
    }


    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return  radius * radius * Math.PI;
    }
}

package Practise.oop;

public class Vehicle {

    private String name;
    private String color;
    private int doors;
    private int tyres;


    public Vehicle(String name, String color, int doors, int tyres){
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.tyres = tyres;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setDoors(int  doors){
    this.doors = doors;
    }

    public void setTyres(int tyres){
        this.tyres = tyres;
    }


    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int  getDoors(){
        return doors;
    }

    public int getTyres(){
        return tyres;
    }

    public String toString(){
        return String.format("%s%n, %s%n, %d%n, %d%n",  name, color, doors, tyres);

    }

}

package Practise.oop;

public class Car extends Vehicle {

    private String gamingConsole;

    public Car(String name, String color, int doors, int tyres, String gamingConsole) {
        super(name, color, doors, tyres);

        this.gamingConsole = gamingConsole;
    }



    public void setGamingConsole(String gamingConsole){
        this.gamingConsole = gamingConsole;
    }


    public String getGamingConsole(){
        return gamingConsole;
    }


}

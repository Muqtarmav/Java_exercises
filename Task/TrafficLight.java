package holidayTasks;

public enum TrafficLight {

    RED( 1),
    GREEN (3),
    YELLOW(2);


    private final int duration;

    TrafficLight(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return  duration;
    }
}

package Practise.oop;

public class Timing {

    private int hour;
    private int minute;
    private int seconds;
//
//
//    public Timing(int hour, int minute, int seconds){
//        if (hour <= 0 || hour > 24){
//            throw new IllegalArgumentException("hour is not valid");
//        }
//
//        if ( minute <= 0 || minute > 60){
//            throw new IllegalArgumentException("minute is not valid");
//        }
//
//        if (seconds <= 0 || seconds > 60){
//            throw new IllegalArgumentException("seconds is not valid");
//        }
//
//    this.hour = hour;
//    this.minute = minute;
//    this.seconds = seconds;
//    }
//

    public void setHour(int hour){
        if (hour <= 0 || hour > 24){
            throw new IllegalArgumentException("hour is not valid");
        }

        this.hour = hour;
    }


    public void setMinute(int minute){
        if ( minute <= 0 || minute > 60){
            throw new IllegalArgumentException("minute is not valid");
        }

        this.minute = minute;
    }

    public void setSeconds(int seconds){
        if ( seconds <= 0 || seconds > 60){
            throw new IllegalArgumentException("second not valid");
        }

        this.seconds = seconds;
    }


    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSeconds(){
        return seconds;
    }




    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }


    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, seconds, (hour < 12 ? "AM" : "PM"));
    }

}

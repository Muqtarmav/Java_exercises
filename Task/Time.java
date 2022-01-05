package holidayTasks;

public class Time {

    private int hour;
    private int minute;
    private int second;


    public void setTime(int hour, int minute, int second){

        if ( hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60) {

            throw new IllegalArgumentException("invalid hour or minutes");
        }

            this.hour = hour;
            this.second = second;
            this.minute = minute;
        }


        public String toString(){
        return String.format("%d:%02d:%02d %s", (( hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, ( hour < 12 ? "AM" : "PM"));
        }


        public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
        }

    }


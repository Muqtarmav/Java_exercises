package holidayTasks;

public class HistoryEvents {

    public final String day;
    public String [] events = new String[2];

    public HistoryEvents(String day){

        this.day = day;

    }

//    public void setEvents(String [] events){
//        this.events = events;
//    }
//
// public String [] getEvents(){
//
//       return events; }

    public String getDay(){
        return day;
    }
}

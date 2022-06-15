package Practise.oop;

import com.sun.jdi.event.StepEvent;

public enum Book {

    JAVA("proggramming language", 1999),
    PYTHON("act of program", 2008);


    private final String title;
    private final int year;


    Book(String title, int year){
        this.title = title;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }


}

package assignment3;
import java.util.*;
public class Watch2 {

    public boolean increment_sec(int seconds,int min,int hours,int day){
        if(seconds<=60) {
            seconds++;
            return true;
        }
        else{
            increment_min(min, hours, day);
            return false;
        }
    }
    public void increment_min(int min, int hour,int day) {
        if (min <= 60)
            min++;
        else
            increment_hours( hour,day );
    }
    public void increment_hours(int hour,int day) {
        if (hour <= 24)
            hour++;
        else
            increment_day(day);
    }
    public void increment_day(int day) {
        int month;
        if (day <= 30)
            day++;
        else {
            month = 1;
            day = 0;
        }
    }

}

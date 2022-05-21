package assignment3;
import java.util.*;

public class DigitalWatch extends Watch2{


    public int timer (int sec,int min,int hours,int day) {
        Boolean Timer = increment_sec(sec, min, hours, day);
        if (Timer == true) {
            System.out.println("Day  "+day+" of the month & "+" Time is "+hours + ":" + min + " : " + sec);
            return 1;
        } else {
            System.out.println("Time is invalid");
            return 0;
        }


    }


}

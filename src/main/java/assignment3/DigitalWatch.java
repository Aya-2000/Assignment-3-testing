package assignment3;
import java.util.*;

public class DigitalWatch extends Watch2{

    /*int sec=0;
    int min=0;
    int hours=0;
    int day =0;*/
    public int timer (int sec,int min,int hours,int day) {
        Boolean Timer = increment_sec(sec, min, hours, day);
        if (Timer == true) {
            System.out.println("Time " +day+" is "+hours + ":" + min + " : " + sec);
            return 1;
        } else {
            System.out.println("Time is invalid");
            return 0;
        }


    }


}

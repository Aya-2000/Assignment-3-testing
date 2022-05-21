package assignment2;
import java.util.*;
public class bngrb {
    public String getState(String x)
    {
        String state1="Normal"; //initial state
        String state2="Time";
        int hour =0;
        int minute=0;
        int day =1;
        int month=1;
        int year=2000;


        switch (state1){
            case "Normal":
                if(x=="c")
                {
                    state1="Update";
                    System.out.println("you are in update state");
                    if (x=="d")
                    {
                        state1="Normal";
                        System.out.println("you are in normal state");
                    }
                }
                if(x=="b") {
                    state1 = "Alarm";
                    System.out.println("you are in Alarm state");
                    if (x == "a") {
                        state1 = "Chime";
                        System.out.println("you are in Chime state");
                    }
                }
                if (x=="a") {
                    if (state2 == "Time") {
                        state2 = "Date";
                        System.out.println("you are in Date state");
                        if(state2=="Date")
                        {
                            if (x=="a")
                                System.out.println("you are in Time state");
                        }
                    } else {
                        state2 = "Time";
                        System.out.println("you are in Time state");
                    }
                }

            default:
                throw new IllegalStateException("Unexpected value: " + state1);
        }

    }

}

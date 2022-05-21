package assignment3;
import java.util.*;
public class ATM2 {
   public int balance=20000;
    public String check(int amount){
        if(balance>=amount)
        return "accept";
        else
            return "reject";
    }

}

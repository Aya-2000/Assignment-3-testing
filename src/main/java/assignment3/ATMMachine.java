package assignment3;
import java.util.*;
public class ATMMachine extends ATM2 {

    public int TakeAway(int amount) {

        String ok = check(amount);
        if(ok=="accept"){
                int Nbalance = balance - amount;
                balance -= amount;
                System.out.println("With drawal amount is " + amount);
                System.out.println("Your balance became " + Nbalance);

                return 1;

            }
            else {
                System.out.println("Your balance isnt enough");

                return 0;
            }



    }
}

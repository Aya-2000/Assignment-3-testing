package assignment3;
import java.util.*;
public class CoffeeMachine extends Coffee2  {

    public int order(int type, int amount) {

        Boolean test = check(type, amount);

        if (test == true) {
            float money = price - (float) type;
            int cofAmount = coffeeAmount - amount;
            System.out.println("the remaining amount of money is " + money);
            System.out.println("You can fill your cup up to  " + cofAmount + " ml more");

            return 1;
        } else {
            System.out.println("Either money isn't sufficient or the amount of coffee is higher than the normal range");
            return 0;
        }
    }






}

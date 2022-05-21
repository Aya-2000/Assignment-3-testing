package assignment1;
import java.util.*;
public class Watermelon {
    public  boolean watermelon(int w) {


        if (w >= 1 && w <= 100) {
            if (w % 2 == 0) {
                System.out.println("Yes");
                return true;
            } else {
                System.out.println("NO");
                return false;
            }
        }
        else {
            System.out.println("Weight must be between 1 & 100");
            return false;
        }
    }
}

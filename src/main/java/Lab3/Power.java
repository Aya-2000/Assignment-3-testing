package Lab3;
import java.util.*;
public class Power extends Multiply{
    public static int power(int x,int y){
        int result =1;
        for(int i=0;i<y;i++)
            result=multiply(result,x);
      return result;
    }
}

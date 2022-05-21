package Lab3;
import java.util.*;
public class Multiply extends Add {

    public static int multiply(int x, int v){

        return R_Multiply(x,v);
    }
    private static int S_Multiply(int x,int y){

        return -1;
    }
    private static int R_Multiply(int x,int y)
    {
        int sum=0;
        for(int i=0;i<y;i++)
            sum=add(sum,x);
        return sum;
    }
}

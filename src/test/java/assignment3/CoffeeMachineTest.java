package assignment3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeMachineTest  {
    @Test
    public void test1(){
        CoffeeMachine c1=new CoffeeMachine();
        assertEquals(1,c1.order(5,30));
    }
    @Test
    public void test2(){
        CoffeeMachine c2=new CoffeeMachine();
        assertEquals(1,c2.order(20,30));
    }
    @Test
    public void test3(){
        CoffeeMachine c2=new CoffeeMachine();
        assertEquals(0,c2.order(200,300));
    }
    @Test
    public void test4(){
        CoffeeMachine c2=new CoffeeMachine();
        assertEquals(1,c2.order(100,299));
    }
    //@Test
    ///public void test() {

}

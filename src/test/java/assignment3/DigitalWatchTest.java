package assignment3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitalWatchTest {
    @Test
    public void test(){
        DigitalWatch tester= new DigitalWatch();

        assertEquals(1,tester.timer(10,20,19,15));
    }
    @Test
    public void test1(){
        DigitalWatch tester= new DigitalWatch();

        assertEquals(1,tester.timer(10,60,8,20));

    }
    @Test
    public void test2(){
        DigitalWatch tester= new DigitalWatch();

        assertEquals(1,tester.timer(40,30,20,20));

    }

}
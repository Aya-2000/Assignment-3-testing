package assignment1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WatermelonTest  {

    @Test
    public void check_even()throws IllegalArgumentException{
        Watermelon wat=new Watermelon();

        assertEquals(false,wat.watermelon(3));
    }

    @Test
    public void check_even2()throws IllegalArgumentException{
        Watermelon wat=new Watermelon();

        assertEquals(true,wat.watermelon(50));

    }
    @Test
    public void check_even3()throws IllegalArgumentException{
        Watermelon wat=new Watermelon();

        assertEquals(false,wat.watermelon(102));
        assertEquals(true,wat.watermelon(90));
        assertEquals(false,wat.watermelon(99));
        assertEquals(false,wat.watermelon(0));

    }
}
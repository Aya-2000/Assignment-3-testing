package assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhysicistTest {
    int [][]arr={{1,2,3},{2,3,1},{3,1,2}};
    int [][]arr1={{-1,-2,3},{-2,3,-1},{3,-1,-2}};
    int [][]arr2={{-1,2,3},{1,-2,-3}};
    int [][]arr3={{-200,100,300},{20,30,25},{-20,-20,-20}};
    int [][]arr4={{-100,100,100},{60,30,25}};
    int [][] arr5={{-100,100,50},{100,-50,-25},{0,-50,-25}};
    


    @Test
    public void test1()throws IllegalArgumentException{
        Physicist ph=new Physicist();
        assertEquals(false, ph.Coordinates(3, arr));

        assertEquals(true, ph.Coordinates(3, arr1));

        assertEquals(true, ph.Coordinates(2, arr2));

        assertEquals(false, ph.Coordinates(3, arr3));
        assertEquals(false, ph.Coordinates(2, arr4));
        assertEquals(true, ph.Coordinates(3, arr5));


    }



}
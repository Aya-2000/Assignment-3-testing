package Lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerTest {

    @Test
    void power(){
        assertEquals(25,Power.power(5,2));
    }
    @Test
    void power2(){
        assertEquals(9,Power.power(3,2));
    }
}
package Lab3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MultiplyTest {
    @Test
    void multiply(){
        assertEquals(6,Multiply.multiply(2,3));
        assertEquals(10,Multiply.multiply(2,5));
    }
    @Test
    void multiply2(){
        assertEquals(50,Multiply.multiply(5,10));
        assertEquals(21,Multiply.multiply(7,3));
    }
}
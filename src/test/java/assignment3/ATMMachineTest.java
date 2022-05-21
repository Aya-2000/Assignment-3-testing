package assignment3;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMMachineTest {

    @Test
        public void test() {
            ATMMachine atm = new ATMMachine();
            assertEquals(1, atm.TakeAway(20));
        }
  @Test
        public void test2() {
            ATMMachine atm = new ATMMachine();
            assertEquals(0, atm.TakeAway(50000));
        }

    @Test
    public void test3() {
        ATMMachine atm = new ATMMachine();
        assertEquals(1, atm.TakeAway(19999));
    }
    }

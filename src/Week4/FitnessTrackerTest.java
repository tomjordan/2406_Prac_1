package Week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitnessTrackerTest {


    @Test
    void testgets() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(1, fitnessTracker.getDay());
        assertEquals("January", fitnessTracker.getMonth());
        assertEquals(0, fitnessTracker.getMinutes());
        assertEquals(2019, fitnessTracker.getYear());
    }

    @Test
    void testIputs() {
        FitnessTracker fitnessTracker = new FitnessTracker(21, "February", 2018,
                934);
        assertEquals(21, fitnessTracker.getDay());
        assertEquals("February", fitnessTracker.getMonth());
        assertEquals(934, fitnessTracker.getMinutes());
        assertEquals(2018, fitnessTracker.getYear());
    }


}
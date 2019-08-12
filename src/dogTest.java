import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dogTest {
    @Test
    void testDefault() {
        dog dog = new dog();
        assertNull(dog.name);
        assertEquals(0, dog.age);
        assertNull(dog.breed);
        assertNull(dog.shotStatus);
    }
}
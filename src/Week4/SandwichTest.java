package Week4;

import Week3.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @Test
    void checkgetset() {
        Sandwich sandwhich = new Sandwich();
        sandwhich.setBread("wheat");
        sandwhich.setMain("tuna");
        sandwhich.setPrice(4.99);

        assertEquals("wheat", sandwhich.getBread());
        assertEquals("tuna", sandwhich.getMain());
        assertEquals(4.99, sandwhich.getPrice());

    }
}
package tests;

import Week2.dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testDefault() {
    Human man = new Man(25, 185, "Asian");
    Human women = new Women(25, 150, "Irish");
    women.tooString();
    man.tooString();
    man.sum();
    women.sum();
    }
}

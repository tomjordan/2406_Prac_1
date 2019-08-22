package Week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void checkgetset() {
        Student student = new Student();
        student.setHours(42.5);
        student.setPoints(100);
        assertEquals(100, student.getPoints());
        assertEquals(42.5, student.getCredithours());

    }

    @Test
    void checkGpa() {
        Student student = new Student();
        student.setHours(42.5);
        student.setPoints(100);
        assertEquals(100 / 42.5, student.gpa());

    }
}
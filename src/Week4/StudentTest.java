package Week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void basicTest() {
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
    @Test
    void initialiser() {
        Student student = new Student();
        assertEquals(12, student.getPoints());
        assertEquals(3, student.getCredithours());
        assertEquals(9999, student.getIDnumber());

        student.setHours(42.5);
        student.setPoints(100);
        student.setIDnumber(1000);

        assertEquals(100, student.getPoints());
        assertEquals(42.5, student.getCredithours());
        assertEquals(1000, student.getIDnumber());
        assertEquals(100 / 42.5, student.gpa());




    }
}
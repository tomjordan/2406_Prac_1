package Week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {

    @Test void testinit(){

    Lease lease = new Lease();
    assertEquals(400, lease.getRent());
    assertEquals(15, lease.getAppNum());
    assertEquals(12, lease.getLease());
    assertEquals("Bob", lease.getName());
    }

    @Test void testgetset(){
        Lease lease = new Lease("Tom", 12, 4, 500);
        assertEquals(500, lease.getRent());
        assertEquals(12, lease.getAppNum());
        assertEquals(4, lease.getLease());
        assertEquals("Tom", lease.getName());

    }
    @Test void testpetfee(){
        Lease lease = new Lease();
        lease.petFee();
        assertEquals(410, lease.getRent());
        lease.explainPetPolicy();
    }
}
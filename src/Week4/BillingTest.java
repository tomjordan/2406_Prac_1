package Week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test void testComputeBill1(){
        Billing billing = new Billing();
        assertEquals(108, billing.computeBill(100));
        assertEquals(432, billing.computeBill(100, 4));
        assertEquals(405, billing.computeBill(100, 4, 25));
    }

}
package tpe.fruh_razzaq_jando.fue2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FakultaetTest {

    @Test
    public void testFact() {
        Fakultaet fakultaet = new Fakultaet();
        assertEquals(1, fakultaet.fact(0));
        assertEquals(6, fakultaet.fact(3));
        assertEquals(24, fakultaet.fact(4));
    }

}

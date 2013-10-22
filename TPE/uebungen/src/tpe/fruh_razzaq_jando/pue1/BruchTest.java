package tpe.fruh_razzaq_jando.pue1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BruchTest {

    @Test(expected = RuntimeException.class)
    public void testZero() {
        new Bruch(10, 0);
    }


    @Test
    public void testGetDezimalzahl() {
        assertEquals(9.5D, new Bruch(19, 2).getDezimalzahl(), 0.1D);
        assertEquals(8.0, new Bruch(16, 2).getDezimalzahl(), 0.1);
        assertEquals(0.5, new Bruch(5, 10).getDezimalzahl(), 0.1);
    }

    @Test
    public void testEchterBruch() {
        Bruch bruch1 = new Bruch(24, 5).echterBruch();
        assertEquals(new Bruch(4, 4, 5), bruch1);

        Bruch bruch2 = new Bruch(47, 5).echterBruch();
        assertEquals(new Bruch(9, 2, 5), bruch2);
    }

    @Test
    public void testMinus() {
        Bruch bruch1 = new Bruch(-4, 5);
        Bruch bruch2 = new Bruch(-4, 5);
        assertEquals(new Bruch(16, 25), bruch1.multipliziere(bruch2));
    }

    public void testMinusMinus() {
        Bruch bruch1 = new Bruch(-2, -3);


    }

    @Test
    public void testUnechterBruch() {
        Bruch bruch1 = new Bruch(4, 4, 5).unechterBruch();
        assertEquals(new Bruch(24, 5), bruch1);

        Bruch bruch2 = new Bruch(9, 2, 5).unechterBruch();
        assertEquals(new Bruch(47, 5), bruch2);
    }

    @Test
    public void testAddiere() {
        assertEquals(new Bruch(3, 10), new Bruch(1, 6).addiere(new Bruch(2, 15)));
        assertEquals(new Bruch(2, 5), new Bruch(1, 5).addiere(new Bruch(1, 5)));
        assertEquals(new Bruch(8, 10), new Bruch(2, 10).addiere(new Bruch(3, 5)));
        assertEquals(new Bruch(2, 10), new Bruch(2, 10).addiere(new Bruch(0, 10)));
    }

    @Test
    public void testSubtrahiere() {
        assertEquals(new Bruch(2, 15), new Bruch(3, 10).subtrahiere(new Bruch(1, 6)));
        assertEquals(new Bruch(1, 5), new Bruch(2, 5).subtrahiere(new Bruch(1, 5)));
        assertEquals(new Bruch(3, 5), new Bruch(8, 10).subtrahiere(new Bruch(2, 10)));
    }

    @Test
    public void testMultipliziere() {
        assertEquals(new Bruch(3, 60), new Bruch(3, 10).multipliziere(new Bruch(1, 6)));
        assertEquals(new Bruch(15, 6), new Bruch(3, 6).multipliziere(5));
    }

    @Test
    public void testDividiere() {
        assertEquals(new Bruch(3, 10), new Bruch(3, 60).dividiere(new Bruch(1, 6)));
        assertEquals(new Bruch(1, 200), new Bruch(3, 60).dividiere(10));
    }

    @Test
    public void testPotenziere() {
        Bruch bruch1a = new Bruch(2, 3);
        assertEquals(new Bruch(1, 1), bruch1a.potenziere(0));
        assertEquals(new Bruch(2, 3), bruch1a.potenziere(1));
        assertEquals(new Bruch(4, 9), bruch1a.potenziere(2));
        assertEquals(new Bruch(8, 27), bruch1a.potenziere(3));
    }

    @Test
    public void testKehrwert() {
        assertEquals(new Bruch(1, 2), new Bruch(2, 1).kehrwert());
        assertEquals(new Bruch(2, 1, 2), new Bruch(2, 2, 1).kehrwert());
    }

    @Test
    public void testKuerze() {
        assertEquals(new Bruch(1, 2), new Bruch(3, 6));
    }

    @Test
    public void testHashCode() {
        assertEquals(new Bruch(3, 4, 5).hashCode(), new Bruch(3, 4, 5).hashCode());
        assertEquals(new Bruch(4, 5).hashCode(), new Bruch(4, 5).hashCode());

    }

}

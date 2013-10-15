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
        Bruch bruch1 = new Bruch(24, 5);
        bruch1.echterBruch();
        assertEquals(new Bruch(4, 4, 5).toString(), bruch1.toString());

        Bruch bruch2 = new Bruch(47, 5);
        bruch2.echterBruch();
        assertEquals(new Bruch(9, 2, 5).toString(), bruch2.toString());
    }

    @Test
    public void testMinus() {
        Bruch bruch1 = new Bruch(-4, 5);
        Bruch bruch2 = new Bruch(-4, 5);
        assertEquals(new Bruch(16, 25), bruch1.multipliziere(bruch2));
    }

    @Test
    public void testUnechterBruch() {
        Bruch bruch1 = new Bruch(4, 4, 5);
        bruch1.unechterBruch();
        assertEquals(new Bruch(24, 5).toString(), bruch1.toString());

        Bruch bruch2 = new Bruch(9, 2, 5);
        bruch2.unechterBruch();
        assertEquals(new Bruch(47, 5).toString(), bruch2.toString());
    }

    @Test
    public void testAddiere() {
        assertEquals(new Bruch(3, 10).toString(), new Bruch(1, 6).addiere(new Bruch(2, 15)).toString());
        assertEquals(new Bruch(2, 5).toString(), new Bruch(1, 5).addiere(new Bruch(1, 5)).toString());
        assertEquals(new Bruch(8, 10).toString(), new Bruch(2, 10).addiere(new Bruch(3, 5)).toString());
        assertEquals(new Bruch(2, 10).toString(), new Bruch(2, 10).addiere(new Bruch(0, 10)).toString());
    }

    @Test
    public void testSubtrahiere() {
        assertEquals(new Bruch(2, 15).toString(), new Bruch(3, 10).subtrahiere(new Bruch(1, 6)).toString());
        assertEquals(new Bruch(1, 5).toString(), new Bruch(2, 5).subtrahiere(new Bruch(1, 5)).toString());
        assertEquals(new Bruch(3, 5).toString(), new Bruch(8, 10).subtrahiere(new Bruch(2, 10)).toString());
    }

    @Test
    public void testMultipliziere() {
        assertEquals(new Bruch(3, 60).toString(), new Bruch(3, 10).multipliziere(new Bruch(1, 6)).toString());
        assertEquals(new Bruch(15, 6).toString(), new Bruch(3, 6).multipliziere(5).toString());
    }

    @Test
    public void testDividiere() {
        assertEquals(new Bruch(3, 10).toString(), new Bruch(3, 60).dividiere(new Bruch(1, 6)).toString());
        assertEquals(new Bruch(1, 200).toString(), new Bruch(3, 60).dividiere(10).toString());
    }

    @Test
    public void testPotenziere() {
        Bruch bruch1a = new Bruch(2, 3);
        assertEquals(new Bruch(1, 1).toString(), bruch1a.potenziere(0).toString());
        assertEquals(new Bruch(2, 3).toString(), bruch1a.potenziere(1).toString());
        assertEquals(new Bruch(4, 9).toString(), bruch1a.potenziere(2).toString());
        assertEquals(new Bruch(8, 27).toString(), bruch1a.potenziere(3).toString());
    }

    @Test
    public void testKehrwert() {
        assertEquals(new Bruch(1, 2).toString(), new Bruch(2, 1).kehrwert().toString());
    }

    @Test
    public void testKuerze() {
        assertEquals(new Bruch(1, 2).toString(), new Bruch(3, 6).toString());
    }

}

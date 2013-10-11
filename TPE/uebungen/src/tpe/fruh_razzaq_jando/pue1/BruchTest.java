package tpe.fruh_razzaq_jando.pue1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BruchTest {

	@Test
	public void testGetDezimalzahl() {
		Bruch bruch1 = new Bruch(19, 2);
		assertEquals(9.5D, bruch1.getDezimalzahl(), 0.1D);

		Bruch bruch2 = new Bruch(16, 2);
		assertEquals(8.0, bruch2.getDezimalzahl(), 0.1);

		Bruch bruch3 = new Bruch(5, 10);
		assertEquals(0.5, bruch3.getDezimalzahl(), 0.1);
	}

	@Test
	public void testEchterBruch() {
		Bruch bruch1e = new Bruch(4, 4, 5);
		Bruch bruch1 = new Bruch(24, 5);
		bruch1.echterBruch();

		assertEquals(bruch1e.toString(), bruch1.toString());

		Bruch bruch2e = new Bruch(9, 2, 5);
		Bruch bruch2 = new Bruch(47, 5);
		bruch2.echterBruch();

		assertEquals(bruch2e.toString(), bruch2.toString());
	}

	@Test
	public void testUnechterBruch() {
		Bruch bruch1 = new Bruch(4, 4, 5);
		Bruch bruch1e = new Bruch(24, 5);
		bruch1.unechterBruch();

		assertEquals(bruch1e.toString(), bruch1.toString());

		Bruch bruch2 = new Bruch(9, 2, 5);
		Bruch bruch2e = new Bruch(47, 5);
		bruch2.unechterBruch();

		assertEquals(bruch2e.toString(), bruch2.toString());
	}

	@Test
	public void testAddiere() {
		Bruch bruch1a = new Bruch(1, 6);
		Bruch bruch1b = new Bruch(2, 15);
		Bruch bruch1exp = new Bruch(3, 10);
		Bruch bruch1act = bruch1a.addiere(bruch1b);

		assertEquals(bruch1exp.toString(), bruch1act.toString());

		Bruch bruch2a = new Bruch(1, 5);
		Bruch bruch2b = new Bruch(1, 5);
		Bruch bruch2exp = new Bruch(2, 5);
		Bruch bruch2act = bruch2a.addiere(bruch2b);

		assertEquals(bruch2exp.toString(), bruch2act.toString());

		Bruch bruch3a = new Bruch(2, 10);
		Bruch bruch3b = new Bruch(3, 5);
		Bruch bruch3exp = new Bruch(8, 10);
		Bruch bruch3act = bruch3a.addiere(bruch3b);

		assertEquals(bruch3exp.toString(), bruch3act.toString());
	}

	@Test
	public void testSubtrahiere() {
		Bruch bruch1a = new Bruch(3, 10);
		Bruch bruch1b = new Bruch(1, 6);
		Bruch bruch1exp = new Bruch(2, 15);
		Bruch bruch1act = bruch1a.subtrahiere(bruch1b);

		assertEquals(bruch1exp.toString(), bruch1act.toString());

		Bruch bruch2a = new Bruch(2, 5);
		Bruch bruch2b = new Bruch(1, 5);
		Bruch bruch2exp = new Bruch(1, 5);
		Bruch bruch2act = bruch2a.subtrahiere(bruch2b);

		assertEquals(bruch2exp.toString(), bruch2act.toString());

		Bruch bruch3a = new Bruch(8, 10);
		Bruch bruch3b = new Bruch(2, 10);
		Bruch bruch3exp = new Bruch(3, 5);
		Bruch bruch3act = bruch3a.subtrahiere(bruch3b);

		assertEquals(bruch3exp.toString(), bruch3act.toString());
	}

	@Test
	public void testMultipliziere() {
		Bruch bruch1a = new Bruch(3, 10);
		Bruch bruch1b = new Bruch(1, 6);
		Bruch bruch1exp = new Bruch(3, 60);
		Bruch bruch1act = bruch1a.multipliziere(bruch1b);

		assertEquals(bruch1exp.toString(), bruch1act.toString());

		Bruch bruch2a = new Bruch(3, 6);
		int zahl2b = 5;
		Bruch bruch2exp = new Bruch(15, 6);
		Bruch bruch2act = bruch2a.multipliziere(zahl2b);

		assertEquals(bruch2exp.toString(), bruch2act.toString());
	}

	@Test
	public void testDividiere() {
		Bruch bruch1a = new Bruch(3, 60);
		Bruch bruch1b = new Bruch(1, 6);
		Bruch bruch1exp = new Bruch(3, 10);
		Bruch bruch1act = bruch1a.dividiere(bruch1b);

		assertEquals(bruch1exp.toString(), bruch1act.toString());

		Bruch bruch2a = new Bruch(3, 60);
		int zahl2b = 10;
		Bruch bruch2exp = new Bruch(3, 6);
		Bruch bruch2act = bruch2a.dividiere(zahl2b);

		assertEquals(bruch2exp.toString(), bruch2act.toString());
	}

	@Test
	public void testPotenziere() {
		Bruch bruch1a = new Bruch(2, 3);
		int zahl1b = 0;
		Bruch bruch1exp = new Bruch(2, 15);
		Bruch bruch1act = bruch1a.potenziere(zahl1b);

		assertEquals(bruch1exp.toString(), bruch1act.toString());
	}

}

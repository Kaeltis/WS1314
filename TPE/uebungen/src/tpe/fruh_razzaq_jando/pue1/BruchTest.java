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

}

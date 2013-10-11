package tpe.fruh_razzaq_jando.pue1;

import static org.junit.Assert.*;
import org.junit.Test;

public class BruchTest {

	@Test
	public void testBruchLongLong() {
		Bruch bruch1 = new Bruch(1, 2);
		Bruch bruch2 = new Bruch(20, 45);

		assertEquals(bruch1.toString(), "1/2");
		assertEquals(bruch2.toString(), "4/9");

		System.out.println(bruch2);
	}

	@Test
	public void testBruchLongLongLong() {
		fail("Not yet implemented");
	}

}

package tpe.fruh_razzaq_jando.pue1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BruchTest {

    @Test
    public void testBruchLongLong() {
        Bruch bruch1 = new Bruch(1, 2);
        Bruch bruch2 = new Bruch(45, 20, 3);
        System.out.println(bruch2);
        bruch2.unechterBruch();
        System.out.println("Unechter Bruch: " + bruch2);
        bruch2.echterBruch();
        System.out.println("Echter Bruch: " + bruch2);
    }

	/*@Test
    public void testBruchLongLongLong() {
		fail("Not yet implemented");
	}
           */
}

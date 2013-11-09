package tpe.fruh_razzaq_jando.pue2;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class MetropolisTest {


    @Test
    public void progressiveTax() {
        assertEquals(1000, new Buerger("Heinz", 10000, 26).berechneEinkommensteuer());
        assertEquals(2000, new Buerger("Heinz", 20000, 26).berechneEinkommensteuer());
        assertEquals(4500, new Buerger("Heinz", 30000, 26).berechneEinkommensteuer());
        assertEquals(7000, new Buerger("Heinz", 40000, 26).berechneEinkommensteuer());
        assertEquals(9500, new Buerger("Heinz", 50000, 26).berechneEinkommensteuer());
        assertEquals(12000, new Buerger("Heinz", 60000, 26).berechneEinkommensteuer());
        assertEquals(19000, new Buerger("Heinz", 80000, 26).berechneEinkommensteuer());
        assertEquals(26000, new Buerger("Heinz", 100000, 26).berechneEinkommensteuer());
        assertEquals(33000, new Buerger("Heinz", 120000, 26).berechneEinkommensteuer());
        assertEquals(43000, new Buerger("Heinz", 140000, 26).berechneEinkommensteuer());
        assertEquals(48000, new Buerger("Heinz", 150000, 26).berechneEinkommensteuer());
        assertEquals(73000, new Buerger("Heinz", 200000, 26).berechneEinkommensteuer());
    }

    @Test
    public void testRichter() {
        assertEquals(true, new Richter("Karl-Heinz", 120000, 42, false).verurteilen());
    }

    @Test
    public void testKampf(){
        LinkedList<Superkraft> superkraefte =  new LinkedList<Superkraft>();
        superkraefte.add(Superkraft.Blitzewerfen);
        superkraefte.add(Superkraft.Hadoken);
        assertEquals(false, new Superheld("Superman", 120000, "Muskeln" ,superkraefte).kaempfe(new Schurke("Atermis Etreri", 500, "DoppelDolchHand", Superkraft.Sturmkraft)));
    }


}

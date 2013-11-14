package tpe.fruh_razzaq_jando.pue2;

import org.junit.Test;
import tpe.fruh_razzaq_jando.pue2.einwohner.Buerger;
import tpe.fruh_razzaq_jando.pue2.einwohner.Richter;
import tpe.fruh_razzaq_jando.pue2.einwohner.Schurke;
import tpe.fruh_razzaq_jando.pue2.einwohner.Superheld;
import tpe.fruh_razzaq_jando.pue2.helper.Superkraft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Kapitalgesellschaft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Syndikat;

import static org.junit.Assert.*;

public class MetropolisTest {

    @Test
    public void testRichter() {
        assertTrue(new Richter("Karl-Heinz", 120000, 42, false).verurteilen());
        assertFalse(new Richter("Karl-Heinz-Bösewicht", 1520000, 24, true).verurteilen());
    }

    @Test
    public void testKampf() {
        // Schurke gewinnt (Held hat Kraft nicht)
        assertFalse(new Superheld("Superman", 120000, "Muskeln", Superkraft.Hadoken, Superkraft.Blitzewerfen).kaempfe(
                new Schurke("Atermis Etreri", 500, "DoppelDolchHand", Superkraft.Sturmkraft)));
        assertTrue(new Schurke("Schurke1", 234565, "Dolchhand", Superkraft.Hadoken).kaempfe(
                new Superheld("Suuuupermann", 234345, "Fliegen", Superkraft.Blitzewerfen, Superkraft.Kaioken)));

        // Superheld gewinnt (hat Kraft des Schurken)
        assertTrue(new Superheld("Superman", 120000, "Muskeln", Superkraft.Hadoken, Superkraft.Blitzewerfen).kaempfe(
                new Schurke("Atermis Etreri", 500, "DoppelDolchHand", Superkraft.Blitzewerfen)));
        assertFalse(new Schurke("Schurke1", 234565, "Dolchhand", Superkraft.Blitzewerfen).kaempfe(
                new Superheld("Suuuupermann", 234345, "Fliegen", Superkraft.Blitzewerfen, Superkraft.Kaioken)));
    }

    @Test
    public void testSyndikatAnzahl() {
        Schurke schurke = new Schurke("TestSchurke", 234345, "Dolchhand", Superkraft.Blitzewerfen);
        Syndikat syndikat = new Syndikat("TestSyndikat", schurke, schurke, schurke, schurke);
        assertEquals(4, syndikat.getMitglieder().size());
    }

    @Test
    public void testGewerbeSteuer() {
        Buerger gesellschafter = new Buerger("TestBuerger", 10000, 23);
        Kapitalgesellschaft kpg = new Kapitalgesellschaft("TestUnternehmen", 10000, gesellschafter,
                gesellschafter, gesellschafter);
        kpg.berechneGewerbesteuer();
        assertEquals(1000, kpg.berechneGewerbesteuer());
    }

    @Test
    public void testKoerperschaftsteuer() {
        Buerger gesellschafter = new Buerger("TestBuerger33", 123455, 46);
        Kapitalgesellschaft kpg = new Kapitalgesellschaft("TestUnternehmen", 30000, gesellschafter,
                gesellschafter, gesellschafter);
        assertEquals(7500, kpg.berechneKoerperschaftsteuer());
    }

    @Test
    public void testEinkommenssteuer() {
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

    @Test(expected = IllegalArgumentException.class)
    public void testUngueltigerKampfSchurke() {
        Schurke schurke = new Schurke("TestSchurke", 234345, "Dolchhand", Superkraft.Blitzewerfen);
        schurke.kaempfe(schurke);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUngueltigerKampfSuperheld() {
        Superheld superheld = new Superheld("Superman", 120000, "Muskeln", Superkraft.Hadoken, Superkraft.Blitzewerfen);
        superheld.kaempfe(superheld);
    }

}

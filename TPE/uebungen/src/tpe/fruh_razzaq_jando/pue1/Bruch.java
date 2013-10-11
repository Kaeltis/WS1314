package tpe.fruh_razzaq_jando.pue1;

import java.math.*;

/**
 * Diese Klasse implementiert einen Bruch
 * 
 * @author TPE_UIB_01
 */
public class Bruch {

	// ================================================================================
	// Properties
	// ================================================================================

	private long nenner, zaehler, ganze;

	// ================================================================================
	// Constructors
	// ================================================================================

	Bruch(long zaehler, long nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		kuerze();
	}

	Bruch(long zaehler, long nenner, long ganze) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.ganze = ganze;
		kuerze();
	}

	// ================================================================================
	// Accessors
	// ================================================================================

	public long getNenner() {
		return nenner;
	}

	public void setNenner(long nenner) {
		this.nenner = nenner;
	}

	public long getZaehler() {
		return zaehler;
	}

	public void setZaehler(long zaehler) {
		this.zaehler = zaehler;
	}

	public long getGanze() {
		return ganze;
	}

	public void setGanze(long ganze) {
		this.ganze = ganze;
	}

	// ================================================================================
	// Methods
	// ================================================================================

	private void kuerze() {
		long ggt = getGGT(Math.min(zaehler, nenner));

		this.zaehler = this.zaehler / ggt;
		this.nenner = this.nenner / ggt;
	}

	private long getGGT(long aktuelleZahl) {
		if (zaehler % aktuelleZahl == 0 && nenner % aktuelleZahl == 0)
			return aktuelleZahl;
		else
			return getGGT(aktuelleZahl - 1);
	}

	@Override
	public String toString() {
		if (ganze == 0)
			return zaehler + "/" + nenner;
		else if (zaehler == 0 && nenner == 0)
			return ganze + "";
		else
			return ganze + " " + zaehler + "/" + nenner;
	}

}

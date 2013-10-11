package tpe.fruh_razzq_jando.pue1;

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

	}

}

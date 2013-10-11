package tpe.fruh_razzaq_jando.pue1;

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
		if (nenner == 0)
			throw new RuntimeException(
					"Bruch(zaehler, nenner) - nenner darf nicht 0 sein!");
		else {
			this.zaehler = zaehler;
			this.nenner = nenner;
			kuerze();
		}
	}

	Bruch(long ganze, long zaehler, long nenner) {
		if (nenner == 0)
			throw new RuntimeException(
					"Bruch(zaehler, nenner, ganze) - nenner darf nicht 0 sein!");
		else {
			this.zaehler = zaehler;
			this.nenner = nenner;
			this.ganze = ganze;
			kuerze();
		}
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
	
	public Bruch kehrwert() {
		return new Bruch(this.nenner, this.zaehler);
	}

	public Bruch addiere(Bruch zweiterBruch) {
		boolean echt = false;
		Bruch tmpBruch1;
		Bruch tmpBruch2;
		if (this.ganze != 0) {
			echt = true;
			tmpBruch1 = new Bruch(this.ganze, this.zaehler, this.nenner);
		} else {
			tmpBruch1 = new Bruch(this.zaehler, this.nenner);
		}
		if (zweiterBruch.ganze != 0) {
			echt = true;
			tmpBruch2 = new Bruch(zweiterBruch.ganze, zweiterBruch.zaehler,
					zweiterBruch.nenner);
		} else {
			tmpBruch2 = new Bruch(zweiterBruch.zaehler, zweiterBruch.nenner);
		}
		tmpBruch1.unechterBruch();
		tmpBruch2.unechterBruch();
		long zaehler = (tmpBruch1.zaehler * tmpBruch2.nenner)
				+ (tmpBruch2.zaehler * tmpBruch1.nenner);
		Bruch ergebnisBruch = new Bruch(zaehler, tmpBruch1.nenner
				* tmpBruch2.nenner);
		ergebnisBruch.kuerze();
		if (echt) {
			ergebnisBruch.echterBruch();
		}
		return ergebnisBruch;
	}

	public void unechterBruch() {
		if (this.ganze != 0) {
			this.zaehler = (this.ganze * this.nenner) + this.zaehler;
			this.ganze = 0;
		}
	}

	public void echterBruch() {
		while (this.zaehler > this.nenner) {
			this.ganze++;
			this.zaehler -= this.nenner;
		}
	}

	public double getDezimalzahl() {
		return ganze + ((double) zaehler / (double) nenner);
	}

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

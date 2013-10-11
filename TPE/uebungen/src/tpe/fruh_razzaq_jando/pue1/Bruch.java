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

	public boolean equals(Bruch zweiterBruch) {
		Bruch tmpBruch1 = this.cloneObject();
		Bruch tmpBruch2 = zweiterBruch.cloneObject();
		tmpBruch1.unechterBruch();
		tmpBruch2.unechterBruch();

		if (tmpBruch1.getZaehler() == tmpBruch2.getZaehler()
				&& tmpBruch1.getNenner() == tmpBruch2.getNenner())
			return true;
		else
			return false;
	}

	public boolean isEcht() {
		return (this.ganze != 0);
	}

	public Bruch kehrwert() {
		return new Bruch(this.nenner, this.zaehler);
	}

	private Bruch cloneObject() {
		if (this.ganze != 0) {
			return new Bruch(this.ganze, this.zaehler, this.nenner);
		} else {
			return new Bruch(this.zaehler, this.nenner);
		}
	}

	public Bruch addiere(Bruch zweiterBruch) {
		return rechenOperation(zweiterBruch, '+');
	}

	private Bruch rechenOperation(Bruch zweiterBruch, char operation) {
        boolean echt = false;
        Bruch tmpBruch1 = this.cloneObject();
        Bruch tmpBruch2 = zweiterBruch.cloneObject();

        /**/

        if (tmpBruch1.isEcht() || tmpBruch2.isEcht()) {
            echt = true;
        }
        tmpBruch1.unechterBruch();
        tmpBruch2.unechterBruch();
        long zaehler = tmpBruch1.neuerZaehler(operation, tmpBruch2);
        Bruch ergebnisBruch = new Bruch(zaehler, tmpBruch1.nenner
                * tmpBruch2.nenner);
        ergebnisBruch.kuerze();
        if (echt) {
            ergebnisBruch.echterBruch();
        }
        return ergebnisBruch;
	}

    private long neuerZaehler(char operation, Bruch tmpBruch2) {
        switch (operation) {
		case '+':
			return (this.zaehler * tmpBruch2.nenner)
					+ (tmpBruch2.zaehler * this.nenner);
		case '-':
			return (this.zaehler * tmpBruch2.nenner)
					- (tmpBruch2.zaehler * this.nenner);
		}
        return 0;
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

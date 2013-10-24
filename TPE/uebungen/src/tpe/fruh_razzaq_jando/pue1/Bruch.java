package tpe.fruh_razzaq_jando.pue1;

/**
 * Diese Klasse implementiert einen Bruch
 * 
 * @author TPE_UIB_01
 */
public class Bruch implements Cloneable {

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
			checkDoppelMinus(zaehler, nenner);
			kuerze();
		}
	}

	Bruch(long ganze, long zaehler, long nenner) {
		if (nenner == 0)
			throw new RuntimeException(
					"Bruch(zaehler, nenner, ganze) - nenner darf nicht 0 sein!");
		else {
			checkDoppelMinus(zaehler, nenner);
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

	public long getZaehler() {
		return zaehler;
	}

	public long getGanze() {
		return ganze;
	}

	// ================================================================================
	// Methods
	// ================================================================================

	/**
	 * Methode welche aus einem doppelten Minusbruch z.B. -3/-2 3/2 wird
	 * 
	 * @param zaehler
	 *            Vom Bruch der Zaehler
	 * @param nenner
	 *            Vom Bruch der Nenner
	 */
	private void checkDoppelMinus(long zaehler, long nenner) {
		// Wenn Zähler und Nenner kleiner Null ist, wird Bruch positiv
		if (zaehler < 0 && nenner < 0) {
			this.zaehler = Math.abs(zaehler);
			this.nenner = Math.abs(nenner);
		} else {
			this.zaehler = zaehler;
			this.nenner = nenner;
		}
	}

	/**
	 * Methode implementiert die Rechnung eines Bruches mit einer Potenz
	 * 
	 * @param potenz
	 *            - Gibt die Potenz an , mit welcher der Bruch potenziert werden
	 *            soll
	 * @return Einen neuen Bruch nachdem die Potenz darauf angewendet wurde
	 */
	public Bruch potenziere(long potenz) {
		boolean warEcht = false;

		if (isEcht()) {
			unechterBruch();
			warEcht = true;
		}

		long zaehler = (long) Math.pow(this.zaehler, potenz);
		long nenner = (long) Math.pow(this.nenner, potenz);

		Bruch newBruch = new Bruch(zaehler, nenner);

		if (warEcht) {
			newBruch.echterBruch();
		}

		return newBruch;
	}

	/**
	 * Methode, welche überprüft ob ein Bruch echt ist.
	 * 
	 * @return Einen Boolean ob der Bruch Echt ist.
	 */
	public boolean isEcht() {
		return (this.ganze != 0); // Nur wenn der Bruch einen ganzzahligen
									// Anteil besitzt ist er echt
	}

	/**
	 * Methode liefert zu einem Bruch den Kehrwert Bsp (1/2 = 2/1)
	 * 
	 * @return einen neuen Bruch mit des Kehrwertes des alten Bruchs
	 */
	public Bruch kehrwert() {
		if (this.isEcht()) {
			return (new Bruch(this.ganze, this.nenner, this.zaehler));
		} else {
			return new Bruch(this.nenner, this.zaehler);
		}
	}

	/**
	 * Methode, welche einen Bruch übergeben bekommt, um eine interne Methode
	 * zum Rechnen aufzurufen
	 * 
	 * @param zweiterBruch
	 *            Ein zweiter Bruch zum Berechnen eines neuen Bruchs
	 * @return Das Ergebnis von rechenOperation
	 */
	public Bruch addiere(Bruch zweiterBruch) {
		return rechenOperation(zweiterBruch, '+');
	}

	/**
	 * Methode, welche einen Bruch übergeben bekommt, um eine interne Methode
	 * zum Rechnen aufzurufen
	 * 
	 * @param zweiterBruch
	 *            Ein zweiter Bruch zum Berechnen eines neuen Bruchs
	 * @return Das Ergebnis von rechenOperation
	 */
	public Bruch subtrahiere(Bruch zweiterBruch) {
		return rechenOperation(zweiterBruch, '-');
	}

	/**
	 * Methode, welche einen Bruch übergeben bekommt, um eine interne Methode
	 * zum Rechnen aufzurufen
	 * 
	 * @param zweiterBruch
	 *            Ein zweiter Bruch zum Berechnen eines neuen Bruchs
	 * @return Das Ergebnis von rechenOperation
	 */
	public Bruch multipliziere(Bruch zweiterBruch) {
		return rechenOperation(zweiterBruch, '*');
	}

	/**
	 * Methode, welche einen Wert übergeben bekommt, um eine interne Methode zum
	 * Rechnen aufzurufen
	 * 
	 * @param wert
	 *            Eine Zahl mit welcher der Bruch multipliziert wird
	 * @return Das Ergebnis von rechenOperation
	 */
	public Bruch multipliziere(long wert) {
		return rechenOperation(new Bruch(wert, 1L), '*');
	}

	/**
	 * Methode, welche einen Bruch übergeben bekommt, um eine interne Methode
	 * zum Rechnen aufzurufen
	 * 
	 * @param zweiterBruch
	 *            Ein zweiter Bruch zum Berechnen eines neuen Bruchs
	 * @return Das Ergebnis von rechenOperation
	 */
	public Bruch dividiere(Bruch zweiterBruch) {
		return rechenOperation(zweiterBruch, ':');
	}

	/**
	 * Methode, welche einen Bruch übergeben bekommt, um eine interne Methode
	 * zum Rechnen aufzurufen
	 * 
	 * @param wert
	 *            Eine Zahl mit welcher der Bruch multipliziert wird
	 * @return Das Ergebnis von rechenOperation
	 */
	public Bruch dividiere(long wert) {
		return rechenOperation(new Bruch(wert, 1), ':');
	}

	private Bruch rechenOperation(Bruch zweiterBruch, char operation) {
		boolean echt = false;

		// Beide Brüche unecht machen um das Rechnen zu vereinfachen
		Bruch tmpBruch1 = this.unechterBruch();
		Bruch tmpBruch2 = zweiterBruch.unechterBruch();
		Bruch ergebnisBruch;

		if (tmpBruch1.isEcht() || tmpBruch2.isEcht()) { // War einer der beiden
														// Brüche vorher echt?
			echt = true;
		}

		// Aufruf einer Methode um einheitlich den Zähler zu berechnen
		long zaehler = tmpBruch1.neuerZaehler(operation, tmpBruch2);
		long nenner;

		// Die Operation geteilt, wird gesondert behandelt aufgrund des
		// Kehrwertes
		if (operation != ':') {
			nenner = tmpBruch1.nenner * tmpBruch2.nenner;
		} else {
			nenner = tmpBruch1.nenner * tmpBruch2.kehrwert().nenner;
		}
		ergebnisBruch = new Bruch(zaehler, nenner);
		ergebnisBruch = ergebnisBruch.rechenKuerzen();

		if (echt) {
			ergebnisBruch = ergebnisBruch.echterBruch();
		}

		return ergebnisBruch;

	}

	private long neuerZaehler(char operation, Bruch tmpBruch2) {
		// Anhand der übergebenen Operation wird die Rechnugn durchgeführt
		switch (operation) {
		case '+':
			return (this.zaehler * tmpBruch2.nenner)
					+ (tmpBruch2.zaehler * this.nenner);
		case '-':
			return (this.zaehler * tmpBruch2.nenner)
					- (tmpBruch2.zaehler * this.nenner);
		case '*':
			return (this.zaehler * tmpBruch2.zaehler);
		case ':':
			Bruch kehrwertBruch = tmpBruch2.kehrwert();
			return (this.zaehler * kehrwertBruch.zaehler);
		}
		return 0;
	}

	/**
	 * Methode, welche aus einem echten/unechten Bruch einen unechten Bruch
	 * macht.
	 * 
	 * @return Unechter Bruch z.B. 7/4
	 */
	public Bruch unechterBruch() {
		if (isEcht()) {
			return (new Bruch(0, (this.ganze * this.nenner) + this.zaehler,
					this.nenner));
		} else {
			return (new Bruch(this.zaehler, this.nenner));
		}
	}

	/**
	 * Methode, welche aus einem echten/unechten Bruch einen unechten Bruch
	 * macht.
	 * 
	 * @return Echter Bruch z.B. 1 3/4
	 */
	public Bruch echterBruch() {
		Bruch neuerBruch = (Bruch) this.clone();
		while (neuerBruch.zaehler > neuerBruch.nenner) {
			neuerBruch.ganze++;
			neuerBruch.zaehler -= neuerBruch.nenner;
		}
		return neuerBruch;
	}

	/**
	 * Methode, welche von einem Bruch den Dezimalwert berechnet.
	 * 
	 * @return Einen neuen Double-Wert mit dem Ergebnis
	 */
	public double getDezimalzahl() {
		return ganze + ((double) zaehler / (double) nenner);
	}

	private void kuerze() {
		if (this.zaehler != 0) {
			// Zum Kürzen brauchen wird den GGT (Größten gemeinsamen Teiler)
			// Kleinere von beiden Zahlen wird übergeben
			long ggt = getGGT(Math.abs(Math.min(this.zaehler, this.nenner)));
			this.zaehler = this.zaehler / ggt;
			this.nenner = this.nenner / ggt;
		}
	}

	private Bruch rechenKuerzen() {
		if (this.zaehler != 0) {
			long ggt = getGGT(Math.min(this.zaehler, this.nenner));
			return (new Bruch(this.ganze, this.zaehler / ggt, this.nenner / ggt));
		}
		return (new Bruch(this.ganze, this.zaehler, this.nenner));
	}

	private long getGGT(long aktuelleZahl) {
		// Sobald Nenner und Zähler keinen Rest mehr haben mit der aktuellen
		// Zahl haben wir unseren GGT gefunden
		if (zaehler % aktuelleZahl == 0 && nenner % aktuelleZahl == 0)
			return aktuelleZahl;
		else
			return getGGT(aktuelleZahl - 1); // Rekursiver Aufruf, mache das
												// Problem kleiner
	}

	/**
	 * Überschreiben der toString() Methode um den Bruch formatiert auszugeben
	 * 
	 * @return Ein als String formatierter Bruch
	 */
	@Override
	public String toString() {
		if (ganze == 0)
			return zaehler + "/" + nenner;
		else if (zaehler == 0 && nenner == 0)
			return ganze + "";
		else
			return ganze + " " + zaehler + "/" + nenner;
	}

	/**
	 * Überschreiben der clone() Methode um den Bruch zu clonen
	 * 
	 * @return Clon des Bruchs
	 */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// does not happen
			return null;
		}
	}

	/**
	 * Überschreiben der equals() Methode um den Bruch zu vergleichen
	 * 
	 * @param o
	 *            Zu vergleichendes Objekt
	 * @return Gleichheit zum verglichenen Bruch
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Bruch bruch = (Bruch) o;

		if (ganze != bruch.ganze)
			return false;
		if (nenner != bruch.nenner)
			return false;
		return zaehler == bruch.zaehler;

	}

	/**
	 * Überschreiben der hashCode() Methode um den Bruch zu vergleichen
	 * 
	 * @return HashCode des Bruchs
	 */
	@Override
	public int hashCode() {
		int result = (int) (nenner ^ (nenner >>> 32));
		result = 31 * result + (int) (zaehler ^ (zaehler >>> 32));
		result = 31 * result + (int) (ganze ^ (ganze >>> 32));
		return result;
	}

}
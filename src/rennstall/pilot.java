package rennstall;

public class pilot extends teammitglied {
	private int nummer;
	private int siege;
	private int bonus = 50000;

	public pilot(String aVorname, String aName, String aNationalitaet, int aNummer, int aSiege, int aGehalt) {
		super(aVorname, aName, aNationalitaet);
		this.nummer = aNummer;
		this.siege = aSiege;
		this.gehalt = aGehalt;

	}

	public int getNummer() {
		return this.nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public void setSiege(int siege) {
		this.siege = siege;
	}

	public int getSiege() {
		return this.siege;
	}

	int berechneGehalt() {
		return super.berechneGehalt() + bonus;
	}
}

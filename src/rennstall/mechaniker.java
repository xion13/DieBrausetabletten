package rennstall;

public class mechaniker extends teammitglied {
	private String spezialgebiet = "";
	private int bonus = 25000;

	public mechaniker(String aVorname, String aName, String aNationalitaet, String aSpezialgebiet, int aGehalt) {
		super(aVorname, aName, aNationalitaet);
		this.spezialgebiet = aSpezialgebiet;
		this.gehalt = aGehalt;
	}

	public void setSpezialgebiet(String spezialgebiet) {
		this.spezialgebiet = spezialgebiet;
	}

	public String getSpezialgebiet() {
		return this.spezialgebiet;
	}

	int berechneGehalt() {
		return super.berechneGehalt() + bonus;
	}
}
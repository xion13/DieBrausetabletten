package rennstall;

public abstract class teammitglied {
	public String vorname = "";
	public String name = "";
	public String nationalitaet = "";
	public int gehalt = 0;

	public teammitglied() {
	}

	public teammitglied(String aVorname, String aName, String aNationalitaet) {
		this.vorname = aVorname;
		this.name = aName;
		this.nationalitaet = aNationalitaet;
	}

	public String getVorname() {
		return this.vorname;
	}

	public String getName() {
		return this.name;
	}

	public String getNationalitaet() {
		return this.nationalitaet;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	int berechneGehalt() {
		return 9 * gehalt;
	}

	public int getGehalt() {
		return this.gehalt;
	}

}
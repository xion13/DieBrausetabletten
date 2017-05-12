package rennstall;

public class rennstall {
	private String sponsor = "";
	private String teamname = "";
	private teammitglied[] team;
	private auto[] renn;
	private int teamCount = 0;
	private int rennCount = 0;

	public rennstall(String aSponsor, String aTeamname) {
		this.team = new teammitglied[5];
		this.renn = new auto[3];
		this.sponsor = aSponsor;
		this.teamname = aTeamname;
	}

	public boolean addTeammitglied(teammitglied team) {

		if (teamCount < 5) {
			this.team[teamCount] = team;
			teamCount++;
			return true;
		}
		return false;

	}

	public boolean addAuto(auto renn) {

		if (rennCount < 3) {
			this.renn[rennCount] = renn;
			teamCount++;
			return true;
		}
		return false;
	}

	public String getSponsor() {
		return this.sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getTeamname() {
		return this.teamname;
	}
}

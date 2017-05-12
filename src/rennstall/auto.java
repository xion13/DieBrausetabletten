package rennstall;

public class auto {
	private boolean zustand;
	private pilot[] fahrer;
	private int fahrerCount = 0;

	public auto(boolean aZustand) {
		this.zustand = aZustand;
		this.fahrer = new pilot[1];
	}

	public boolean addPilot(pilot fahrer) {

		if (fahrerCount < 1) {
			this.fahrer[fahrerCount] = fahrer;
			fahrerCount++;
			return true;
		}
		return false;
	}

	public void setZustand(boolean zustand) {
		this.zustand = zustand;
	}

	public boolean getZustand() {
		return this.zustand;
	}
}

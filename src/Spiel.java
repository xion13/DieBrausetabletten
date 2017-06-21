package SchaumSpiel;

public class Spiel {

	public static void main(String[] args) {

		int pone;
		int ptwo;
		String one = " ";
		String two = " ";
		String win = " ";
		int sc = 0;
		int st = 1;
		int pa = 2;
		int pl = 1;  // Int zur Unterscheidung von pone und ptwo

		pone =  (sc); //durch jbutton ersetzen                                (int)(Math.random() * 3);                        
		ptwo =   (pa);// durch jbutton ersetzen //HINWEIS:                               (int)(Math.random() * 3);             
				 	                       // i soll durch button angelegt werden!!!

		while (pl == 1) {
			switch (pone) {
			case 0:
				one = "Schere";
				pl++;
				break;

			case 1:
				one = "Stein";
				pl++;
				break;

			case 2:
				one = "Papier";
				pl++;
				break;
			}

		}

		System.out.println("P1 hat " + one + "!");

		while (pl == 2) {
			switch (ptwo) {
			case 0:
				two = "Schere";
				pl++;
				break;

			case 1:
				two = "Stein";
				pl++;
				break;

			case 2:
				two = "Papier";
				pl++;
				break;
			}

		}

		System.out.println("P2 hat " + two + "!");

		switch (pone) {

		case 0:

			if (pone == 0 && ptwo == 2 || pone == 0 && ptwo == 3) {
				win = "Du hast gewonnen!";
			} else {
				if (pone == 0 && ptwo == 1 || pone == 0 && ptwo == 4) {
					win = "Du hast verloren!";
				} else {
					win = "Unentschieden!";
				}
			}
			break;
		case 1:

			if (pone == 1 && ptwo == 0 || pone == 1 && ptwo == 3) {
				win = "Du hast gewonnen!";
			} else {
				if (pone == 1 && ptwo == 2 || pone == 1 && ptwo == 4) {
					win = "Du hast verloren!";
				} else {
					win = "Unentschieden!";
				}
			}
			break;
		case 2:

			if (pone == 2 && ptwo == 1 || pone == 2 && ptwo == 4) {
				win = "Du hast gewonnen!";
			} else {
				if (pone == 2 && ptwo == 0 || pone == 2 && ptwo == 3) {
					win = "Du hast verloren!";
				} else {
					win = "Unentschieden!";
				}
			}
			break;

		}

		System.out.println(win);

	}
	static int pone;
	static int ptwo;
	public static void setzeS1(int wert){
		pone = wert;
	}
	
	public static void setzeS2(int wert){
		ptwo = wert;
	}
	
	public static void auswerten() {

		
		String one = " ";
		String two = " ";
		String win = " ";
		//int sc = 0;
		//int st = 1;
		//int pa = 2;
		int pl = 1;  // Int zur Unterscheidung von pone und ptwo

		//pone =  (sc); //durch jbutton ersetzen                                (int)(Math.random() * 3);                        
		//ptwo =   (pa);// durch jbutton ersetzen //HINWEIS:                               (int)(Math.random() * 3);             
				 	                       // i soll durch button angelegt werden!!!

		while (pl == 1) {
			switch (pone) {
			case 0:
				one = "Schere";
				pl++;
				break;

			case 1:
				one = "Stein";
				pl++;
				break;

			case 2:
				one = "Papier";
				pl++;
				break;
			}

		}

		System.out.println("P1 hat " + one + "!");

		while (pl == 2) {
			switch (ptwo) {
			case 0:
				two = "Schere";
				pl++;
				break;

			case 1:
				two = "Stein";
				pl++;
				break;

			case 2:
				two = "Papier";
				pl++;
				break;
			}

		}

		System.out.println("P2 hat " + two + "!");

		switch (pone) {

		case 0:

			if (pone == 0 && ptwo == 2 || pone == 0 && ptwo == 3) {
				win = "Du hast gewonnen!";
			} else {
				if (pone == 0 && ptwo == 1 || pone == 0 && ptwo == 4) {
					win = "Du hast verloren!";
				} else {
					win = "Unentschieden!";
				}
			}
			break;
		case 1:

			if (pone == 1 && ptwo == 0 || pone == 1 && ptwo == 3) {
				win = "Du hast gewonnen!";
			} else {
				if (pone == 1 && ptwo == 2 || pone == 1 && ptwo == 4) {
					win = "Du hast verloren!";
				} else {
					win = "Unentschieden!";
				}
			}
			break;
		case 2:

			if (pone == 2 && ptwo == 1 || pone == 2 && ptwo == 4) {
				win = "Du hast gewonnen!";
			} else {
				if (pone == 2 && ptwo == 0 || pone == 2 && ptwo == 3) {
					win = "Du hast verloren!";
				} else {
					win = "Unentschieden!";
				}
			}
			break;

		}

		System.out.println(win);

	}
}

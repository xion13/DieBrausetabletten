package SchaumSpiel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Spielfeld extends JFrame {

	JButton button0;
	JButton button1;
	JButton button2;
	JLabel l1;
	JLabel gewinner= new JLabel();;
	// JLabel l2;
	// JLabel l3;
	// JLabel l4;
	private boolean first = true;
	public int sc = -1;
	public int st = -1;
	public int pa = -1;
	private int status ;
	JLabel background = new JLabel(new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Tisch.jpg"));;
	public Spielfeld() {
		setTitle("Schnick-Schnack-Schnuck mit den Brausetabletten");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());

		l1 = new JLabel("made by Brausetabletten" );
		l1.setForeground(Color.white);
	
		// l2 = new JLabel("SchereTest");
		// l3 = new JLabel("SteinTest");
		// l4 = new JLabel("PapierTest");
		button0 = new JButton("Schere");
		button1 = new JButton("Stein");
		button2 = new JButton("Papier");

		//JLabel background = new JLabel(new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Tisch.jpg"));
		button0.setIcon(new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Schereb.jpg"));
		button1.setIcon(new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Steinb.jpg"));
		button2.setIcon(new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Papierb.jpg"));

		int m = 2;
		button0.setPreferredSize(new Dimension(200 * m, 300 * m));
		button1.setPreferredSize(new Dimension(200 * m, 300 * m));
		button2.setPreferredSize(new Dimension(200 * m, 300 * m));

		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sc = 0;
				System.out.println(sc);
				// l2.setVisible(true);
				if (first) {
					Spiel.setzeS1(sc);
					first = false;
				} else {
					Spiel.setzeS2(sc);
					status = Spiel.auswerten();
					first = true;
				}
				gewinner();
			}
			
		});

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				st = 1;
				System.out.println(st);

				// l3.setVisible(true);

				if (first) {
					Spiel.setzeS1(st);
					first = false;
				} else {
					Spiel.setzeS2(st);
					status = Spiel.auswerten();
					first = true;
				}
				gewinner();
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pa = 2;
				System.out.println(pa);
				// l4.setVisible(true);
				if (first) {
					Spiel.setzeS1(pa);
					first = false;
				} else {
					Spiel.setzeS2(pa);
					status = Spiel.auswerten();
					first = true;
				}
				gewinner();
			}
		});
		gewinner.setText("          Gewinner steht noch nicht fest");
		gewinner.setForeground(Color.white);
		background.add(l1);
		background.add(this.gewinner);
		
		// background.add(l2);
		// background.add(l3);
		// background.add(l4);
		// l2.setVisible(false);
		// l3.setVisible(false);
		// l4.setVisible(false);
		background.add(button0);
		background.add(button1);
		background.add(button2);
		add(background);
		background.setLayout(new FlowLayout());
		setSize(1920, 1080);
		setIconImage(new ImageIcon(getClass().getResource("/Schaumspiel/brause.png")).getImage());
	}
	
	public void gewinner(){
		if (status == 1) {
			gewinner.setText("Gewonnen");
			gewinner.setForeground(Color.green);
			setVisible(true);
		}
		if (status == 2) {
			gewinner.setText("Verloren");
			gewinner.setForeground(Color.red);
			setVisible(true);
		}

		if (status == 3) {
			gewinner.setText("Unentschieden");
			gewinner.setForeground(Color.white);
			setVisible(true);
			
		}
	}
	
	public static void main(String args[]) {
		new Spielfeld();

	}
}

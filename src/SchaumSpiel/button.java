package SchaumSpiel;

import javax.swing.*;

public class button {

	public static void main(String[] args) {

		JFrame meinJFrame = new JFrame();

		meinJFrame.setTitle("ButtonTest");

		JPanel panel = new JPanel();

		JButton button0 = new JButton("Schere");
		JButton button1 = new JButton("Stein");
		JButton button2= new JButton("Papier");

		panel.add(button0);
		panel.add(button1);
		panel.add(button2);

		meinJFrame.add(panel);

		meinJFrame.pack();

		meinJFrame.setVisible(true);
	}

}

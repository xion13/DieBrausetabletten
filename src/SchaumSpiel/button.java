package SchaumSpiel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class button {
    private static JButton winner = new JButton("");

    private static ImageIcon schere = new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Schere.jpg");
    private static ImageIcon stein = new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Stein.jpg");
    private static ImageIcon papier = new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Papier.jpg");
    private static ImageIcon draw = new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Draw.jpg");
    private static ImageIcon empty = new ImageIcon("F:\\workspace\\BrauseSchaumSpiel\\src\\SchaumSpiel\\Empty.jpg");

    public static void main(String[] args) {

        JFrame meinJFrame = new JFrame();

        meinJFrame.setTitle("ButtonTest");

        JPanel panel = new JPanel();
        panel.setLayout((new BoxLayout(panel, BoxLayout.X_AXIS)));

        JPanel leftcolumn = new JPanel();
        leftcolumn.setLayout((new BoxLayout(leftcolumn, BoxLayout.Y_AXIS)));

        JPanel rightcolumn = new JPanel();
        rightcolumn.setLayout((new BoxLayout(rightcolumn, BoxLayout.Y_AXIS)));

        JButton schereBtn = new JButton();
        JButton steinBtn = new JButton();
        JButton papierBtn = new JButton();

        JButton schereBtn2 = new JButton();
        JButton steinBtn2 = new JButton();
        JButton papierBtn2 = new JButton();

        JButton leftset = new JButton("");
        leftset.setEnabled(false);
        leftset.setIcon(empty);

        JButton rightset = new JButton("");
        rightset.setEnabled(false);
        rightset.setIcon(empty);

        winner.setEnabled(true);
        winner.setIcon(empty);
        String[] comp = {"Empty", "Empty"};

        schereBtn.addActionListener(new ActionListener(){

           public void actionPerformed(ActionEvent e){
               leftset.setIcon(schere);
               //leftset.setVisible(true);
               comp[0] = "Schere";
               compare(comp);

           }
       });

        steinBtn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                leftset.setIcon(stein);
                //leftset.setVisible(true);
               comp[0] = "Stein";
               compare(comp);
            }
        });


        papierBtn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                leftset.setIcon(papier);
                //leftset.setVisible(true);
               comp[0] = "Papier";
              compare(comp);
            }
        });



        schereBtn2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                rightset.setIcon(schere);
                comp[1] = "Schere";
                compare(comp);
            }
        });

         steinBtn2.addActionListener(new ActionListener(){

             public void actionPerformed(ActionEvent e){
                 rightset.setIcon(stein);
                 //leftset.setVisible(true);
                 comp[1] = "Stein";
                 compare(comp);
             }
         });


         papierBtn2.addActionListener(new ActionListener(){

             public void actionPerformed(ActionEvent e){
                 rightset.setIcon(papier);
                 //leftset.setVisible(true);
                 comp[1] = "Papier";
                 compare(comp);
             }
         });


        schereBtn.setIcon(schere);
        steinBtn.setIcon(stein);
        papierBtn.setIcon(papier);

        schereBtn2.setIcon(schere);
        steinBtn2.setIcon(stein);
        papierBtn2.setIcon(papier);



        leftcolumn.add(schereBtn);
        leftcolumn.add(steinBtn);
        leftcolumn.add(papierBtn);
        //panel.add(leftset);

        rightcolumn.add(schereBtn2);
        rightcolumn.add(steinBtn2);
        rightcolumn.add(papierBtn2);

        int spacingH=20;

        panel.add(leftcolumn);
        panel.add(Box.createRigidArea(new Dimension(spacingH,0)));

        panel.add(leftset);
        panel.add(Box.createRigidArea(new Dimension(spacingH,0)));
        panel.add(winner);
        panel.add(Box.createRigidArea(new Dimension(spacingH,0)));
        panel.add(rightset);

        panel.add(Box.createRigidArea(new Dimension(spacingH,0)));
        panel.add(rightcolumn);
        meinJFrame.add(panel);

        meinJFrame.pack();

        meinJFrame.setVisible(true);

    }

    private static void compare(String[] c){

        if(c[0].equals("Schere") && c[1].equals("Schere") || c[1].equals("Schere") && c[0].equals("Schere"))
            winner.setIcon(draw);

        if(c[0].equals("Stein") && c[1].equals("Stein") || c[1].equals("Stein") && c[0].equals("Stein"))
            winner.setIcon(draw);

        if(c[0].equals("Papier") && c[1].equals("Papier") || c[1].equals("Papier") && c[0].equals("Papier"))
            winner.setIcon(draw);

        if(c[0].equals("Schere") && c[1].equals("Stein") || c[1].equals("Schere") && c[0].equals("Stein")  )
            winner.setIcon(stein);

        if(c[0].equals("Stein") && c[1].equals("Papier") || c[1].equals("Stein") && c[0].equals("Papier")  )
            winner.setIcon(papier);

        if(c[0].equals("Schere") && c[1].equals("Papier") || c[1].equals("Schere") && c[0].equals("Papier")  )
            winner.setIcon(schere);



    }

}



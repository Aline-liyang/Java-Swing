/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinal1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Aline
 */
public class Escalade extends JFrame implements ActionListener {

    JButton btnTarifEC, btnRetourEC, btnRetourECC, btnRetourECE;
    JComboBox comboNbEC, comboHeures;
    JRadioButton choix1EC, choix2EC;
    JTextArea TextZoneTarifEC;
    public static float totalEC = 0;
    Escalade() {

        this.setSize(800, 500);
        this.setTitle("Forme Canot");

        JPanel panGlobalEC = new JPanel(new BorderLayout());

        JPanel panTopEC = new JPanel(new BorderLayout());
        panTopEC.setBorder(BorderFactory.createEmptyBorder(5, 5, 20, 50));

        JPanel panCenterEC = new JPanel();
        panCenterEC.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 150));

        JPanel panBottomEC = new JPanel();
        panBottomEC.setBorder(BorderFactory.createEmptyBorder(80, 5, 80, 5));

        panGlobalEC.add(panCenterEC, BorderLayout.CENTER);
        panGlobalEC.add(panBottomEC, BorderLayout.SOUTH);
        panGlobalEC.add(panTopEC, BorderLayout.NORTH);

        JLabel labelimageEC = new JLabel();
        ImageIcon imgEC = new ImageIcon("src/images/Escalade.jpg");
        labelimageEC.setIcon(imgEC);

        btnTarifEC = new JButton("Tarif pour l'Escalade");
        btnTarifEC.setBackground(Color.PINK);
        btnTarifEC.addActionListener(this);

        JTextArea textzoneEC = new JTextArea(5, 30);
        textzoneEC.setText("                       Tarfis pour l'Escalade  Ete 2022 \n  Location d’un casque, d’un piolet et de cordes :   $ 10,00  par heure par personne  ");
        textzoneEC.setBackground(Color.green);
        
        
                
                
        JPanel panTextEC = new JPanel(new BorderLayout());
       panTextEC.setBorder(BorderFactory.createEmptyBorder(70,0, 70, 0));
        labelimageEC.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnTarifEC.setAlignmentX(Component.CENTER_ALIGNMENT);
//        textzoneEC.setAlignmentX(Component.CENTER_ALIGNMENT);
        panTextEC.setAlignmentX(Component.CENTER_ALIGNMENT);

        panTextEC.add(textzoneEC, BorderLayout.CENTER);

        Box hbox = Box.createHorizontalBox();
        hbox.add(labelimageEC);
        hbox.add(Box.createHorizontalStrut(10));
        hbox.add(btnTarifEC);

        hbox.add(Box.createHorizontalStrut(10));
        hbox.add(panTextEC);

        panTopEC.add(hbox, BorderLayout.CENTER);

        JLabel JNbescalade = new JLabel("Nombre du Personne");

        String[] escalade = {"1", "2", "3", "4", "5", "6"};
        comboNbEC = new JComboBox(escalade);

        JLabel JNbheures = new JLabel("Nombre d'heures");
        String[] heures = {"1", "2", "3", "4", "5"};
        comboHeures = new JComboBox(heures);

//        choix1EC = new JRadioButton("Fin de semaine ou jour de conge");
//        choix2EC = new JRadioButton("Jour de semaine ");
//        ButtonGroup group = new ButtonGroup();
//        group.add(choix1EC);
//        group.add(choix2EC);
        JNbescalade.setAlignmentY(TOP_ALIGNMENT);
        comboNbEC.setAlignmentY(TOP_ALIGNMENT);

        Box thboxC = Box.createHorizontalBox();
        thboxC.add(JNbescalade);
        thboxC.add(Box.createHorizontalStrut(20));
        thboxC.add(comboNbEC);

        Box mhboxC = Box.createHorizontalBox();
        mhboxC.add(JNbheures);
        mhboxC.add(Box.createHorizontalStrut(40));
        mhboxC.add(comboHeures);

        Box lvboxC = Box.createVerticalBox();
        lvboxC.add(thboxC);
        lvboxC.add(Box.createVerticalStrut(10));
        lvboxC.add(mhboxC);

//        Box rvboxC = Box.createVerticalBox();
//        rvboxC.add(choix1EC);
//        rvboxC.add(Box.createVerticalStrut(10));
//        rvboxC.add(choix2EC);
//        Box ghbox = Box.createHorizontalBox();
//        ghbox.add(lvboxC);
//        ghbox.add(Box.createHorizontalStrut(20));
//        ghbox.add(rvboxC);
        panCenterEC.add(lvboxC, BorderLayout.CENTER);

        btnRetourEC = new JButton("Retour a la Page d'accueil");
        btnRetourEC.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourEC.addActionListener(this);

        btnRetourECC = new JButton("Retour a la forme du Canot");
        btnRetourECC.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourECC.addActionListener(this);

        btnRetourECE = new JButton("Retour a la forme d'Equitation");
        btnRetourECE.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourECE.addActionListener(this);

        Box blvbox = Box.createVerticalBox();
        blvbox.add(btnRetourEC);
        blvbox.add(Box.createVerticalStrut(20));
        blvbox.add(btnRetourECC);
        blvbox.add(Box.createVerticalStrut(20));
        blvbox.add(btnRetourECE);

        JLabel JVotreTarifEC = new JLabel("Votre Tarif: ");
        JVotreTarifEC.setFont(new Font("My Boli", Font.ITALIC, 16));
        TextZoneTarifEC = new JTextArea(10, 25);

        JVotreTarifEC.setAlignmentX(Component.LEFT_ALIGNMENT);
        TextZoneTarifEC.setAlignmentX(Component.LEFT_ALIGNMENT);

        Box brvboxC = Box.createVerticalBox();
        brvboxC.add(JVotreTarifEC);
        brvboxC.add(Box.createVerticalStrut(10));
        brvboxC.add(TextZoneTarifEC);

        Box bghbox = Box.createHorizontalBox();

        bghbox.add(blvbox);
        bghbox.add(Box.createHorizontalStrut(250));
        bghbox.add(brvboxC);

        panBottomEC.add(bghbox, BorderLayout.CENTER);

        this.setContentPane(panGlobalEC);
        this.pack();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        if (e.getSource() == btnTarifEC) {
            
            int nbescalade = Integer.parseInt(comboNbEC.getSelectedItem().toString());
            int nbheures = Integer.parseInt(comboHeures.getSelectedItem().toString());
            float tarifEC = 0;
            float tarifECGST = 0;
            float tarifECQST = 0;

            tarifEC = CacluerTarifEC(nbescalade, nbheures);

            tarifECGST = CacluerTaxECGST(tarifEC);
            tarifECQST = CacluerTaxECGST(tarifEC);
            totalEC = tarifEC + tarifECGST + tarifECQST;
            TextZoneTarifEC.setText("Numbre de personne :"+comboNbEC.getSelectedItem()+"\n"+ "Numbre d'heures: "+ comboHeures.getSelectedItem()+"\n"+
                    "Tarfis:  " + String.valueOf(tarifEC) + "\n" + "GST:  " + String.valueOf(tarifECGST) + "\n" + "QST:  " + String.valueOf(tarifECQST) + "\n" + "Total des frais actuels:  " + String.valueOf(totalEC));

        }

        if (e.getSource() == btnRetourEC) {

            dispose();
            MyFrame Window = new MyFrame();

        }

        if (e.getSource() == btnRetourECE) {

            dispose();
            FormEquitation WindowE = new FormEquitation();

        }
        if (e.getSource() == btnRetourECC) {

            dispose();
            Canot WindowEC = new Canot();

        }

    }
    
    public float getTotalEC(){
    
      return totalEC;
    }

    public float CacluerTarifEC(int nbp, int nbh) {
        float somme = 0;

        somme = nbp * nbh * 10;

        return somme;
    }

    public float CacluerTaxECGST(float s) {

        return s * 0.05f;

    }

    public float CacluerTaxECQST(float s) {

        return s * 0.10f;

    }

}

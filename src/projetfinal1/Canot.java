/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinal1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
public class Canot extends JFrame implements ActionListener {

   
    JButton btnTarifC, btnRetourCC, btnRetourCEC, btnRetourCE;
    JComboBox comboNbC, comboNbH;
    JRadioButton choix1C, choix2C;
    JTextArea TextZoneTarifC;
    public static float totalC = 0;

    Canot() {

        this.setSize(800, 500);
        this.setTitle("Forme Canot");

        JPanel panGlobalC = new JPanel(new BorderLayout());

        JPanel panTopC = new JPanel(new BorderLayout());
        panTopC.setBorder(BorderFactory.createEmptyBorder(5, 5, 20, 50));

        JPanel panCenterC = new JPanel();
        panCenterC.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 150));

        JPanel panBottomC = new JPanel();
        panBottomC.setBorder(BorderFactory.createEmptyBorder(80, 5, 80, 5));

        panGlobalC.add(panCenterC, BorderLayout.CENTER);
        panGlobalC.add(panBottomC, BorderLayout.SOUTH);
        panGlobalC.add(panTopC, BorderLayout.NORTH);

        JLabel labelimageC = new JLabel();
        ImageIcon imgC = new ImageIcon("src/images/Canot.jpg");
        labelimageC.setIcon(imgC);


        btnTarifC = new JButton("Tarif pour le Canot");
        btnTarifC.setBackground(Color.PINK);
        btnTarifC.addActionListener(this);

        JPanel panTextC = new JPanel(new BorderLayout());
        panTextC.setBorder(BorderFactory.createEmptyBorder(70,0, 70, 0));
        JTextArea textzoneC = new JTextArea(5, 30);
        textzoneC.setText("                   Tarfis pour le Canot  Ete 2022 \n                                                          Semaine   Fin  de semaine \n  Pour des blocs de deux heures:    $22,35      $29,55 ");
        textzoneC.setBackground(Color.green);
        panTextC.add(textzoneC, BorderLayout.CENTER);

        labelimageC.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnTarifC.setAlignmentX(Component.CENTER_ALIGNMENT);
         panTextC.setAlignmentX(Component.CENTER_ALIGNMENT);

        Box hbox = Box.createHorizontalBox();
        hbox.add(labelimageC);
        hbox.add(Box.createHorizontalStrut(10));
        hbox.add(btnTarifC);

        hbox.add(Box.createHorizontalStrut(10));
        hbox.add(panTextC);

        panTopC.add(hbox, BorderLayout.CENTER);

        JLabel JNbcanot = new JLabel("Nombre du Canot");

        String[] canot = {"1", "2", "3", "4", "5", "6"};
        comboNbC = new JComboBox(canot);
        
        JLabel JNHeures = new JLabel("Nombre d'heures");

        String[] heuresC = {"2", "4", "6"};
        comboNbH = new JComboBox(heuresC);

        choix1C = new JRadioButton("Fin de semaine ou jour de conge");
        choix2C = new JRadioButton("Jour de semaine ");
        ButtonGroup group = new ButtonGroup();
        group.add(choix1C);
        group.add(choix2C);
        
        JNbcanot.setAlignmentY(TOP_ALIGNMENT);
        comboNbC.setAlignmentY(TOP_ALIGNMENT);

        Box thboxC = Box.createHorizontalBox();
        thboxC.add(JNbcanot);
        thboxC.add(Box.createHorizontalStrut(20));
        thboxC.add(comboNbC);
        
         Box mhboxC = Box.createHorizontalBox();
        mhboxC.add(JNHeures);
        mhboxC.add(Box.createHorizontalStrut(20));
        mhboxC.add(comboNbH);
        
         Box lvboxC = Box.createVerticalBox();
        lvboxC.add(thboxC);
        lvboxC.add(Box.createVerticalStrut(10));
        lvboxC.add(mhboxC);

        Box rvboxC = Box.createVerticalBox();
        rvboxC.add(choix1C);
        rvboxC.add(Box.createVerticalStrut(10));
        rvboxC.add(choix2C);

       
        Box ghbox = Box.createHorizontalBox();
        ghbox.add(lvboxC);
        ghbox.add(Box.createHorizontalStrut(20));
        ghbox.add(rvboxC);

        panCenterC.add(ghbox, BorderLayout.CENTER);

        btnRetourCC = new JButton("Retour a la Page d'accueil");
        btnRetourCC.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourCC.addActionListener(this);

        btnRetourCEC = new JButton("Retour a la forme d'Escalade");
        btnRetourCEC.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourCEC.addActionListener(this);

        btnRetourCE = new JButton("Retour a la forme d'Equitation");
        btnRetourCE.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourCE.addActionListener(this);

        Box blvbox = Box.createVerticalBox();
        blvbox.add(btnRetourCC);
        blvbox.add(Box.createVerticalStrut(20));
        blvbox.add(btnRetourCEC);
        blvbox.add(Box.createVerticalStrut(20));
        blvbox.add(btnRetourCE);

        JLabel JVotreTarifC = new JLabel("Votre Tarif: ");
        JVotreTarifC.setFont(new Font("My Boli", Font.ITALIC, 16));
        TextZoneTarifC = new JTextArea(10, 25);

        JVotreTarifC.setAlignmentX(Component.LEFT_ALIGNMENT);
        TextZoneTarifC.setAlignmentX(Component.LEFT_ALIGNMENT);

        Box brvboxC = Box.createVerticalBox();
        brvboxC.add(JVotreTarifC);
        brvboxC.add(Box.createVerticalStrut(10));
        brvboxC.add(TextZoneTarifC);

        Box bghbox = Box.createHorizontalBox();

        bghbox.add(blvbox);
        bghbox.add(Box.createHorizontalStrut(200));
        bghbox.add(brvboxC);

        panBottomC.add(bghbox, BorderLayout.CENTER);

        this.setContentPane(panGlobalC);
        this.pack();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        if (e.getSource() == btnTarifC) {
         
            int nbcanot = Integer.parseInt(comboNbC.getSelectedItem().toString());
            int heuresC = Integer.parseInt(comboNbH.getSelectedItem().toString());
            float tarifC = 0;
            float tarifCGST = 0;
            float tarifCQST = 0;
            String choixC = "";

            if (choix1C.isSelected()) {
                tarifC = CacluerTarifC(nbcanot,heuresC, 1);
                choixC = "Fin de semaine ";
            }

            if (choix2C.isSelected()) {
                tarifC = CacluerTarifC(nbcanot,heuresC, 2);
                choixC = "Jour de semaine ";
            }
            tarifCGST = CacluerTaxCGST(tarifC);
            tarifCQST = CacluerTaxCGST(tarifC);
            totalC = tarifC + tarifCGST + tarifCQST;
            TextZoneTarifC.setText("Numbre de Canot :"+comboNbC.getSelectedItem()+"\n"+ "Numbre d'heures: "+ comboNbH.getSelectedItem()+"\n"+choixC+"\n"+"Tarfis:  " + String.valueOf(tarifC) + "\n" + "GST:  " + String.valueOf(tarifCGST) + "\n" + "QST:  " + String.valueOf(tarifCQST) + "\n" + "Total des frais actuels:  " + String.valueOf(totalC));

        }

        if (e.getSource() == btnRetourCC) {

            dispose();
            MyFrame Window = new MyFrame();

        }

        if (e.getSource() == btnRetourCE) {

            dispose();
            FormEquitation WindowE = new FormEquitation();

        }
        if (e.getSource() == btnRetourCEC) {

            dispose();
            Escalade WindowEC = new Escalade();

        }

    }
    
    public float getTotalC(){
    
      return totalC;
    }

    public float CacluerTarifC(int nbc, int h, int base) {
        float somme = 0;
        if (base == 1) {
            h=h/2;
            somme = 29.55f * nbc;

        }
        if (base == 2) {
            h=h/2;
            somme = 22.35f * nbc;
        }

        return somme;
    }

    public float CacluerTaxCGST(float s) {

        return s * 0.05f;

    }

    public float CacluerTaxCQST(float s) {

        return s * 0.10f;

    }

}


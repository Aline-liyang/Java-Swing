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
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Aline
 */
public class FormEquitation extends JFrame implements ActionListener {

    JTextField textNom, textNb, textJours;
    JButton btnTarifE, btnRetourE, btnRetourEC, btnRetourC;
    JComboBox comboNb, comboNumero;
    JRadioButton choix1, choix2;
    JTextArea TextZoneTarifE;
    public static float totalE = 0;
 
    
    FormEquitation() {

        this.setSize(800, 500);
        this.setTitle("Forme Equitation");

        JPanel panGlobalE = new JPanel(new BorderLayout());

        JPanel panTopE = new JPanel(new BorderLayout());
        panTopE.setBorder(BorderFactory.createEmptyBorder(5, 5, 20, 120));

        JPanel panCenterE = new JPanel();
        panCenterE.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 150));

        JPanel panBottomE = new JPanel();
        panBottomE.setBorder(BorderFactory.createEmptyBorder(80, 5, 80, 5));

        panGlobalE.add(panCenterE, BorderLayout.CENTER);
        panGlobalE.add(panBottomE, BorderLayout.SOUTH);
        panGlobalE.add(panTopE, BorderLayout.NORTH);

        JLabel labelimageE = new JLabel();
        ImageIcon imgE = new ImageIcon("src/images/Equitation3.jpg");
        labelimageE.setIcon(imgE);
//        panTopE.add(labelimageE, BorderLayout.WEST);

        btnTarifE = new JButton("Tarif pour l'equitaion");
        btnTarifE.setBackground(Color.PINK);
        btnTarifE.addActionListener(this);

        JPanel panTextE = new JPanel(new BorderLayout());
        panTextE.setBorder(BorderFactory.createEmptyBorder(70,0, 70, 0));
        JTextArea textzoneE = new JTextArea(7, 25);
        textzoneE.setText("             Tarfis pour l'equitation Ete 2022 \n                         Semaine      Fin  de semaine \n  Parcours 1  :  $15,25      $18,25 \n  Parcours 2  :  $22,75      $25,00 \n  Parcours 3  :  $25,25      $27,75");
        textzoneE.setBackground(Color.green);
        panTextE.add(textzoneE, BorderLayout.CENTER);
        

        labelimageE.setAlignmentY(Component.CENTER_ALIGNMENT);
        btnTarifE.setAlignmentY(Component.CENTER_ALIGNMENT);
        panTextE.setAlignmentY(Component.CENTER_ALIGNMENT);

        Box hbox = Box.createHorizontalBox();
        hbox.add(labelimageE);
        hbox.add(Box.createHorizontalStrut(20));
        hbox.add(btnTarifE);

        hbox.add(Box.createHorizontalStrut(20));
        hbox.add(panTextE);

        panTopE.add(hbox, BorderLayout.CENTER);

        JLabel JNbpersonne = new JLabel("Nombre de personne");
        JLabel JNbparcours = new JLabel("Numero du parcours");

        String[] personne = {"1", "2", "3", "4", "5", "6"};
        comboNb = new JComboBox(personne);

        String[] parcours = {"1", "2", "3"};
        comboNumero = new JComboBox(parcours);

        choix1 = new JRadioButton("Fin de semaine ou jour de conge");
        choix2 = new JRadioButton("Jour de semaine ");
        ButtonGroup group = new ButtonGroup();
        group.add(choix1);
        group.add(choix2);

        Box thbox = Box.createHorizontalBox();
        thbox.add(JNbpersonne);
        thbox.add(Box.createHorizontalStrut(20));
        thbox.add(comboNb);

        Box bhbox = Box.createHorizontalBox();
        bhbox.add(JNbparcours);
        bhbox.add(Box.createHorizontalStrut(20));
        bhbox.add(comboNumero);

        Box lvbox = Box.createVerticalBox();
        lvbox.add(thbox);
        lvbox.add(Box.createVerticalStrut(10));
        lvbox.add(bhbox);

        Box rvbox = Box.createVerticalBox();
        rvbox.add(choix1);
        rvbox.add(Box.createVerticalStrut(10));
        rvbox.add(choix2);

        Box ghbox = Box.createHorizontalBox();

        ghbox.add(lvbox);
        ghbox.add(Box.createHorizontalStrut(20));
        ghbox.add(rvbox);

        panCenterE.add(ghbox, BorderLayout.CENTER);

        btnRetourE = new JButton("Retour a la Page d'accueil");
        btnRetourE.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourE.addActionListener(this);

        btnRetourEC = new JButton("Retour a la forme d'Escalade");
        btnRetourEC.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourEC.addActionListener(this);

        btnRetourC = new JButton("Retour a la forme du Canot");
        btnRetourC.setFont(new Font("My Boli", Font.ITALIC, 12));
        btnRetourC.addActionListener(this);

        Box blvbox = Box.createVerticalBox();
        blvbox.add(btnRetourE);
        blvbox.add(Box.createVerticalStrut(20));
        blvbox.add(btnRetourEC);
        blvbox.add(Box.createVerticalStrut(20));
        blvbox.add(btnRetourC);

        JLabel JVotreTarif = new JLabel("Votre Tarif: ");
        JVotreTarif.setFont(new Font("My Boli", Font.ITALIC, 16));
        TextZoneTarifE = new JTextArea(10, 25);

        JVotreTarif.setAlignmentX(Component.LEFT_ALIGNMENT);
        TextZoneTarifE.setAlignmentX(Component.LEFT_ALIGNMENT);

        Box brvbox = Box.createVerticalBox();
        brvbox.add(JVotreTarif);
        brvbox.add(Box.createVerticalStrut(10));
        brvbox.add(TextZoneTarifE);

        Box bghbox = Box.createHorizontalBox();

        bghbox.add(blvbox);
        bghbox.add(Box.createHorizontalStrut(200));
        bghbox.add(brvbox);

        panBottomE.add(bghbox, BorderLayout.CENTER);

        this.setContentPane(panGlobalE);
        this.pack();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == btnTarifE) {
//            float total = 0;
          int nbpersonneE = Integer.parseInt(comboNb.getSelectedItem().toString());
            int numeroparcours = Integer.parseInt(comboNumero.getSelectedItem().toString());
            float tarifE = 0;
            float tarifEGST = 0;
            float tarifEQST = 0;
            String choix = "";

            if (choix1.isSelected()) {
                tarifE = CacluerTarifE(nbpersonneE, numeroparcours, 1);
                choix = "Fin de semaine ";
            }

            if (choix2.isSelected()) {
                tarifE = CacluerTarifE(nbpersonneE, numeroparcours, 2);
                choix = "Jour de semaine ";
            }
            tarifEGST = CacluerTaxGST(tarifE);
            tarifEQST = CacluerTaxGST(tarifE);
            totalE = tarifE + tarifEGST + tarifEQST;
            TextZoneTarifE.setText("Numbre de personne :" + comboNb.getSelectedItem() + "\n" + "Numero du parcours: " + comboNumero.getSelectedItem() + "\n" + choix + "\n" + "Tarfis:  " + String.valueOf(tarifE) + "\n" + "GST:  " + String.valueOf(tarifEGST) + "\n" + "QST:  " + String.valueOf(tarifEQST) + "\n" + "Total des frais actuels:  " + String.valueOf(totalE));

        }

        if (e.getSource() == btnRetourE) {

            dispose();
            MyFrame Window = new MyFrame();

        }

        if (e.getSource() == btnRetourC) {

            dispose();
            Canot WindowC = new Canot();

        }
        if (e.getSource() == btnRetourEC) {

            dispose();
            Escalade WindowEC = new Escalade();

        }

    }
    
    public float getTotalE(){
    
      return totalE;
    }
    

    public float CacluerTarifE(int nbp, int numerop, int base) {
        float somme = 0;
        if (base == 1) {
            switch (numerop) {
                case 1:
                    somme = 18.25f * nbp;
                    break;
                case 2:
                    somme = 25.00f * nbp;
                    break;
                default:
                    somme = 27.75f * nbp;
                    break;
            }
        }
        if (base == 2) {
            switch (numerop) {
                case 1:
                    somme = 15.25f * nbp;
                    break;
                case 2:
                    somme = 22.75f * nbp;
                    break;
                default:
                    somme = 25.25f * nbp;
                    break;
            }
        }

        return somme;
    }

    public float CacluerTaxGST(float s) {

        return s * 0.05f;

    }

    public float CacluerTaxQST(float s) {

        return s * 0.10f;

    }

}

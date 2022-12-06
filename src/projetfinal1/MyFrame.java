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
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JColorChooser;
import javax.swing.JTextArea;

/**
 *
 * @author Aline
 */
public class MyFrame extends JFrame implements ActionListener {

    JTextField textNom, textJours;
    JButton btnTarif, btnEquitation, btnCanot, btnEscalade;
    JComboBox combo, comboNbS;
    JTextArea TextZoneTarif;
   public  FormEquitation windowE;
    Canot windowC;
    Escalade windowEC;
    public static MyFrame tante;
    float totalS;
    int nbjours, nbpersonneS;

    MyFrame() {

        this.setSize(800, 500);
        this.setTitle("Page d'accueil");

        JPanel panGlobal = new JPanel(new BorderLayout());

        JPanel panTop = new JPanel(new BorderLayout());
        panTop.setBorder(BorderFactory.createEmptyBorder(5, 5, 15, 100));
        panTop.setBackground(Color.GREEN);

        JPanel panBottom = new JPanel();
        panBottom.setBorder(BorderFactory.createEmptyBorder(5, 5, 60, 100));
        panBottom.setBackground(Color.GREEN);

        panGlobal.add(panBottom, BorderLayout.SOUTH);
        panGlobal.add(panTop, BorderLayout.NORTH);

        JPanel panTopleft = new JPanel(new BorderLayout());
        panTopleft.setBorder(BorderFactory.createEmptyBorder(5, 5, 15, 5));

        JLabel labelimage = new JLabel();

        ImageIcon img = new ImageIcon("src/images/logo.jpg");
        labelimage.setIcon(img);
        panTopleft.add(labelimage, BorderLayout.NORTH);
        panTop.add(panTopleft, BorderLayout.WEST);

        JPanel panTopright = new JPanel(new BorderLayout());
        panTopright.setBorder(BorderFactory.createEmptyBorder(0, 10, 15, 10));

        JPanel panInfo1 = new JPanel(new BorderLayout());
        JPanel panInfo2 = new JPanel(new BorderLayout());
        JPanel panInfo3 = new JPanel(new BorderLayout());

        panInfo1.setBackground(Color.green);
        panInfo2.setBackground(Color.green);
        panInfo3.setBackground(Color.green);

        panInfo1.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));
        panInfo2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panInfo3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JLabel labeltitle = new JLabel("Le camping de tante Irma", JLabel.CENTER);

        labeltitle.setOpaque(true);
        labeltitle.setBackground(Color.ORANGE); // show the color of the words
        labeltitle.setFont(new Font("My Boli", Font.BOLD, 26));

        panInfo1.add(labeltitle, BorderLayout.CENTER);
        panTopright.add(panInfo1, BorderLayout.NORTH);

        JTextArea textzone = new JTextArea("            Tarfis de sejour \n  Personne 1     :    $ 23,25  par jour \n  Personne 2     :    $ 20,90  par jour \n  Personne 3     :    $ 18,25 par jour \n  A partir de personne 4     :     $ 16,25 par jour");

        panInfo2.add(textzone, BorderLayout.CENTER);
        panTopright.add(panInfo2, BorderLayout.CENTER);

        JPanel panInfo3top = new JPanel();
        JLabel JNom = new JLabel("Nom");
        JNom.setOpaque(true);
        JNom.setBackground(Color.PINK);
        JNom.setBorder(new EmptyBorder(0, 50, 0, 80));
        textNom = new JTextField(18);
        panInfo3top.add(JNom);
        panInfo3top.add(textNom);

        JPanel panInfo3center = new JPanel();
        JLabel JNb = new JLabel("Nb de personnes");
        JNb.setOpaque(true);
        JNb.setBackground(Color.PINK);
        JNb.setBorder(new EmptyBorder(0, 0, 0, 40));
        String[] personne = {"1", "2", "3", "4", "5", "6"};
        comboNbS = new JComboBox(personne);
        panInfo3center.add(JNb);
        panInfo3center.add(comboNbS);

        JPanel panInfo3bottom = new JPanel();
        JLabel JJours = new JLabel("Nb de jours");
        JJours.setOpaque(true);
        JJours.setBackground(Color.PINK);
        JJours.setBorder(new EmptyBorder(0, 0, 0, 40));
        textJours = new JTextField(18);
        panInfo3bottom.add(JJours);
        panInfo3bottom.add(textJours);

        panInfo3.add(panInfo3top, BorderLayout.NORTH);
        panInfo3.add(panInfo3center, BorderLayout.CENTER);
        panInfo3.add(panInfo3bottom, BorderLayout.SOUTH);

        panInfo3top.setBackground(Color.green);
        panInfo3center.setBackground(Color.green);
        panInfo3bottom.setBackground(Color.green);

        panTopright.add(panInfo3, BorderLayout.SOUTH);
        panTop.add(panTopright, BorderLayout.EAST);

        JPanel panBottomleft = new JPanel(new BorderLayout());
        JPanel panBottomright = new JPanel(new BorderLayout());
        panBottomleft.setBorder(BorderFactory.createEmptyBorder(5, 0, 15, 35));
        panBottomright.setBorder(BorderFactory.createEmptyBorder(0, 10, 15, 10));

        panBottom.add(panBottomleft, BorderLayout.WEST);
        panBottom.add(panBottomright, BorderLayout.EAST);

        JLabel JActivites = new JLabel("Les activites");
        JActivites.setFont(new Font("My Boli", Font.ITALIC, 20));
        JActivites.setOpaque(true);
        JActivites.setBackground(Color.PINK);

        btnTarif = new JButton("$ Tarif $");
        btnTarif.addActionListener(this);

        JLabel JVotreTarifS = new JLabel("Votre Tarif: ");
        JVotreTarifS.setFont(new Font("My Boli", Font.ITALIC, 16));
        TextZoneTarif = new JTextArea(10, 25);

        Box lbhbox = Box.createHorizontalBox();
        lbhbox.add(JVotreTarifS);
        lbhbox.add(Box.createHorizontalStrut(20));
        lbhbox.add(TextZoneTarif);

        Box tvbox1 = Box.createVerticalBox();
//        tvbox1.add(JActivites);
//        
        tvbox1.add(btnTarif);
        tvbox1.add(Box.createVerticalStrut(50));
        tvbox1.add(lbhbox);

        panBottomleft.add(tvbox1);

        btnEquitation = new JButton("Equitation");
        btnEquitation.setBackground(Color.YELLOW);
        btnEquitation.addActionListener(this);

        btnCanot = new JButton("Canot");
        btnCanot.setBackground(Color.YELLOW);
        btnCanot.addActionListener(this);

        btnEscalade = new JButton("Escalade");
        btnEscalade.setBackground(Color.YELLOW);
        btnEscalade.addActionListener(this);

        Box thbox = Box.createHorizontalBox();
        thbox.add(btnEquitation);
        thbox.add(Box.createHorizontalStrut(300));

        Box mhbox = Box.createHorizontalBox();
        mhbox.add(Box.createHorizontalStrut(150));
        mhbox.add(btnCanot);
        mhbox.add(Box.createHorizontalStrut(150));

        Box bhbox = Box.createHorizontalBox();
        bhbox.add(Box.createHorizontalStrut(300));
        bhbox.add(btnEscalade);

        JActivites.setAlignmentX(Component.LEFT_ALIGNMENT);
        thbox.setAlignmentX(Component.LEFT_ALIGNMENT);
        mhbox.setAlignmentX(Component.LEFT_ALIGNMENT);
        bhbox.setAlignmentX(Component.LEFT_ALIGNMENT);

        Box rvbox1 = Box.createVerticalBox();
        rvbox1.add(JActivites);
        rvbox1.add(Box.createVerticalStrut(10));
        rvbox1.add(thbox);
        rvbox1.add(Box.createVerticalStrut(10));
        rvbox1.add(mhbox);
        rvbox1.add(Box.createVerticalStrut(10));
        rvbox1.add(bhbox);

        panBottomright.add(rvbox1);

        panBottomright.setBackground(Color.GREEN);
        panBottomleft.setBackground(Color.GREEN);

        panTopleft.setBackground(Color.GREEN);

        panTopright.setBackground(Color.GREEN);

        this.setContentPane(panGlobal);
        this.pack();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == btnEquitation) {
            windowE = new FormEquitation();
        }

        if (e.getSource() == btnCanot) {
            windowC = new Canot();
        }

        if (e.getSource() == btnEscalade) {
            windowEC = new Escalade();
        }

        if (e.getSource() == btnTarif) {

            nbpersonneS = Integer.parseInt(comboNbS.getSelectedItem().toString());
            nbjours = Integer.parseInt(textJours.getText());
            float tarifS = 0;
            float tarifSGST = 0;
            float tarifSQST = 0;

            tarifS = CacluerTarifS(nbpersonneS, nbjours);

            tarifSGST = CacluerTaxSGST(tarifS);
            tarifSQST = CacluerTaxSGST(tarifS);
            totalS = tarifS + tarifSGST + tarifSQST;

            TextZoneTarif.setText("Numbre de personne :" + comboNbS.getSelectedItem() + "\n"
                    + "Numbre de jours: " + textJours.getText() + "\n" + "Tarfis de sejour:  " + tarifS + "   GST:  " + tarifSGST + "   QST:  " + tarifSQST + "  Total des frais de sejour:  " + totalS + "\n");

        }

    }

    public float getTotalS() {

        return totalS;
    }

    public float CacluerTarifS(int nbp, int nbj) {
        float somme = 0;

        switch (nbp) {
            case 1:
                somme = 23.25f * nbj;
                break;
            case 2:
                somme = 20.90f * nbj;
                break;
            case 3:
                somme = 18.25f * nbj;
                break;
            default:
                somme = 16.25f * nbj;
                break;
        }

        return somme;
    }

    public float CacluerTaxSGST(float s) {

        return s * 0.05f;

    }

    public float CacluerTaxSQST(float s) {

        return s * 0.10f;

    }

}

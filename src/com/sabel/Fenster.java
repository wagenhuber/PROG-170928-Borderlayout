package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private JPanel jPanelNorth;
    private JPanel jPanelSouth;
    private JPanel jPanelWest;
    private JPanel jPanelEast;
    private JPanel jPanelCenter;

    private JLabel labelNorth;
    private JLabel labelSouth;
    private JLabel labelWest;
    private JLabel labelEast;
    private JLabel labelCenter;


    public Fenster() throws HeadlessException {

        super("Borderlayout");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        //this.pack();
        this.initComponents();
        this.setVisible(true);

    }

    private void initComponents() {
        labelNorth = new JLabel();
        labelSouth = new JLabel();
        labelWest = new JLabel();
        labelEast = new JLabel();
        labelCenter = new JLabel();

        labelNorth.setText("North");
        labelSouth.setText("South");
        labelWest.setText("West");
        labelEast.setText("East");
        labelCenter.setText("Center");

        jPanelNorth = new JPanel();
        jPanelWest = new JPanel();
        jPanelCenter = new JPanel();
        jPanelEast = new JPanel();
        jPanelSouth = new JPanel();


        //Hintergrundfarben setzen
        jPanelSouth.setBackground(Color.RED);
        jPanelNorth.setBackground(Color.BLUE);


        //Umrandung setzen
        jPanelCenter.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelNorth.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelSouth.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelWest.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelEast.setBorder(BorderFactory.createLineBorder(Color.black));


        jPanelNorth.add(labelNorth);
        jPanelEast.add(labelEast);
        jPanelCenter.add(labelCenter);
        jPanelWest.add(labelWest);
        jPanelSouth.add(labelSouth);

        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelCenter, BorderLayout.CENTER);
        this.add(jPanelWest, BorderLayout.WEST);
        this.add(jPanelSouth, BorderLayout.SOUTH);
        this.add(jPanelEast, BorderLayout.EAST);

    }


}

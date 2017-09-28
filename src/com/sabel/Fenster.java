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
        this.setSize(800, 800);

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

        jPanelNorth.add(labelNorth);

        jPanelCenter.add(labelCenter);


        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelCenter, BorderLayout.CENTER);


    }


}

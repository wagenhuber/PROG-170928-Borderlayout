package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private JPanel jPanelNorth;
    private JPanel jPanelSouth;
    private JPanel jPanelWest;
    private JPanel jPanelEast;
    private JPanel jPanelCenter;

    private Label labelNorth;
    private Label labelSouth;
    private Label labelWest;
    private Label labelEast;
    private Label labelCenter;


    public Fenster() throws HeadlessException {

        super("Borderlayout");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 800);

        this.initComponents();
        this.setVisible(true);

    }

    private void initComponents() {
        labelNorth = new Label();
        labelSouth = new Label();
        labelWest = new Label();
        labelEast = new Label();
        labelCenter = new Label();

        labelNorth.setText("North");
        labelSouth.setText("South");
        labelWest.setText("West");
        labelEast.setText("East");
        labelCenter.setText("Center");

        jPanelNorth = new JPanel();
        jPanelCenter = new JPanel();

        jPanelNorth.add(labelNorth);
        jPanelCenter.add(labelCenter);


        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelCenter, BorderLayout.CENTER);

    }


}

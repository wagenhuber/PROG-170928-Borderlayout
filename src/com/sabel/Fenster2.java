package com.sabel;

import com.sun.tracing.ProbeName;

import javax.swing.*;
import java.awt.*;

public class Fenster2 extends JFrame {

    private MyJPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JPanel panelCenter2;


    public Fenster2() {
        super("Layoutmanager");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        initkomponents();
        this.setVisible(true);


    }

    private void initkomponents() {
        panelNorth = new MyJPanel("Norden");
        panelSouth = new MyJPanel("Süden");
        panelEast = new MyJPanel("Osten");
        panelWest = new MyJPanel("Westen");
        //panelCenter = new MyJPanel("Zentrum");
        panelCenter2 = new JPanel();
        for (int i = 0; i < 5; i++) {
            panelCenter2.add(new JLabel("Text" + (i + 1)));
        }
        panelCenter2.setLayout(new FlowLayout(FlowLayout.LEFT, 20,20));

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.add(panelEast, BorderLayout.EAST);
        this.add(panelWest, BorderLayout.WEST);
        //this.add(panelCenter); //Ohne Angabe von Borderlayer automatisch in CEnter
        this.add(panelCenter2);


    }
}

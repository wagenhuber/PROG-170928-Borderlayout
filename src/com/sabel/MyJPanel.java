package com.sabel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Random;

public class MyJPanel extends JPanel {

    private JLabel jLabel;


    public MyJPanel(String text) {
        jLabel = new JLabel(text);

        MeinInnererMouseListener miml = new MeinInnererMouseListener();
        this.addMouseListener(miml);

        this.setBorder(new TitledBorder(""));

        this.add(jLabel);


    }

    public class MeinInnererMouseListener extends MouseAdapter {


        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse fährt in das Fenster!");
            Random random = new Random();
            int rgb1 = random.nextInt(255);
            int rgb2 = random.nextInt(255);
            int rgb3 = random.nextInt(255);


            setBackground(new Color(rgb1, rgb2, rgb3));
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            setBackground(new Color(255,255,255));
        }



    }
}





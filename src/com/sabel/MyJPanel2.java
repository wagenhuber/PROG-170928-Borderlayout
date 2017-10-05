package com.sabel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.util.Random;

public class MyJPanel2 extends JPanel {

    private JLabel jLabel;
    private Random random;


    public MyJPanel2(String text) {
        jLabel = new JLabel(text);
        random = new Random();
        initevents();

        this.setBorder(new TitledBorder(""));

        this.add(jLabel);


    }

    private void initevents() {
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Maus rein");
                setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Maus raus");
            }
        });
    }


}





package com.company;

import javax.swing.*;
import java.awt.*;
public class Poll extends JFrame
    {
        public Poll()
        {
            super("Vote for Tami, Brian, or Liz");

            Container c = getContentPane();
            c.setBackground(Color.WHITE);
            PollDisplayPanel chart = new PollDisplayPanel("Tami", "Brian", "Liz");
            PollControlPanel controls = new PollControlPanel(chart);
            c.add(BorderLayout.CENTER, chart);
            c.add(controls, BorderLayout.SOUTH);
        }

        public static void main(String[] args)
        {
            Poll w = new Poll();
            w.setBounds(300, 300, 700, 400);
            w.setDefaultCloseOperation(EXIT_ON_CLOSE);
            w.setVisible(true);
        }
    }



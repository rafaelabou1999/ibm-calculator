package com.example.studygui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import static java.lang.Float.parseFloat;

public class MyIBM extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JTextField tf1;
    JTextField tf2;
    JButton button;

    JButton button2;

    MyIBM() {


        JLabel title = new JLabel("IBM Calculator");
        title.setFont(new Font("Roboto", Font.BOLD, 19));
        title.setSize(400, 400);
        title.setBounds(12, -170, 400, 400);

        tf1 = new JTextField();
        tf2 = new JTextField();

        tf1.setBackground(Color.white);
        tf1.setBounds(72, 55, 90, 20);
        tf2.setBackground(Color.white);
        tf2.setBounds(72, 96, 90, 20);

        JLabel height = new JLabel("Height:");
        JLabel weight = new JLabel("Weight:");

        height.setPreferredSize(new Dimension(100, 100));
        height.setBounds(12, 20, 100, 90);
        height.setFont(new Font("Roboto", Font.BOLD, 16));
        height.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));

        weight.setPreferredSize(new Dimension(100, 100));
        weight.setBounds(12, 55, 100, 90);
        weight.setFont(new Font("Roboto", Font.BOLD, 16));
        weight.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));


        button = new JButton("SUBMIT");
        button.setFont(new Font("Roboto", Font.BOLD, 8));
        button.setBounds(75, 140, 40, 10);
        button.setSize(85, 20);
        button.setFocusable(false);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.addActionListener(buttonListener);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Roboto", Font.BOLD, 8));
        button2.setBounds(75, 170, 40, 10);
        button2.setSize(85, 20);
        button2.setFocusable(false);
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.addActionListener(buttonListener2);

        this.setSize(350, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setForeground(new Color(0x23FF93));
        this.setOpacity(1);
        this.setLayout(null);
        this.setResizable(false);

        this.add(button);
        this.add(button2);
        this.add(tf1);
        this.add(tf2);
        this.add(height);
        this.add(weight);
        this.add(title);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float dataHeight = parseFloat(tf1.getText());
        float dataWeight = parseFloat(tf2.getText());

        float total = dataWeight / (dataHeight * dataHeight);
        button.setText("YOUR IBM IS " + total);
        button.setBackground(Color.white);
        button.setForeground(Color.BLACK);
        button.setBounds(5, 140, 40, 10);
        button.setSize(185, 20);
    }


    ActionListener buttonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            float dataHeight = parseFloat(tf1.getText());
            float dataWeight = parseFloat(tf2.getText());

            float total = dataWeight / (dataHeight * dataHeight);

            button.setText("YOUR IBM IS " + total);
            button.setBackground(Color.white);
            button.setForeground(Color.BLACK);
            button.setBounds(5, 140, 40, 10);
            button.setSize(185, 20);
        }
    };

    ActionListener buttonListener2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tf1.setText("");
            tf2.setText("");
            button.setText("SUBMIT");
            button.setFont(new Font("Roboto", Font.BOLD, 8));
            button.setBounds(75, 140, 40, 10);
            button.setSize(85, 20);
            button.setFocusable(false);
            button.setBackground(Color.black);
            button.setForeground(Color.white);
        }
    };
}

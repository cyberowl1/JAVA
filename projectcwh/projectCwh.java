package com.example.projectcwh;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class projectCwh {
}

class Demo extends JFrame {
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JButton jButton;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    ButtonGroup G1;
    public Demo()
    {
        this.setLayout(null);
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        b1 = new JButton("push");
        b2 = new JButton("pop");
        b3 = new JButton("Add");
        b4 = new JButton("delete");
        G1 = new ButtonGroup();
        jRadioButton1.setText("A) stack");
        jRadioButton2.setText("B) Queue");
        jRadioButton1.setBounds(120, 30, 120, 50);
        jRadioButton2.setBounds(250, 30, 80, 50);
        b1.setBounds(5, 90, 80, 30);
        b2.setBounds(130, 90, 80, 30);
        b3.setBounds(235, 90, 80, 30);
        b4.setBounds(355, 90, 80, 30);

        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String qual = " ";
                if (jRadioButton1.isSelected()) {
                    qual = "stack and push";
                }
                else {
                    qual = "As per the operation undertaken\n stack and push\n stack and pop\n queue and add\n queue and delete";
                }
// MessageDialog to show information selected radion buttons.
                JOptionPane.showMessageDialog(Demo.this, qual);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String qual = " ";
                if (jRadioButton1.isSelected()) {
                    qual = "stack and pop";
                }
                else {
                    qual = "As per the operation undertaken\n stack and push\n stack and pop\n queue and add\n queue and delete";
                }
                JOptionPane.showMessageDialog(Demo.this, qual);

            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String qual = " ";
                if (jRadioButton2.isSelected()) {
                    qual = "Queue and add";
                }
                else {
                    qual = "As per the operation undertaken\n stack and push\n stack and pop\n queue and add\n queue and delete";
                }
                JOptionPane.showMessageDialog(Demo.this, qual);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String qual = " ";
                if (jRadioButton2.isSelected()) {
                    qual = "Queue and delete";
                }
                else {
                    qual = " As per the operation undertaken\n stack and push\n stack and pop\n queue and add\n queue and delete";
                }
                JOptionPane.showMessageDialog(Demo.this, qual);
            }
        });
    }
}
class JavaProjectSem4 {
    public static void main(String args[])
    {
        int min = 1;
        int max = 10;
        System.out.println("The 10 random number are as follows:");
        for(int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random()*(max-min)) + min;
            System.out.println(" "+randomNumber);
            Demo f= new Demo();
            f.setBounds(100, 100, 400, 200);
            f.setTitle("RadioButtons");
            f.setVisible(true);
        }
    }
}

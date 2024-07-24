import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;
public class day12 {
    public static void main(String[] args) {
        // JFrame f1 = new JFrame("Frame 01");
        // JPanel p1 = new JPanel();
        // JLabel l1 = new JLabel("first label");
        // JTextArea t1 = new JTextArea();
        // t1.setBounds(50, 100, 200, 30);
        // JTextArea t2 = new JTextArea();
        // t2.setBounds(50, 100, 200, 30);
        // f1.setSize(200, 300);
        // f1.setLocationRelativeTo(null);
        // p1.setLayout(new FlowLayout());
        // p1.add(l1);
        // p1.add(t1);
        // p1.add(t2);
        // f1.add(p1);
        // f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f1.setVisible(true);

        // JFrame f1 = new JFrame("frame 1");
        // JLabel l1 = new JLabel();
        // JLabel l2 = new JLabel();
        // JButton b1 = new JButton();

        // JPanel p1 = new JPanel();
        // p1.setLayout(new GridLayout(20, 20, 5, 5));


        // JTextField t1 = new JTextField(3);
        // l2.setIcon(new ImageIcon("download(1).jfif"));
        // l1.setIcon(new ImageIcon("yach.png"));
        // p1.add(l1);
        // p1.add(t1);
        // p1.add(l2);
        // f1.add(p1);
        // f1.setLayout(new FlowLayout());
        // f1.setSize(200, 300);
        // f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f1.setVisible(true);

        JFrame f1 = new JFrame("Aien");
        f1.setSize(1000, 600); 
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null); 

        JLabel l1 = new JLabel();
        l1.setIcon(new ImageIcon("download.jfif"));
        l1.setBounds(550, 20, 300, 400); 
        
        JButton b1 = new JButton("Get quotes from Aien");
        b1.setSize(200, 50);
        b1.setIcon(new ImageIcon("yach.png"));
        b1.setBounds(650, 400, 200, 50); 
        
        JLabel l2 = new JLabel();
        l2.setForeground(Color.BLACK);
        l2.setBounds(600, 100, 300, 450); 
        
        p1.add(l1);
        p1.add(b1);
        p1.add(l2);
        
        f1.add(p1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("残念だな。君はもう用済みだ。");
            }
        });

        f1.setVisible(true);

        // Quiz application

    }
}

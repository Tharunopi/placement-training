import java.awt.*;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class quiz_application {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Quizz application");
        JPanel p1 = new JPanel();
        JPanel p2=new JPanel();
        JLabel l1 = new JLabel("Bleach Quiz: Test Your Soul Reaper Knowledge!");
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setBounds(300, 30, 1000, 30);
        p1.setLayout(null);

        JLabel q1 = new JLabel("1. What is the name of the Substitute Soul Reaper protagonist of Bleach?");
        q1.setBounds(100, 150, 9000, 30);
        q1.setFont(new Font("Arial", Font.BOLD, 30));
        ButtonGroup group1 = new ButtonGroup();
        JRadioButton q1o1 = new JRadioButton("A. Ichigo Kurosaki");
        q1o1.setBounds(200, 225, 200, 30);
        JRadioButton q1o2 = new JRadioButton("B. Rukia Kuchiki");
        q1o2.setBounds(400, 225, 200, 30);
        JRadioButton q1o3 = new JRadioButton("C. Renji Abarai");
        q1o3.setBounds(600, 225, 200, 30);
        JRadioButton q1o4 = new JRadioButton("D. Uryu Ishida");
        q1o4.setBounds(800, 225, 200, 30);
        group1.add(q1o1);
        group1.add(q1o2);
        group1.add(q1o3);
        group1.add(q1o4);
        p1.add(q1o1);
        p1.add(q1o2);
        p1.add(q1o3);
        p1.add(q1o4);

        JLabel q2 = new JLabel("2. What is the name of the giant sword wielded by Soul Reapers?");
        q2.setBounds(100, 300, 9000, 30);
        q2.setFont(new Font("Arial", Font.BOLD, 30));
        ButtonGroup group2 = new ButtonGroup();
        JRadioButton q2o1 = new JRadioButton("A. Zanpakuto");
        q2o1.setBounds(200, 375, 200, 30);
        JRadioButton q2o2 = new JRadioButton("B. Shikai");
        q2o2.setBounds(400, 375, 200, 30);
        JRadioButton q2o3 = new JRadioButton("C. Bankai");
        q2o3.setBounds(600, 375, 200, 30);
        JRadioButton q2o4 = new JRadioButton("D. Hollow Mask");
        q2o4.setBounds(800, 375, 200, 30);
        group2.add(q2o1);
        group2.add(q2o2);
        group2.add(q2o3);
        group2.add(q2o4);
        p1.add(q2o1);
        p1.add(q2o2);
        p1.add(q2o3);
        p1.add(q2o4);

        JLabel q3 = new JLabel("3. Who is the head captain of present Goeti 13 ?");
        q3.setBounds(100, 550, 9000, 30);
        q3.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel q4 = new JLabel("4. What are the names of the two main powers a Zanpakuto can manifest?");
        q4.setBounds(100, 750, 9000, 30);
        q4.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel q5 = new JLabel("5. What is the name of the main antagonist of the Soul Society arc?");
        q5.setBounds(100, 950, 9000, 30);
        q5.setFont(new Font("Arial", Font.BOLD, 30));

        p1.add(l1);
        p1.add(q1);
        p1.add(q2);
        p1.add(q3);
        // p1.add(q4);
        p1.add(q5);
        f1.add(p1);
        JScrollPane scrollPane = new JScrollPane(p1);
        scrollPane.setPreferredSize(new Dimension(1000, 1000));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        f1.getContentPane().add(scrollPane);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(1100, 1100);
        f1.setVisible(true);
    }
}

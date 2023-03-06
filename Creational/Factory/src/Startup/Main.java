package Startup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main implements ActionListener {
    JFrame frame;
    JButton button1, button2;
    Main() {
        frame = new JFrame("Startup Builder");
        frame.setSize(150, 150);

        frame.setLayout(new FlowLayout());

        button1 = new JButton("EdTech");
        button2 = new JButton("FinTech");

        frame.add(button1);
        frame.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int choice = 0;
        Object source = actionEvent.getSource();
        if (actionEvent.getSource().equals(button1))
            choice = 1;
        else if (actionEvent.getSource().equals(button2))
            choice = 2;
        Startup company = new StartupBuilder().setDomain(choice);
        JOptionPane.showMessageDialog(null, company.domain());
    }

    public static void main(String[] args) {
        new Main();
    }
}
package MobileShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI implements ActionListener {
    JFrame frame, frame2;
    JLabel label;
    JRadioButton[] jRadioButtons;
    int distinctPhones = PhoneType.values().length;
    void initGUI() {
        frame = new JFrame("Mobile Shop");
        frame.setLayout(new GridLayout(distinctPhones+2, 1));
//        frame.setLayout(null);
        frame.setSize(250, 150);

        label = new JLabel("Choose your mobile phone");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        jRadioButtons = new JRadioButton[distinctPhones];
        for(int i = 0; i < distinctPhones; ++i) {
            jRadioButtons[i] = new JRadioButton(PhoneType.values()[i].name());
            jRadioButtons[i].addActionListener(this);
            frame.add(jRadioButtons[i]);
        }

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ClientGUI().initGUI();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        frame2 = new JFrame();
        frame2.setLayout(new GridLayout(2, 1));
        for(int i = 0; i < distinctPhones; ++i) {
            if(jRadioButtons[i].isSelected()) {
                frame2.add(new JLabel(new Shopkeeper().getDetails(PhoneType.values()[i])[0]));
                frame2.add(new JLabel(new Shopkeeper().getDetails(PhoneType.values()[i])[1]));

                frame2.setVisible(true);
            }
        }
    }
}

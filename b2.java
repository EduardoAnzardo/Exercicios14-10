package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import javax.swing.*;

public class b2 implements ActionListener {

    private JTextField t2;

    public b2(JTextField t2) {
        this.t2 = t2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double temp = Double.parseDouble(t2.getText());
        double kelvin;

        kelvin = (temp + 273.15);


        JOptionPane.showMessageDialog(null, "A temperatura convertida é de : " +kelvin );
    }
}

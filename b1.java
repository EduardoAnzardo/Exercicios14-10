package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import javax.swing.*;

public class b1 implements ActionListener {

    private JTextField t;

    public b1(JTextField t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double temp = Double.parseDouble(t.getText());
        double fahrenheit;

        fahrenheit = (temp * 9 / 5) + 32;


        JOptionPane.showMessageDialog(null, "A temperatura convertida é de : " +fahrenheit );
    }
}


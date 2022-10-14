package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import javax.swing.*;

public class b3 implements ActionListener {

    private JTextField t3;

    public b3(JTextField t3) {
        this.t3 = t3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double temp = Double.parseDouble(t3.getText());
        double resultado;

        resultado = 273.5 + ((temp - 32.0) * (5.0/9.0));


        JOptionPane.showMessageDialog(null, "A temperatura convertida é de : " +resultado );
    }
}

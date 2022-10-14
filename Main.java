package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

        public class Main {

            public static void main(String[] args) {
                JFrame f = new JFrame();
                f.setTitle("Conversor de Temperaturas");
                f.setSize(300, 200);
                f.setLocation(500, 300);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel p = new JPanel();

                JLabel l = new JLabel("Celsius para Fahrenheit");
                p.add(l);

                JTextField t = new JTextField(10);
                p.add(t);

                JButton b1 = new JButton("OK1");
                b1 botao1 = new b1(t);
                b1.addActionListener(botao1);
                p.add(b1);



                JLabel l2 = new JLabel("Celsius para Kelvin");
                p.add(l2);

                JTextField t2 = new JTextField(10);
                p.add(t2);

                JButton b2 = new JButton("OK2");
                b2 botao2 = new b2(t2);
                b2.addActionListener(botao2);
                p.add(b2);


                JLabel l3 = new JLabel("Fahrenheit para Kelvin");
                p.add(l3);

                JTextField t3 = new JTextField(10);
                p.add(t3);

                JButton b3 = new JButton("OK3");
                b3 botao3 = new b3(t3);
                b3.addActionListener(botao3);
                p.add(b3);



                f.add(p);
                f.setVisible(true);
            }

        }

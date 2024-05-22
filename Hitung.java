/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author L E N O V O
 */
    
public class Hitung extends JFrame implements ActionListener {

    private JTextField side1Field;
    private JTextField side2Field;
    private JTextField side3Field;
    private JTextField side4Field;
    private JButton calculateButton;

    public Hitung() {
        setTitle("sistem manajemen perpustakaan");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel side1Label = new JLabel("judul buku:");
        side1Field = new JTextField();
        JLabel side2Label = new JLabel("penulis:");
        side2Field = new JTextField();
        JLabel side3Label = new JLabel("rating:");
        side2Field = new JTextField();
        JLabel side4Label = new JLabel("harga pinjam:");
        side2Field = new JTextField();

        calculateButton = new JButton("tambah");
        calculateButton.addActionListener(this);

        panel.add(side1Label);
        panel.add(side1Field);
        panel.add(side2Label);
        panel.add(side2Field);
        panel.add(new JLabel()); // Spacing
        panel.add(calculateButton);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double side1 = Double.parseDouble(side1Field.getText());
                double side2 = Double.parseDouble(side2Field.getText());
                double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
                JOptionPane.showMessageDialog(this, "Panjang sisi miring adalah: " + hypotenuse);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Hitung();
    }
}

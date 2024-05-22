   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author L E N O V O
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */

    public class ScreenMenu extends JFrame implements ActionListener {

    private JButton Login;
    private JButton HitungSiku;
    private JButton Exit;
    
    public ScreenMenu(){
        setTitle("perpustakaan | 123220035");
        setSize(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        Login = new JButton("Login");
        HitungSiku = new JButton("Hitung");
        Exit = new JButton("Exit");
        
        Login.addActionListener(this);
        HitungSiku.addActionListener(this);
        Exit.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(Login);
        panel.add(HitungSiku);
        panel.add(Exit);
        add(panel);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == HitungSiku){
            new LoginMenu();
        } else if (e.getSource() == Login){
            new Hitung();
        } else if (e.getSource() == Exit){
            System.exit(0);
           }
       }
    }
}
   

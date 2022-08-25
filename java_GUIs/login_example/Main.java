import java.awt.Font;
import java.awt.event.*;  
import java.awt.*;
import javax.swing.*;   
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        JTextField usr  = new JTextField(100);
        JTextField pass = new JTextField(100);
        JLabel username = new JLabel("Username: ");
        JLabel password = new JLabel("Password: "); 
        
        username.setBounds(50, 50 , 100 ,100);
        usr.setBounds(150 ,50, 100, 50);

        password.setBounds(50, 200, 100, 100);
        pass.setBounds(150, 200 ,100, 50);

        pass.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                String username = usr.getText();
                String password  = pass.getText();                         
                if (username.equals("admin") && password.equals("123"))
                    JOptionPane.showMessageDialog(null, "login successfull");
                else 
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
            }  
            });  
        
        frame.add(usr);
        frame.add(pass);
        frame.add(username);
        frame.add(password);


        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
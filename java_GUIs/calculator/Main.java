import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel lbl1 = new JLabel("First number");
        JLabel lbl2 = new JLabel("Second number");
        JLabel lbl3 = new JLabel("Output");
        JTextField first = new JTextField();
        JTextField second = new JTextField();
        JTextArea output = new JTextArea();

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton product = new JButton("*");
        JButton division = new JButton("/");

        lbl1.setBounds(100, 0, 150 ,50 );
        first.setBounds(100, 50, 100 ,30 );

        lbl2.setBounds(100, 70, 150, 50);
        second.setBounds(100, 100, 100, 30);
        
        lbl3.setBounds(100, 120, 150, 50);
        output.setBounds(100 ,150 , 100, 30);

        plus.setBounds(100, 200, 50, 50);
        minus.setBounds(150, 200, 50, 50);
        
        product.setBounds(100, 250, 50, 50);
        division.setBounds(150, 250, 50, 50);
        
        
        plus.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                Double x = Double.parseDouble(first.getText());
                Double y = Double.parseDouble(second.getText());
                output.setText(Double.toString(x+y));
            }
        });

        minus.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                Double x = Double.parseDouble(first.getText());
                Double y = Double.parseDouble(second.getText());
                output.setText(Double.toString(x-y));
            }
        });


        product.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                Double x = Double.parseDouble(first.getText());
                Double y = Double.parseDouble(second.getText());
                output.setText(Double.toString(x*y));
            }
        });


        division.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                Double x = Double.parseDouble(first.getText());
                Double y = Double.parseDouble(second.getText());
                output.setText(Double.toString(x/y));
            }
        });



        
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(first);
        frame.add(second);
        frame.add(output);
                
        frame.add(plus);
        frame.add(minus);
        frame.add(product);
        frame.add(division);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);       
    }
}
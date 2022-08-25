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
        
        JLabel lbl1 = new JLabel("word count");
        JLabel lbl2 = new JLabel("Letter count");
        JButton btn = new JButton("Submit");
        JTextField paragraph  = new JTextField(1000);
        
        paragraph.setBounds(0 , 110, 500, 200);
        lbl1.setBounds(0, 10 , 150, 150);
        lbl2.setBounds(110, 10 , 150, 150);
        btn.setBounds(100, 300, 100 ,100);

        btn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                int word_count =0;
                int letter_count = 0;
                String txt = paragraph.getText();
                for (int i =0 ;i < txt.length(); i++)
                {
                    if ( txt.charAt(i) == ' ')
                        word_count++;
                    else
                        letter_count++;
                }
                word_count++;
                lbl1.setText("Word count "+word_count);
                lbl2.setText("Letter count "+letter_count);
        
            }  
            });  



        
        frame.add(paragraph);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(btn);
        

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

        
    }
}
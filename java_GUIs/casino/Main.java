import java.awt.Font;
import java.awt.event.*;  
import java.awt.*;
import javax.swing.*;   
import java.lang.Math;
import java.lang.*;


public class Main
{
    private static int streak = 0;
    private static String[] fruits = {"apple","orange", "bannana"};
    private static String answer = fruits[Main.rand(3,0)];
    public static int rand(int range , int min )
    {
        int x = (int)(Math.random() * range) + min;
        return x;
    }
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon1 = new ImageIcon("/home/dev/Desktop/java_GUIs/casino/Orange.png");
        ImageIcon icon2 = new ImageIcon("/home/dev/Desktop/java_GUIs/casino/Banana1.png");
        ImageIcon icon3 = new ImageIcon("/home/dev/Desktop/java_GUIs/casino/apple.png");
        
        JLabel  lbl  = new JLabel( answer );
        JLabel score = new JLabel("Your score is ");
        JButton btn1 = new JButton(icon1);
        JButton btn2 = new JButton(icon2);
        JButton btn3 = new JButton(icon3);
        JButton btn4 = new JButton("Play again");

        btn1.setBounds(0 , 100 , 100, 100 );
        btn2.setBounds(100 , 100 , 100, 100);
        btn3.setBounds(200 , 100 , 100, 100);
        btn4.setBounds(300 , 100 , 150, 100);
        lbl.setBounds(200, 0, 100, 100);
        score.setBounds(0, 0 , 150 ,150 );

        btn1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                if (answer == "orange")
                {
                    streak++;
                    answer = fruits[Main.rand(3,0)];
                    lbl.setText(answer);
                    score.setText("Your score is "+streak);
                }
                else 
                {
                    streak=0;
                    answer = fruits[Main.rand(3,0)];
                    lbl.setText(answer);
                    score.setText("Your score is "+streak);
                }   
            }  
            });

        btn2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.out.println(answer);
                if (answer == "bannana")
                {
                    streak++;
                    answer = fruits[Main.rand(3,0)];
                    lbl.setText(answer);
                    score.setText("Your score is "+streak);
                }
                else
                {
                    streak = 0;
                    answer = fruits[Main.rand(3,0)];
                    lbl.setText(answer);
                    score.setText("Your score is "+streak);
                }
            }  
            }); 

        btn3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.out.println(answer);
                if (answer == "apple")
                {
                    streak++;
                    answer = fruits[Main.rand(3,0)];
                    lbl.setText(answer);
                    score.setText("Your score is "+streak);
                }
                else 
                {
                    streak = 0;
                    answer = fruits[Main.rand(3,0)];
                    lbl.setText(answer);
                    score.setText("Your score is "+streak);
                }
            }  
            });  

        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                streak =0;
                score.setText("Your socre is "+streak);
            }
        });

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);   
        frame.add(lbl);         
        frame.add(score);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);        
    }
}
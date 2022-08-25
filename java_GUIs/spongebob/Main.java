import javax.swing.*;
import java.awt.event.*;


public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon = new  ImageIcon("/home/dev/Desktop/java_GUIs/spongebob/happy.png");
        JButton sponge = new JButton(icon);
        sponge.setBounds(155, 100,290 , 400);        
        sponge.addMouseListener(new MouseAdapter() 
        {
            public void mousePressed(MouseEvent me)
            {
                sponge.setIcon(new ImageIcon("/home/dev/Desktop/java_GUIs/spongebob/mad.png"));
            }   
            public void mouseExited(MouseEvent me)
            {
                sponge.setIcon(new ImageIcon("/home/dev/Desktop/java_GUIs/spongebob/sad.png"));
            }
            public void mouseEntered(MouseEvent me) 
            {
                sponge.setIcon(new ImageIcon("/home/dev/Desktop/java_GUIs/spongebob/happy.png"));
            }
        });         
        frame.add(sponge);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);       
    }
}
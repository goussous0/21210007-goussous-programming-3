package tetris;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;


public class Straight extends Polyomino
{

    public Straight(int l)
    {
        super.set_l(l);
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        

        g2.setColor(Color.magenta);
        g2.fillRect(0, 0, get_l()*4, get_l());
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g2.drawRect(0, 0, get_l()*4, get_l());
        
    }

    public void setBounds(int x , int y)
    {
        this.setBounds(x,y , 80 ,20);
    }
}
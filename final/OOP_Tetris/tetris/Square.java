package tetris;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;


public class Square extends Polyomino
{
    public Square(int l)
    {
        super.set_l(l);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);

        g2.setColor(Color.red);
        g2.fillRect(0,0, get_l()*2, get_l()*2);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g2.drawRect(0,0, get_l()*2, get_l()*2);
    }


    public void setBounds(int x , int y)
    {
        this.setBounds(x,y , 40 ,40);
    }
}
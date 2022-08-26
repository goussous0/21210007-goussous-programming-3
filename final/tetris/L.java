package tetris;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;


public class L extends Polyomino
{
    public L(int l)
    {
        super.set_l(l);
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);

        g2.setColor(Color.orange);
        g2.fillRect(0 ,0 , get_l(), get_l());
        g2.fillRect(0, get_l(), get_l(), get_l());
        g2.fillRect(0, get_l()+get_l(), get_l()+get_l(), get_l());
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(0,0 , get_l() , 0);
        g2.drawLine(0,0, 0, get_l()*3);
        g2.drawLine(0, get_l()*3, get_l()*2, get_l()*3);
        g2.drawLine(get_l()*2, get_l()*3, get_l()*2, get_l()*2);
        g2.drawLine(get_l(),get_l()*2,get_l()*2,get_l()*2);
        g2.drawLine(get_l(), 0, get_l(), get_l()*2);
        
    }

    public void setBounds(int x , int y)
    {
        this.setBounds(x,y , 40 ,60);
    }

}
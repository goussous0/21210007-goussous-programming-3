package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Polyomino extends JComponent // is a geometric shape composed of four squares,
{
    private int l; // length of square side
    private int x; // x location 
    private int y; // y location 
    private boolean still = false;

    public void set_l(int l)
    {
        this.l = l;
    }
    public int get_l()
    {
        return this.l;
    }

    public void set_x(int x)
    {
        this.x = x;
    }
    public int get_x()
    {
        return this.x;
    }

    public void set_y(int y)
    {
        this.y = y;
    }
    public int get_y()
    {
        return this.y;
    }
    public void paintComponant(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        g2.setColor(Color.red);
    }

    public void set_still(boolean still)
    {
        this.still = still;
    }
    public boolean get_still()
    {
        return this.still;
    }
    public void setBounds(int x , int y)
    {
        this.setBounds(x, y, 20, 20);
    }
}


/*
https://stackoverflow.com/questions/10876491/how-to-use-keylistener
https://stackoverflow.com/questions/21964768/simple-java-2d-graphics-draw-a-rectangle
https://en.wikipedia.org/wiki/Tetromino 
https://stackoverflow.com/questions/12335121/initializing-a-graphics-variable
https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyListener.html
https://stackoverflow.com/questions/4219511/draw-rectangle-border-thickness
https://stackoverflow.com/questions/32683331/can-multiple-colors-be-used-on-items-in-a-single-jframe
https://www.delftstack.com/howto/java/java-paintcomponent/
https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
https://stackoverflow.com/questions/10876491/how-to-use-keylistener
https://softwareengineering.stackexchange.com/questions/254618/java-how-can-i-make-the-return-type-of-an-inherited-method-in-a-subclass-the
https://stackoverflow.com/questions/12335121/initializing-a-graphics-variable
https://www.codejava.net/java-se/graphics/drawing-lines-examples-with-graphics2d
https://stackoverflow.com/questions/13497289/how-to-initialize-graphics-g
https://stackoverflow.com/questions/21964768/simple-java-2d-graphics-draw-a-rectangle
https://stackoverflow.com/questions/9713432/drawing-simple-rectangles-on-a-jframe-in-java
*/
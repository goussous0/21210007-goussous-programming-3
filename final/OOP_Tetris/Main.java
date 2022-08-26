import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import tetris.*;
import javax.swing.Timer; // https://stackoverflow.com/questions/15061592/

public class Main
{
    static int x =0, y=0, r=0 ;
    static int x2,y2;
    static int bed_rock = 800;
    static Straight straight = null;
    static Square square = null;
    static T t = null;
    static L l = null;
    static S s = null;

    // array lists to keep track of how many shapes created of each kind
    static ArrayList<Straight> straights = new ArrayList<Straight>();
    static ArrayList<Square> squares = new ArrayList<Square>();
    static ArrayList<T> ts = new ArrayList<T>();
    static ArrayList<L> ls = new ArrayList<L>();
    static ArrayList<S> ss = new ArrayList<S>();
    
    // following functions are used to generate shapes randomly 
    public static Straight generate_straight()
    {
        Straight shape = new Straight(20);
        return shape;
    }
    public static Square generate_square()
    {
        Square shape = new Square(20);
        return shape;
    }
    public static L generate_l()
    {
        L shape = new L(20);
        return shape;
    }
    public static T generate_t()
    {
        T shape = new T(20);
        return shape;
    }
    public static S generate_s()
    {
        S shape = new S(20);
        return shape;
    }


    public static int get_shape() // generates a random value between 1 and 4 
    {
        int x =  (new Random().nextInt())%10;
        while (x < 0 || x > 4)
        {
            x = (new Random().nextInt())%10;
        }
        return x;
    }

    public static int calculate_height(int x1, int x2) // finds the highest point in that range
    {
        // loops over all the arraylist to find the highest point on the frame 
        int height =0;
        int tmp_x;
        for ( int i =0; i <straights.size();i++)
        {
            tmp_x = straights.get(i).get_x();
            if (  tmp_x >= x1 && tmp_x <=x2 )
            {
                height += straights.get(i).get_l();   
            }
        }

        for ( int i =0; i <squares.size();i++)
        {
            tmp_x = squares.get(i).get_x();
            if (  tmp_x >= x1 && tmp_x <= x2 )
            {
                height += squares.get(i).get_l()*2;
            }
        }
        for ( int i =0; i <ls.size();i++)
        {
            tmp_x = ls.get(i).get_x();
            if (  tmp_x >= x1 && tmp_x <= x2  )
            {
               height += ls.get(i).get_l()*3;
            }
        }
        for ( int i =0; i <ts.size();i++)
        {
            tmp_x = ts.get(i).get_x();
            if (  tmp_x >= x1 && tmp_x <= x2 )
            {
                height += ts.get(i).get_l()*2;
            }
        }
        for ( int i =0; i <ss.size();i++)
        {
            tmp_x = ss.get(i).get_x();
            
            if (  tmp_x >= x1 && tmp_x <=x2 )
            {
                
                height += ss.get(i).get_l()*2;
            }
        }
        //System.out.println("Height = "+height);
        return height;
    }

    public static void main(String[] args)
    {    
        
        int delay = 300; // milliseconds
        JFrame frame = new JFrame();
        frame.setTitle("Тетрис");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) 
                {
                    // move shape to the left by subtracting from  the x coordinate
                    if (x > 0)
                    {
                        x-= 20;
                    }
                }
                if (key == KeyEvent.VK_RIGHT) {
                    // move shape to the right by adding to the x coordinate
                    if (x < 900)
                    {
                        x+=20;
                    }                    
                }
            }
        });

        System.out.println("Output number: "+get_shape());
  
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int offset;
                // update the screen
                if (y < bed_rock)    
                {
                    y += 20;
                }
                
                //System.out.println("Count of straights "+ straights.size());
                //System.out.println("Count of squares "+squares.size());
                //System.out.println("Count of Ls "+ ls.size());
                //System.out.println("Count of Ss "+ ss.size());
                //System.out.println("Count of Ts "+ ts.size());
                //System.out.println("X: "+x2+" Y: "+y);

                if (!straights.isEmpty() && !straights.get(straights.size()-1).get_still())
                {   
                    // this element is being moved 
                    straight = straights.get(straights.size()-1);
                    if (straight.get_y() == y)
                    {
                        offset = calculate_height(x, x+60);
                        straight.set_x(x);
                        straight.set_y(y-offset);
                        straight.set_still(true);
                        straight.setBounds(x,y-offset);
                        x=0;y=0;
                    }
                    else
                    {
                        straight.set_x(x);
                        straight.set_y(y);
                        straight.setBounds(x,y);
                    }
                }
                else if (!squares.isEmpty() && !squares.get(squares.size()-1).get_still())
                {
                    // this element is being moved
                    square = squares.get(squares.size()-1);
                    if (square.get_y() == y)
                    {
                        offset = calculate_height(x, x+40);
                        square.set_x(x);
                        square.set_y(y-offset);
                        square.set_still(true);
                        square.setBounds(x,y-offset); // offset the square
                        x=0;y=0;
                    }
                    else
                    {
                        square.set_x(x);
                        square.set_y(y);
                        square.setBounds(x,y);
                    }
                }
                else if (!ls.isEmpty() && !ls.get(ls.size()-1).get_still())
                {
                    // this element is being moved 
                    l = ls.get(ls.size()-1);
                    if (l.get_y() == y)
                    {
                        offset = calculate_height(x, x+39);
                        l.set_x(x);
                        l.set_y(y-offset);
                        l.set_still(true);
                        l.setBounds(x,y-offset);
                        x=0;y=0;
                    }
                    else
                    {
                        l.set_x(x);
                        l.set_y(y);
                        l.setBounds(x,y);
                    }
                }
                else if (!ss.isEmpty() && !ss.get(ss.size()-1).get_still())
                {
                    // this element is being moved 
                    s = ss.get(ss.size()-1);
                    if (s.get_y() == y)
                    {
                        offset = calculate_height(x, x+60);
                        s.set_x(x);
                        s.set_y(y-offset);
                        s.set_still(true);
                        s.setBounds(x,y-offset);
                        x=0;y=0;
                    }
                    else
                    {
                        s.set_x(x);
                        s.set_y(y);
                        s.setBounds(x,y);
                    }
                }
                else if (!ts.isEmpty() && !ts.get(ts.size()-1).get_still())
                {
                    // this element is being moved
                    t = ts.get(ts.size()-1);
                    if (t.get_y() == y)
                    {
                        offset = calculate_height(x, x+60);
                        t.set_x(x);
                        t.set_y(y-offset);
                        t.set_still(true);
                        t.setBounds(x,y-offset);
                        x=0;y=0;
                    }
                    else
                    {
                        t.set_x(x);
                        t.set_y(y);
                        t.setBounds(x,y);
                    }
                }
                else
                {
                    r = get_shape();
                    System.out.println("Random number "+r);
                    // no item is being moved generate a new shape
                    switch(r)
                    {
                        case 0: // Straight
                        {
                            straight = generate_straight();
                            straights.add(straight);
                            frame.add(straight);
                        }
                        break;
                        case 1: // Square
                        {
                            square = generate_square();
                            squares.add(square);
                            frame.add(square);
                        }
                        break;
                        case 2: // T
                        {
                            t = generate_t();
                            ts.add(t);
                            frame.add(t);
                        }
                        break;
                        case 3: // L
                        {
                            l = generate_l();
                            ls.add(l);
                            frame.add(l);
                        }
                        break;
                        case 4: // S 
                        {
                            s = generate_s();
                            ss.add(s);
                            frame.add(s);
                        }
                        break;
                    }
                }
            }
        };
        new Timer(delay, taskPerformer).start();



        frame.setLayout(null);  
        //frame.add(item);
        //frame.pack();
        frame.setSize(1000,1000);
        frame.setVisible(true);



    }
}



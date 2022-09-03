import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


public class Main
{
    static int delay = 1000;
    static int default_x = 239;
    static int default_y;
    static boolean coin = false;
    static int place = 0;
    static int score = 0;

    public static int random_number()
    {
        int x = new Random().nextInt()%10;
        while ( x< 0 || x >2 )
        {
            x = new Random().nextInt()%10;
        }
        return x;
    }

    public static void main(String[] args)
    {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Racer");
        Icon road = new ImageIcon("/home/dev/Desktop/3_types/event_driven/nfs/road.gif");
        JLabel small_coin = new JLabel(new ImageIcon("/home/dev/Desktop/3_types/event_driven/nfs/40coin.gif"));
        JLabel medium_coin = new JLabel(new ImageIcon("/home/dev/Desktop/3_types/event_driven/nfs/50coin.gif"));
        JLabel large_coin = new JLabel(new ImageIcon("/home/dev/Desktop/3_types/event_driven/nfs/60coin.gif"));
        JLabel car = new JLabel(new ImageIcon("/home/dev/Desktop/3_types/event_driven/nfs/car.png"));
        JLabel bg = new JLabel(road);
        JLabel score_text = new JLabel();

        bg.add(car);
        bg.add(score_text);
        bg.setBounds(0,0,600,600);
        score_text.setBounds(200, 50 , 200 ,100 );
        car.setBounds(default_x, 400, 128, 120);

        frame.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    if (default_x > 40)
                    {
                        default_x -= 220;
                        car.setBounds(default_x, 400, 128, 120);
                    }
                }
                if (key == KeyEvent.VK_RIGHT)
                {
                    if (default_x < 400)
                    {
                        default_x += 220;
                        car.setBounds(default_x, 400, 128, 120);
                    }
                }
            }
        });
        
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) 
            {
                if (coin) // a coin is on screen either update place or check if user collected coin
                {
                    if (small_coin.isVisible())
                    {
                        default_y = 275;
                        bg.remove(small_coin);
                        bg.add(medium_coin);
                        if (place == 0 )
                            medium_coin.setBounds(190, 275, 50, 50);
                        else if (place == 1 )
                            medium_coin.setBounds(275, 275, 50, 50);                        
                        else if (place == 2 )
                            medium_coin.setBounds(360, 275, 50, 50);    
                    }
                    
                    if (medium_coin.isVisible())
                    {
                        default_y= 350;
                        bg.remove(medium_coin);
                        bg.add(large_coin);
                        if (place == 0 )
                            large_coin.setBounds(110, 350, 60, 60);
                        else if (place == 1 )
                            large_coin.setBounds(270, 350, 60, 60);                        
                        else if (place == 2 )
                            large_coin.setBounds(450, 350, 60, 60);   
                        
                    }
                    if ( default_x < 200 && place  == 0  && default_y == 350) // car and coin are on the far left
                    {
                        bg.remove(large_coin);
                        score++;
                        score_text.setText("Collected Coins: "+score);
                        coin = false;
                    }
                    else if (default_x > 200 && default_x < 450 && place == 1 && default_y == 350) // car and coin are in the middle
                    {
                        bg.remove(large_coin);
                        score++;
                        score_text.setText("Collected Coins: "+score);
                        coin = false;
                    }
                    else if (default_x > 450 && place == 2 && default_y == 350) // coin and car are on the far right
                    {
                        bg.remove(large_coin);
                        score++;
                        score_text.setText("Collected Coins: "+score);
                        coin = false;
                    }
                    else
                    {
                        bg.remove(large_coin);
                        score--;
                        score_text.setText("Collected Coins: "+score);
                        coin = false;
                    }
                    
                    if (score < 0)
                    {
                        JOptionPane.showMessageDialog(null, "Lost all money", "Game Over",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    
                
                }
                else // no coin found add coin to the top of the street
                {
                    place = random_number();
                    bg.add(small_coin);
                    default_y =  225;
                    if (place == 0 )
                        small_coin.setBounds(240, 225, 40, 40);
                    else if (place == 1)
                        small_coin.setBounds(280, 225, 40, 40);
                    else if (place == 2)
                        small_coin.setBounds(320, 225, 40, 40);

                    coin = true;
                }
                System.out.println("collected coins: "+score);
            }
        };
        
        new Timer(delay, taskPerformer).start();
        
        frame.add(bg);
        
        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
/*
 200 550 
*/
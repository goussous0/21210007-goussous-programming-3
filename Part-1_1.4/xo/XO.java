package xo;

import java.util.Scanner;  

public class XO
{
    private int slots = 9;
    private int[][] matrix = {{-1,-1,-1},
                              {-1,-1,-1},
                              {-1,-1,-1}};
    public XO(){}
    static Scanner stdin = new Scanner(System.in);

    public void set_slot(int x, int y, int symbol){matrix[x][y] = symbol; slots--;}
    public int get_slots(){return slots;}
    public int get_slot(int x, int y){System.out.println(matrix[x][y]); return matrix[x][y];}
    

    public void view_matrix()
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if ( matrix[i][j] == 1)
                    System.out.print("X ");
                else if (matrix[i][j] == 0)
                    System.out.print("O ");
                else
                    System.out.print("_ ");
            }
            System.out.println("");
        }   
    }
    public static int[]  grab_coordinates()
    {
        int[] nums = {-1,-1};
        while (nums[0] < 0 || nums[1] < 0 || nums[0] > 2 || nums[1] > 2) 
        {
            System.out.println("Enter coordinates X Y  separated by space");
            if (stdin.hasNext())
                nums[0] = stdin.nextInt();
            if (stdin.hasNext())
                nums[1] = stdin.nextInt();       
            //System.out.println(nums[0] +" <-> "+nums[1]);    
        }
        return nums;
    }

    // runs the game for one round only 
    public void round()
    {
        int[] arr = new int[2];
        while (slots > 0 ) 
        {
            System.out.print("\033[H\033[2J");
            view_matrix();
            System.out.println("First player");
            do 
            {
                // take player 1 input 
                arr = XO.grab_coordinates();
            }
            while ( get_slot(arr[0], arr[1]) != -1);
            set_slot(arr[0],arr[1],1);
            
            view_matrix();
            System.out.println("Second player");
            do 
            {
                // take player 2 input 
                arr = XO.grab_coordinates();
            }
            while ( get_slot(arr[0], arr[1]) != -1);
            set_slot(arr[0],arr[1],0);
            
            // check for winners 
            if (check() == 1)
            {
                System.out.println("First player won");
                return;
            }
            else if (check() == 2)
            {
                System.out.println("Second player won");
                return;
            }
        }   
        // check for winners 
        if (check() == 1)
        {
            System.out.println("First player won");
            return;
        }
        else if (check() == 2)
        {
            System.out.println("Second player won");
            return;
        }
        else 
        {
            System.out.println("Tie");
            return;
        }
    }

    public int check()
    {
        // check right diagonal 
        if (matrix[0][0] == 0 && matrix[1][1] == 0 && matrix[2][2] == 0)
            return 1;
        if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1)
            return 2;

        // check left diagonal 
        if (matrix[0][2] == 0 && matrix[1][1] == 0 && matrix[2][0] == 0)
            return 1;
        if (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1)
            return 2;

        // checks each column
        for (int i=0;i<3;i++)
        {
            if (matrix[i][0] == 0 && matrix[i][1] == 0 && matrix[i][2] == 0) // second player won
                return 1;
            else if (matrix[i][0] == 1 && matrix[i][1] == 1 && matrix[i][2] == 1) //first player won 
                return 2;
        }
        // check each row
        for (int i=0;i<3;i++)
        {
            if (matrix[0][i] == 0 && matrix[1][i] == 0 && matrix[2][i] == 0) // second player won
                return 1;
            else if (matrix[0][i] == 1 && matrix[1][i] == 1 && matrix[2][i] == 1) //first player won 
                return 2;
        }
        //tie
        return 0;
    }

    public static void clean_up(){stdin.close();}


}
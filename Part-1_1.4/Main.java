import xo.XO;


public class Main
{

    public static void main(String[] args)
    {
        XO game = new XO();

        game.view_matrix();

        game.round();
        game.view_matrix();

    }


}
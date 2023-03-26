package Connect_Four_Game;

public class Initialization
{


    public static void play ()
    {
        String[][] board = new String [6][7];

        for (int i=0; i<board.length; i++)
        {
            for (int j=0; j<board[0].length; j++)
            {
                board[i][j] = " ";
            }
        }
        int turn = 0;
        int x = 0;

        display(board);

        System.out.println("YELLOW GOES FIRST!");

        while(true)
        {
            board = Tool.drop(board,turn);

            display(board);
            System.out.println(x);
            x++;


        }






    }

    public static void display (String[][] board)
    {
        for (int i=0; i<board.length; i++)
        {
            for (int j=0; j<board[0].length; j++)
            {
                System.out.print("|" + board[i][j]);
                if (j == board[0].length-1)
                    System.out.print("|");
            }
            System.out.println();
        }
    }


}

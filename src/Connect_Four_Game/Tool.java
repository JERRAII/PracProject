package Connect_Four_Game;

import java.util.Scanner;

public class Tool
{

    public static String[][] drop (String[][] board, int turn)
    {
        Scanner input = new Scanner(System.in);
        if (turn % 2 == 0)
        {
            System.out.println("** YELLOW's turn**");
            System.out.println("Sir or Madam, please select which column you would like to drop. ENTER 1-6 : ");
            int chosen = input.nextInt();
            return dropHelp(board, chosen, "YELLOW");


        }
        else
        {
            System.out.println("** RED's turn**");
            System.out.println("Sir or Madam, please select which column you would like to drop. ENTER 1-6 : ");
            int chosen = input.nextInt();
            return dropHelp(board, chosen, "RED");

        }

    }

    public static String[][] dropHelp (String[][] board, int chosen, String turn)
    {


        for (int i = board.length; i>0; i--)
        {
            String piece = null;
            if (turn.equals("YELLOW"))
                piece = "Y";
            if (turn.equals("RED"))
                piece = "R";

            if (board[i-1][chosen-1].equals(" "))
            {
                board[i-1][chosen-1] = piece;
                break;
            }

            if (i==1 && (board[i-1][chosen-1].equals("R") || board[i-1][chosen-1].equals("Y")))
            {
                System.out.println("U CANNOT ADD ONE MORE HERE!!! PLEASE RE-DO IT!");
                Initialization.display(board);
                System.out.println("It is still " + turn + "'s turn");
                System.out.println("Sir or Madam, please select which column you would like to drop. ENTER 1-6 : ");
                Scanner input = new Scanner(System.in);
                int temp = input.nextInt();
                dropHelp(board, temp, turn);


            }

        }
        return board;
    }

}

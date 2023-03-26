package Miscellaneous;

import java.util.Scanner;

public class Game
{
    private int a, b;
    public Game ()
    {


    }

    public int Die_result ()
    {
        return (int)(Math.random()*6) + 1;
    }

    public String Coin_result ()
    {
        this.a = (int)(Math.random()*2);
        if (a == 0)
        {
            return "heads";
        }
        else
        {
            return "tails";
        }
    }

    public String Spinner_result ()
    {
        this.b = (int)(Math.random()*4) + 1;
        if (b == 1)
        {
            return "red";
        }
        else if (b == 2)
        {
            return "green";
        }
        else if (b == 3)
        {
            return "blue";
        }
        else
        {
            return "yellow";
        }
    }

    public String Check (int x)
    {
        if (x == 0)
        {
            return "N O T H I N G";
        }
        else if (x == 1)
        {
            return "ONE";
        }
        else if (x == 2)
        {
            return "TWO";
        }
        else
        {
            return "ALL OF THEM";
        }
    }

    public int PLAY ()
    {
        Game jerry = new Game ();
        Scanner input = new Scanner (System.in);
        int correctness = 0;
        System.out.println("Enter your GUESS on the die roll, enter 1 - 6: ");
        int guess1 = input.nextInt();
        System.out.println("Enter your GUESS on the coin flip, enter Heads or Tails: ");
        String guess2 = input.next();
        System.out.println("Enter your GUESS on the spinner, enter red, green, blue, or yellow: ");
        String guess3 = input.next();

        int result1 = jerry.Die_result();
        String result2 = jerry.Coin_result();
        String result3 = jerry.Spinner_result();

        System.out.println("you have rolled a:   " + result1);
        System.out.println("you have flipped:    " + result2);
        System.out.println("you have spun:       " + result3);

        if (guess1 == result1)
        {

            correctness++;
        }

        if (guess2.equalsIgnoreCase(result2))
        {
            correctness++;
        }


        if (guess3.equalsIgnoreCase(result3))
        {
            correctness++;
        }

        System.out.println("\n\n You somehow managed to get " + jerry.Check(correctness) + " correct.");
        return correctness;
    }
}

package Miscellaneous;//This program is for a class project (AP CS A) about utilization of methods
//Author: Jerry Li G12
//Date: 2022/11/30
//Teacher: Dr. Hamza
//Notes: FOUR INTERESTING PROGRAMS!
import java.util.Scanner;

public class Assignment
{
    private int current, ans, count;


// ******************** PROGRAM #2 **************************
    public void GuessingGame ()
    {
        ans = (int)(Math.random()*100);
        current = -1;
        count = 0;
        Scanner input = new Scanner (System.in);
        while (current != ans)
        {
            System.out.println("Please enter a number between 0-100");
            current = input.nextInt();
            if (current == ans)
            {
                count++;
                System.out.println("Congrats, you got it, the answer is " + ans);
                System.out.println("You guessed "+ count + " times.");
            }
            else if (current > ans)
            {
                System.out.println("Your guess is BIGGER than the answer, try again!");
                count++;
            }
            else if (current < ans)
            {
                System.out.println("Your guess is SMALLER than the answer, try again!");
                count++;
            }
            else
            {
                System.out.println("ERROR");

            }
        }


    }

    // ******************** PROGRAM #1 **************************
    public void SUM ()
    {
        int user, sum=0;
        this.count = 0;
        Scanner input = new Scanner (System.in);

        while (count < 5)
        {
            System.out.println("Input a number: ");
            user = input.nextInt();
            if (user != 999)
            {
                sum += user;
                count++;
            }
            else
            {
                break;
            }
        }
        System.out.println("The final sum is: " + sum);

    }

    // ******************** PROGRAM #3 **************************
    public void PandN ()
    {
        int user, Pcount = 0, Ncount = 0, Fcount = 0;
        double avg;
        Scanner input = new Scanner (System.in);
        while (true)
        {
            System.out.println("Input a number: ");
            user = input.nextInt();
            if (user > 0)
            {
                Fcount += user;
                Pcount++;
            }
            else if (user < 0)
            {
                Fcount += user;
                Ncount++;
            }
            else
            {
                break;
            }
        }

        avg = (double)Fcount / (Pcount + Ncount + 1);
        System.out.println("You have put in " + Pcount + " positive integers, and "+ Ncount + " negative integers");
        System.out.println("And the average of all numbers you've put in is: " + avg);

    }

    // ******************** PROGRAM #4 **************************
    public void tuition ()
    {
        double tuition = 15000, Ftuition = 15000;
        int count = 0;

        while (Ftuition < tuition*2)
        {
            Ftuition *= 1.07;
            count++;
        }
        System.out.println("It takes " + count + " YEARS for the tuition to dounle. For an annual increase of 7%");
        System.out.println("In additio, the tuition after 20 years is $" + tuition * Math.pow(1.07,20));

    }
}

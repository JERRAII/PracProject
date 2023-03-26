package Miscellaneous;

public class Reverse
{
    private int m = 0; int A = 1;
    public void Cheat(String x)
    {
        this.m = x.length();
        while (m>=1)
        {
            System.out.print(x.charAt(m-1));
            m--;
        }

    }

    public double Factorial (int y)
    {

        while ( y >= 2)
        {
            this.A *= y;
            y--;
        }
        return this.A;
    }
}

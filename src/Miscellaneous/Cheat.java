package Miscellaneous;

public class Cheat
{
    private int i = 0, count = 0;
    private String ans =  "";

    public String vowel (String x)
    {
        this.i = x.length();
        while (i >= 1)
        {
            if ( ! (x.charAt(x.length() - i) == 'a' || x.charAt(x.length() - i) == 'e' || x.charAt(x.length() - i) == 'i' || x.charAt(x.length() - i) == 'o' || x.charAt(x.length() - i) == 'u'))
            {
                this.ans += x.charAt(x.length() - i);

            }
            i--;
        }
        return this.ans;

    }
    public String replace_t (String x)
    {
        this.i = x.length();
        String nstr = "";
        while (i >= 1)
        {
            if ( !(x.charAt(x.length() - i) == 't'))
            {
                nstr += x.charAt(x.length() - i);

            }
            i--;
        }
        return nstr;

    }

    public static boolean isPrime (int n)
    {
        boolean noFactors = true;

        if(n <= 1)
            return false;
        for (int m = 2; noFactors; m++)
        {
            if (m*m > n)
            {
                break;
            }
            if (n%m ==0)
            {
                noFactors = false;
            }

        }
        return noFactors;
    }

    public static boolean isPrime2 (int n)
    {

        if(n <= 1)
            return false;
        int m = 2;

        while (m*m <= n)
        {
            if (n % m == 0)
            {
                return false;
            }
            m++;
        }
        return true;
    }

    public static int GCF (int a, int b)
    {
        while (a != b)
        {
            if (b>a)
            {
                b = b-a;
            }
            else
            {
                a = a-b;
            }
        }
        return a;
    }
    public static void printAllCharacters(String str)
    {
        for (int x = 0; x <= str.length(); x++)   // Line 3
        {
            System.out.print(str.substring(x, x + 1));
        }
    }

}

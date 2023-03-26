package Miscellaneous;

public class Str
{


    private static String ans =  "";
    private static int i =0, m=0;

    public static String removeSpaces (String x)
    {
        String ans =  "";
        i = x.length();
        while (i >= 1) {
            if (!(x.charAt(x.length() - i) == ' '))
            {
                ans += x.charAt(x.length() - i);

            }
            i--;
        }
        return ans;
    }

    public static String reverseString (String x)
    {
        String reversed = "";
        m = x.length();
        while (m>=1)
        {
            reversed += x.charAt(m-1);
            m--;
        }
        return reversed;
    }

    public static void palindromeChecker (String z)
    {
        String LETTERS = Str.removeSpaces(z);
        String REV = Str.reverseString(z);
        if (Str.removeSpaces(REV).equalsIgnoreCase(LETTERS))
        {
            System.out.println(" IS PALINDROME");
        }
        else
        {
            System.out.println(" ITS NOT palindrome");
        }
    }



}

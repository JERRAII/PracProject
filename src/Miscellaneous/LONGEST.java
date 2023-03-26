package Miscellaneous;

public class LONGEST
{
    private static char previous = ' ';
    private static String Finalstreak = "", streak = "";

    public static void longestStreak(String str)
    {


        for (int i = 0; i < str.length(); i++)
        {

            if (!(str.charAt(i) == previous))
            {


                streak = "";

            }

            streak += str.charAt(i);

            if (streak.length() > Finalstreak.length())
            {

                Finalstreak = streak;

            }

            previous = str.charAt(i);

        }

        System.out.println(Finalstreak.charAt(0));
        System.out.println("For maximum length of " + Finalstreak.length());

    }
    public static void longestStreak2 (String str){
        String tempstr=" ", finalchar="";
        int len=0,maxlen=0;
        for(int i=0;i<str.length();i++)
        {
            System.out.println("i = " + i);
            tempstr=str.substring(i,i+1);
            while( len<str.length() && str.substring(len,len+1).equals(tempstr))
            {
                System.out.println("len=" + len);
                len++;
            }
            if(len-i>maxlen)
            {
                System.out.println("true");
                maxlen=len-i;
                finalchar=tempstr;
            }

        }
        System.out.println(finalchar + " " +  maxlen);
    }

}

package Miscellaneous;

public class HotDogStand
{
    int standID, standSold;

    static int totalsold;

    public HotDogStand()
    {
        this.standID = 0;
        standSold = 0;
    }
    public HotDogStand (int a, int b)
    {
        this.standID = a;
        standSold = b;
    }
    public void justSold()
    {
        standSold++;
        totalsold++;
    }

    public static int getTotalsold()
    {
        return totalsold;
    }

    public int getsold()
    {
        return standSold;
    }
    public int getID()
    {
        return standID;
    }
}

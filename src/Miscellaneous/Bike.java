package Miscellaneous;

public class Bike
{
    private double g_size, cadence, constant;

    public Bike(double g_size, double cadence)
    {
        this.g_size = g_size;
        this.cadence = cadence;
        this.constant = (double) 60 / (12*5280);
    }



    public double speed ()
    {
        return constant * g_size * Math.PI * cadence;
    }
}

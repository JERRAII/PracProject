package Miscellaneous;//This the Pizza class for the project
//Author: Jerry Li G12
//Date: 2022/10/28
//Teacher: Dr. Hamza
//Notes: Under mentor's suggestions, I also added the "set" methods, which is useful when a customer changes his mind


public class Pizza
{
    private String size;
    private int C_topping, P_topping, H_topping;

    public Pizza(String size, int c_topping, int p_topping, int h_topping)
    {
        this.size = size;
        C_topping = c_topping;
        P_topping = p_topping;
        H_topping = h_topping;

    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setC_topping(int c_topping) {
        C_topping = c_topping;
    }

    public void setH_topping(int h_topping) {
        H_topping = h_topping;
    }

    public void setP_topping(int p_topping) {
        P_topping = p_topping;
    }

    public double calcCost ()
    {
        if (size.equalsIgnoreCase("small"))
        {
            return 10 + (C_topping + P_topping + H_topping)*2 ;
        }
        else if (size.equalsIgnoreCase("medium"))
        {
            return 12 + (C_topping + P_topping + H_topping)*2 ;
        }
        else
        {
            return 14 + (C_topping + P_topping + H_topping)*2 ;
        }
    }



    public String getDescription()
    {
        return "pizza size is " + size + "\nCheese toppings: " + C_topping + "\nPepperoni toppings: " + P_topping + "\nHam toppings: " + H_topping;
    }

}

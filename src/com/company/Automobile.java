package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    private double mpg;
    private double gallons;

    public Automobile (double mileage)
    {
        mpg = mileage;
        gallons = 0;
    }

    public void fillUp(double amount)
    {
        gallons += amount;
    }

    public void takeTrip(int distance)
    {
        gallons -= (distance / mpg);
    }

    public double reportFuel()
    {
        return gallons;
    }
}

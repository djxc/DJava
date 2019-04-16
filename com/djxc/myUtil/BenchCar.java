package com.djxc.myUtil;
/**
 * ∏√¿‡ºÃ≥–¡ÀCar
 * @author dj
 * @version 1.0
 */
import com.djxc.myUtil.Car;

public class BenchCar extends Car
{
    private double maxSpeed;

    public BenchCar(String color, double price, String owner, double maxSpeed)
    {
        super(color, price, owner);
        this.maxSpeed = maxSpeed;
    }

    public void info()
    {
        super.info();
        System.out.println("This is bench car, it's maxSpeed is " + maxSpeed);
    }
}

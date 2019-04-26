package com.djxc.myUtil;
/**
 *
 */
import com.djxc.myUtil.Car;

public class BMWCar extends Car
{
    private String powerType;

    public BMWCar(String color, double price, String owner, String powerType) 
    {
        super(color, price, owner);
        this.powerType = powerType;
    }   

    public void info()
    {
        super.info();
        System.out.println("This is BMW car, it's powerType is " + powerType);
    }
}

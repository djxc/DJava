package com.djxc.action;

/**
 *
 */
import com.djxc.myUtil.Car;


public class Buy
{

    private String name;
    private Car car;
    public Buy(String name)
    {
        this.name = name;
    }

    public void buyCar(Car car)
    {
        this.car = car;
    }

    public void buyInfo()
    {
        System.out.print(name + " buy a car,this is the car info: ");
        car.info();
    }
}

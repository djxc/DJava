package com.djxc.myUtil;

/**
 *
 */

public class Car
{
    private String color;
    private double price;
    private String owner;

    public Car(String color, double price, String owner)
    {
        this.color = color;
        this.price = price;
        this.owner = owner;
    }
    
    public void info()
    {
        System.out.println("This car's color is " + color + ", price is "
                + price + ", owner is " + owner);
    }
    
    public String getOwner()
    {
        return owner;
    }

    public void turnLeft()
    {
        CarLight carLight = new CarLight();
        carLight.leftFlash();
    }

    public class CarLight
    {
        private String light_color;
        private int light_number;

        public void leftFlash()
        {
            System.out.println(color + "car left light flash");
        }
    }
}

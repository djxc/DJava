/** 
 * This program demostractes console input
 * @author dj
 * @version 1.0
 */

import java.util.*;

import com.djxc.myUtil.Car;
import com.djxc.myUtil.BenchCar;
import com.djxc.myUtil.BMWCar;
import com.djxc.action.Buy;
import com.djxc.myUtil.DjReflective;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class dj
{
    public static void main(String[] args)
    {
        if(args.length>0)
        {
            String args1 = args[0];
            System.out.println(args1);
        }
        //ConInput();
        Student xc = new Student("xc", 23);
        xc.info();
        System.out.println("*********************************************");
		System.out.println("*********************************************");

        testInheritance();   
        //testReflective();
    }
    
    public static void testInnerClass()
    {
        Car car = new Car("red", 32, "djxc");
        car.info();
        car.turnLeft();
       
    }

    public static void testReflective()
    {
         Car car = new Car("red", 32, "djxc"); 
         Class car_cal = car.getClass();
         
         DjReflective djRef = new DjReflective();   // 
         djRef.printFields(car_cal);

         try{
            Method info = car_cal.getMethod("info");
            info.invoke(car);
            Field color = car_cal.getDeclaredField("color");
            color.setAccessible(true);
            Object v = color.get(car);
            System.out.println("class name: " + car_cal.getName() + "; " + v);
         }catch(Exception e){
            e.printStackTrace();
         }
    }
    
    /**
     */
     public static void testInheritance()
    {
        Car bCar = new BenchCar("green", 100.2, "djdj", 350);
        Car bmwCar = new BMWCar("black", 45, "yn", "oil");
        Car car = new Car("red", 32, "djxc"); 
       
        Buy buy = new Buy("jxc");
        buy.buyCar(car);
        buy.buyInfo();
        buy.buyCar(bmwCar);
        buy.buyInfo();
       
    }

    public static void ConInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Hello, " + name + ". Next year, you'll be " + (++age));
        System.out.printf("Hello, %s.Next year, you'll be %d.", name, (++age));
        String output = String.format("Hello, %s.Next year, you'll be %d.", name, (++age));
        System.out.println();
        System.out.println(output);
    }

}

package com.djxc.myUtil;
/**
 * @author dj
 * @version 1.0
 * ���Է������
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class DjReflective
{
    private Class cl;

    public DjReflective(Class cl)
    {
        this.cl = cl;
    }
    
    public DjReflective()
    {}

    // ������е����ԣ��������Ե����ơ������Լ����η���public private�ȣ�
    public void printFields(Class cl)
    {
        this.cl = cl;
        printFields();
    }

    public void printFields()
    {
        System.out.println("*******************Fields****************************");
        Field[] fields = cl.getDeclaredFields();
        for(Field f : fields){
            String name = f.getName();
            String modifiers = Modifier.toString(f.getModifiers());
            Class type = f.getType();
            System.out.println(modifiers + " " + type.getName() + " " + name);
        }
    }

    public static void printMethods(Class cl)
    {
        System.out.println("********************Methods********************************");
        Method[] methods = cl.getDeclaredMethods();
        for(Method method : methods)
        {
            String name = method.getName();
            System.out.println(name);
        }
    }
    
    public static void printConstructors(Class cl)
    {
        System.out.println("********************Constructors********************************");
        Constructor[] cons = cl.getDeclaredConstructors();
        for(Constructor con : cons)
        {
            String name = con.getName();
            System.out.println(name);
        }
    }

}

/**
 * @author dj
 * @version 1.0
 */

public class Student
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void info()
    {
        System.out.println("name: " + name + "; age: " + age);
    }
}

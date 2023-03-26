package Miscellaneous;

public class Employee
{
    private int age;
    private String name;
    private int salary;
    int ID;

    public Employee(int age, String name, int salary, int ID)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}

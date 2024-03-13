import java.util.*;

class Student
{
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public Student(int No,String str,int X,int Y)
    {
        this.Rno = No;
        this.Name = str;
        this.Age = X;
        this.Marks = Y;
    }

    public void Display()
    {
        System.out.println(this.Rno + " " + this.Name + " " + this.Age + " " + this.Marks);
    }
}

class program524
{
    public static void main(String arg[])
    {
        Student sobj1 = new Student(1,"Amit",23,89);
        sobj1.Display();
        Student sobj2 = new Student(2,"Sagar",22,80);
        sobj2.Display();
        Student sobj3 = new Student(3,"Pooja",21,67);
        sobj3.Display();
        Student sobj4 = new Student(4,"Sumit",22,77);
        sobj4.Display();
        Student sobj5 = new Student(5,"Sayali",25,90);
        sobj5.Display();

    }
}
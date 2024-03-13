import java.util.*;

class Student
{
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str,int X,int Y)
    {
        this.Rno = ++Generator;
        this.Name = str;
        this.Age = X;
        this.Marks = Y;
    }

    public void Display()
    {
        System.out.println(this.Rno + " " + this.Name + " " + this.Age + " " + this.Marks);
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList<Student>();
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous DBMS started successfully...");
        System.out.println("Table Schema created successfully...");
    }
    
    //insert into table student values(_____,______,_________);
    public void InsertIntoTable(String name,int age,int marks)
    {
        Student sobj = new Student(name,age,marks);
        lobj.add(sobj);
    }
}

class program527
{
    public static void main(String arg[])
    {
        DBMS obj = new DBMS();
        obj.StartDBMS();

        obj.InsertIntoTable("Rahul",23,89);
        obj.InsertIntoTable("Sagar",22,69);
        obj.InsertIntoTable("Sayali",23,79);
        obj.InsertIntoTable("Amit",20,90);
        obj.InsertIntoTable("Sumit",21,88);

    }
}
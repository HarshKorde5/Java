import java.io.*;
import java.util.*;

class Doner
{
    String name,address,group,contact;
    int age,lod;

    public Doner(String dname,int a,String addr,String con,String gr,int l)
    {
        this.name = dname;
        this.address = addr;
        this.group = gr;
        this.contact = con;
        this.age = a;
        this.lod = l;
    }


}

class Blood
{
    public static void main(String arg[]) throws Exception
    {   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of donars : ");
        int n = sc.nextInt();

        try
        {
            Doner[] d = new Doner[n];
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("save.txt"));

            for(int i = 0;i < n;i++)
            {
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Enter age : ");
                int age = sc.nextInt();

                System.out.println("Enter address : ");
                String address = sc.next();

                System.out.println("Enter contact : ");
                String contact = sc.next();

                System.out.println("Enter group : ");
                String group = sc.next();

                System.out.println("Enter last date of donation : ");
                int lod = sc.nextInt();

                // d[i] = new Doner(name,age,address,contact,group,lod);

                o.writeObject(d[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        try
        {
            ObjectInputStream z = new ObjectInputStream(new FileInputStream("save.txt"));
            for(int i = 0;i < n;i++)
            {
                Doner d1 = (Doner)z.readObject();

                if(d1.group.equals("A+") && d1.lod >= 6)
                {
                    System.out.println(d1);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
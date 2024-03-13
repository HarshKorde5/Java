import java.util.*;

class Collection5
{
    public static void main(String arg[])
    {
        Hashtable<String , Integer> hobj = new  Hashtable<String , Integer>();

        hobj.put("C Programming",900);
        hobj.put("C++ Programming",1200);
        hobj.put("Java Programming",780);
        hobj.put("Python Programming",1650);

        System.out.println("Book price of java "+hobj.get("Java Programming"));

        hobj.remove("C++ Programming");

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }

    }
}
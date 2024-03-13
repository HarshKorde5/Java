import java.util.*;
import java.io.*;

class program517
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        byte Header[] = new byte[100];
    
        System.out.println("-------------- Marvellous Packer Unpacker --------------");
        System.out.println("Unpacking Activity of the application is started...");

        System.out.println("Enter the file name which contains the packed data : ");
        String PackedFile = sobj.nextLine();

        try
        {
            File Packobj = new File(PackedFile);

            FileInputStream inobj = new FileInputStream(Packobj);

            inobj.read(Header,0,100);

            String HeaderStr = new String(Header);
            
            System.out.println(HeaderStr);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }
    }

}
import java.util.*;

class program373
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");
        System.out.println("Number of words are : "+arr.length);
        
        int iCount = 0;


        for(String s : arr)
        {
            if(s.equals("india"))
            {
                iCount++;
            }
        }

        System.out.println("Frequency is : "+iCount);

    }
}
import java.util.*;

class program374
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Enter word to check : ");
        String str1 = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");
        System.out.println("Number of words are : "+arr.length);
        
        int iCount = 0;


        for(String s : arr)
        {
            if(s.equals(str1))
            {
                iCount++;
            }
        }

        System.out.println("Frequency is : "+iCount);

    }
}
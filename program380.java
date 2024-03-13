import java.util.*;

class program380
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");
        
        StringBuffer output = new StringBuffer();

        for(int iCnt = arr.length - 1; iCnt >= 0;iCnt--)
        {
            StringBuffer sb = new StringBuffer(output);

            output.append(sb.append(" "));
        }

        System.out.println(output);
    }
}
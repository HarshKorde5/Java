import java.io.*;

class InputDemoX
{
    public static void main(String Arg[]) 
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter First Number");
            int No1 = Integer.parseInt(bobj.readLine());

            System.out.println("Enter Second Number");
            int No2 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException)
        {}
        int Ans = No1 + No2;

        System.out.println("Addition is : "+Ans);
    }
}
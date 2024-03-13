
import java.util.*;

class Digits
{
    public int SumDigits(int iValue)
    {
        int iSum = 0;

        while(iValue != 0)
        {
            iSum = iSum + (iValue % 10);
            iValue = iValue / 10;
        }
        return iSum;
    }
}

class program339
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.SumDigits(iNo);

        System.out.println("Sum of Digits is : "+iRet);

    }
}
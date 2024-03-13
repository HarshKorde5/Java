//kharkata logic don't consider

import java.util.*;

class Digits
{
    public int GenericRoot(int iValue)
    {
        int iSum = 11;

        while(iSum >= 10)
        {
            iSum = 0;
            while(iValue != 0)
            {
                iSum = iSum + (iValue % 10);
                iValue = iValue / 10;
            }
            iValue = iSum;
        }
        return iSum;
    }
}

class program340
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();
        
        Digits dobj = new Digits();
        int iRet = dobj.GenericRoot(iNo);

        System.out.println("Generic root is : "+iRet);

    }
}
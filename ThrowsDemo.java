class Demo
{
    public float Division(int No1, int No2) throws ArithmeticException
    {
        return No1/No2;
    }
}

class ThrowsDemo
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();
        float ret = 0.0f;
        try
        {
            ret = dobj.Division(11,0);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured");
        }
        System.out.println(ret);
    }
}
class Demo
{
    public Demo()
    {
        System.out.println("Default");
    }

    public Demo(float a)
    {
       this(10);

        System.out.println("Paramter1");
    }
    public Demo(int A)
    {   
        System.out.println("Parameter2");
    }
}


class prog1
{
    public static void main(String arg[])
    {
        Demo obj = new Demo(11.11f);
    }
}
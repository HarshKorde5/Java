interface Circle
{
    public final float PI = 3.14f;

    public float CalculateArea(float Radius);
    public float CalculateCircumference(float Radius);
}

class Demo implements Circle
{
    public float CalculateArea(float Radius)    
    {
        return PI*Radius*Radius;
    }
    public float CalculateCircumference(float Radius)
    {
        return 2*PI*Radius;
    }

}

class InterfaceDemo
{
    public static void main(String arh[])
    {
        Demo dobj = new Demo();
        float fRet = 0.0f;

        fRet = dobj.CalculateArea(10.5f);
        System.out.println("Area is : "+fRet);

        fRet = dobj.CalculateCircumference(10.5f);
        System.out.println("Area is : "+fRet);
    }
}
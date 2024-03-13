
class Arithmatic
{
    public int No1;
    public int No2;

    public Arithmatic()     //Default constructor
    {
        System.out.println("Inside Default constructor");
        this.No1 = 0;
        this.No2 = 0;
    }
    public Arithmatic(int i,int j)      //Parameterised constructor
    {
        System.out.println("Inside Parameterized constructor");
        this.No1 = i;
        this.No2 = j;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }
    
}

class OOP
{
    public static void main(String arg[])
    {
        System.out.println("Inside main function");

        Arithmatic obj1 = new Arithmatic();
        Arithmatic obj2 = new Arithmatic(11,10);

        int iRet = 0;
        
        iRet = obj1.Addition();     //0
        System.out.println("Addition id : "+iRet);
        
        iRet = obj1.Substraction();     //0
        System.out.println("Substraction id : "+iRet);

        iRet = obj2.Addition();     //21
        System.out.println("Addition id : "+iRet);

        iRet = obj2.Substraction();     //1
        System.out.println("Substraction id : "+iRet);
        
    }
}
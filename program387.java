import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int i,int j)
    {
        Arr = new int[i][j];
    }

    public void Accept()
    {
        int i = 0,j = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter elements : ");
        for( i = 0; i< Arr.length;i++)
        {
            for(j = 0; j < Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0,j = 0;
        System.out.println("Elements of matrix are : ");
        for( i = 0; i< Arr.length;i++)
        {
            for(j = 0; j< Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
class program387
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
    }
}
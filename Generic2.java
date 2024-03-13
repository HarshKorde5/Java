
class Generic2
{
    public static <T> void Display(T Arr[])
    {
        for(T no : Arr)           //foreach loop
        {
            System.out.println(no);
        }
    }

    public static void main(String arg[])
    {
        Integer A[] = {10,20,30,40};
        Float B[] = {50.1f,60.1f,70.2f};
        Double C[] = {50.1,60.1,70.2};

        Display(A);
        Display(B);
        Display(C);

    }
}
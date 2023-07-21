/*Swapping two number with and without temp */
class Test
{
    void demoswapping(int n,int m)
    {
        int temp=n;
        n=m;
        m=temp;
        System.out.println("The value of m="+m+ "\nThe value of n="+n);
    }
    void demoswapping1(int n,int m)
    {
        n=m+n;
        m=n-m;
        n=n-m;
        System.out.println("The value of m="+m+ "\nThe value of n="+n);
    }
}
public class Swapping {
    public static void main(String [] args)
    {
        Test obj=new Test();
        System.out.println("with temp variable : ");
        obj.demoswapping(10,20);
        System.out.println("without tyemp variable : ");
        obj.demoswapping1(10, 20);
    }
    
}

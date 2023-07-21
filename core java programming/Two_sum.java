/*sum of two number */
import java.util.Scanner;
class Demo1
{
    void sum(int frist,int second)
    {
        
        int result=frist+second;
        System.out.println("the sum of these two number is : "+result);

    }
    
}
public class Two_sum {
    public static void main(String [] args)
    {
        int a;
        int b;
        Demo1 mir=new Demo1();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a frist number : ");
        a=obj.nextInt();
        System.out.println("Enter a second number : ");
        b=obj.nextInt();
        mir.sum(a,b);
    }
}

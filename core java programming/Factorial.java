/*Factorial number */
import java.util.Scanner;
class Fact
{
    void process(double n)
    {
        int count1=1;
        for(int i=1;i<=n;i++)
        {
            count1=count1*i;
        }
        System.out.println("The factorial is : "+count1);
    }
}
public class Factorial {
    public static void main(String [] args)
    {
        double num;
        char ch;
        Scanner mir=new Scanner(System.in);
        Fact obj=new Fact();
        do{
        System.out.print("Enter number : ");
            num=mir.nextDouble();
            obj.process(num);
            System.out.print("Do you want to again press 'y' : ");
            ch=mir.next().charAt(0);
        }
        while(ch=='y');
    }
    
}

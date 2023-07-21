/*claculate digit of a number */
import java.util.Scanner;
class Digit_demo
{
    void number(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("The digit of a number is : "+count);
    }
}
public class Count_digit {
    public static void main(String [] args)
    {
        int num;
        char choose;
        Scanner obj=new Scanner(System.in);
        Digit_demo mir=new Digit_demo();
        do{
            System.out.print("Enter number : ");
            num=obj.nextInt();
            mir.number(num);
            System.out.print("Do you want to again press y : ");
            choose=obj.next().charAt(0);
        }while(choose=='y');
    }
    
}

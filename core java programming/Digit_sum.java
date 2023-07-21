/*sum of digit */
import java.util.Scanner;
public class Digit_sum
{
    public static void main(String [] args)
    {
        int num,rem,sum=0;
        char choose;
        Scanner obj=new Scanner(System.in);
        do{
            System.out.println("Enter number : ");
            num=obj.nextInt();
            while(num>0)
            {
                rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
             System.out.println("the sum of these number is : "+sum);
            System.out.println("Do you want to again press y : ");
            choose=obj.next().charAt(0);
        }while(choose=='y');
    }
}
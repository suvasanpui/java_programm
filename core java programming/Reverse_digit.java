/*reverse number */
import java.util.Scanner;
public class Reverse_digit {
    public static void main(String [] args)
    {
        int num,rem,count=0;
        char choose;
        Scanner obj=new Scanner(System.in);
        do{
            System.out.println("Enter the number : ");
            num=obj.nextInt();
            System.out.println("that are the reverse digit");
            while(num>0)
            {
                rem=num%10;
                System.out.print(rem);
                num=num/10;
            }
            System.out.println("\ndo you want to again press y : ");
            choose=obj.next().charAt(0);
        }while(choose=='y');
    }
}
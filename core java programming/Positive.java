/*check positive or negative number */
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class Positive {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int num;
        System.out.println("Enter a number ");
        num=obj.nextInt();
        if(num>0)
        {
            System.out.println("These number is positive number ");
    
        }else{
            System.out.println("This number is negative number ");
        }
     
    }
    
}

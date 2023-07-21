/*star(*) pattern from user input all */
import java.util.Scanner;
class Demo
{
    void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int k=n;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern3(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern4(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern5(int n)
    {
        int num1=(n/2);
        for(int i=0;i<num1;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=0;l<=num1-1;l++)
        {
            for(int m=num1-1;m>l;m--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern6(int n)
    {
        int num=n/2;
        for(int i=0;i<num;i++)
        {

            for(int k=num-1;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=0;m<=num-1;m++)
        {
            for(int p=0;p<=m;p++)
            {
                System.out.print(" ");
            }
            for(int t=num-1;t>m;t--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern7(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<=i;k++)
            {
                if(i>=1 && k<=i-1)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
              
            }

            System.out.println();
        }
        
    }
}
public class All_star_pattern {
    public static void main(String [] args)
    {
        int num,n;
        char choose;
        Scanner obj=new Scanner(System.in);
        Demo mir=new Demo();
        do
        {
            System.out.print("Enter patternn number : ");
            n=obj.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern1(num);
                break;
                case 2:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern2(num);
                break;
                case 3:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern3(num);
                break;
                case 4:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern4(num);
                break;
                case 5:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern5(num);
                break;
                case 6:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern6(num);
                break;
                case 7:
                System.out.print("How many line are you want : ");
                num=obj.nextInt();
                mir.pattern7(num);
                break;
                default:
                System.out.println("invalid");
            } 
            System.out.print("Do you want to again , Praess y : ");
            choose=obj.next().charAt(0);
        }while(choose=='y');
        
    }
    
}

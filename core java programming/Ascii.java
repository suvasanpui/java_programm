/*Ascii valuse of any character */
import java.util.Scanner;
class Ascii
{
    public static void main(String [] args)
    {
        char h;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter character : ");
        h=obj.next().charAt(0);
        int g=h;
        System.out.println("Ascii value of these number is : "+g);
    }
}
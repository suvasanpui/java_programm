/*WAP to chech username and password */
import java.util.Scanner;
class Login
{
    String name;
    String password;
    static void show1()
    {
        System.out.println("Name : Suva sanpui\nFather nmae : Bablu sanpui\nMother name:Purabi sanpui\nAddress : \nP>O:Baneswarpur\nP>S : Usthi\nDist:24 pgs(south)");
    }
    static void show2()
    {
        System.out.println("Name : Suva sanpui\nFather nmae : Bablu sanpui\nMother name:Purabi sanpui\nAddress : \nP>O:Baneswarpur\nP>S : Usthi\nDist:24 pgs(south)");
    }
    public Login(String name,String password)
    {
        this.name=name;
        this.password=password;
    }
    void check()
    {
        if((name.equals("Suvasanpui")) && (password.equals("3902")))
        {
            System.out.println("Succesful login");
            show1();
        }
        else if((name.equals("Suvasanpuicom")) && (password.equals("3902")))
        {
            System.out.println("succesful login");
            show2();
        }
        else{
            System.out.println("invlid");
        }
    }
}

public class Demo_login {

    public static void main(String [] args)
    {
        String a;
        String b;
        char choose;
        do{
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter your username : ");
            a=obj.nextLine();
            System.out.println("Enter your password : ");
            b=obj.nextLine();
            Login obj2=new Login(a,b);
            obj2.check();
            System.out.println("Do you want to again : ");
            choose=obj.next().charAt(0);
        }
            while(choose=='y');
    }
}


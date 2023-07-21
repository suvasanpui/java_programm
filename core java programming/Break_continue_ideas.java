/*break continue statement in java*/
class Demo10{
    void continue10()
    {
         for(int i=0;i<=10;i++)
        {
            if(i==5)
            
                continue;
                System.out.println(i);
            
        }
    }
    void break10()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            if(i==5)
            {
                break;
            }
        }
    }
}
class Break_continue_ideas
{
    public static void main(String [] args)
    {
       Demo10 obj=new Demo10();
       obj.break10();
       System.out.println("************");
       obj.continue10();
    }
}
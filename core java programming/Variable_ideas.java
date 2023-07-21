/*WAP to to shaw variable */
class Checkvariable
{
    int a=10;//instance variale
    static String b="suva";//static variable
    public Checkvariable()//constructor
    {

    }
    void show()//method
    {
        System.out.println(a+" "+b);
    }
}
    class Variable_ideas
    {
        public static void main(String [] args)
        {
            int cv=20;//local variable
            Checkvariable obj=new Checkvariable();
            obj.show();
            System.out.println(cv);
        }
    }
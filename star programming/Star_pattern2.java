/*Start pattern type:
    * * * * * 
    * * * * 
    * * * 
    * * 
    *
*/
public class Star_pattern2 {
    public static void main(String [] args)
    {
        
        for(int i=0;i<5;i++)
        {
            int count=i;
            for(int j=count;j<4;j++)
            {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
    
}

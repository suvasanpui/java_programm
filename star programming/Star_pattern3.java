/*start pattern type:
    * 
    * * 
    * * * 
    * * * * 
    * * * * *
*/
public class Star_pattern3 {
    public static void main(String [] args)
    {
        int low=5;
        for(int i=0;i<low;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

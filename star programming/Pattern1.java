/*star pattern type:1
                    12
                    123
                    1234
                    12345
 */
public class Pattern1 {
    public static void main(String [] args)
    {
        for(int i=1;i<=5;i++)
        {
            
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    } 
    
}

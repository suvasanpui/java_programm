/*star pattern : *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
 */
public class Star_pattern5 {
    public static void main(String [] args)
    {
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<5;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

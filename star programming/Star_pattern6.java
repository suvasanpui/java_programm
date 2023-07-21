/*star pattern type: *
**
***
****
*****
****
***
**
*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */
public class Star_pattern6 {
    public static void main(String [] args)
    {
        
        for(int i=0;i<5;i++)//one patter *
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<5;i++)//another pattern *
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=0;i<5;i++)//one another pattern *
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)//another one pattern *
        {
            for(int j=4;j>=4-i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<4-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
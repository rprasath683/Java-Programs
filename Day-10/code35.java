// Write a program to print Floyd’s Triangle
import java.util.*;
public class code35 {
   

    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int n = Sc.nextInt();
        int count=1;
        Sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count+" ");
             count++;
            }
            System.out.println();

        }
    }
    

}

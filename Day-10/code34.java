// Write a program to print Right Triangle Star Pattern
import java.util.*;
public class code34 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int n = Sc.nextInt();
        Sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}

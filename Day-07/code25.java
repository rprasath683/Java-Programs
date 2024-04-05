// Java Program to Find the Largest of three Numbers.
import java.util.Scanner;

public class code25 {
    public static void main(String[] args) {
            Scanner sa = new Scanner(System.in);
        System.out.println("Enter The Value Of a:");

        int a =sa.nextInt();
        
        System.out.println("Enter The Value Of b:");
        int b=sa.nextInt();

        System.out.println("Enter The Value Of c:");
        int c=sa.nextInt();

        
        sa.close();
        if(a>b && a>c)
        {
            System.out.println("A is Greater "+a);

        }
        else if(b>a && b>c)
        {
            System.out.println("B is Greater "+b);
        }
        else if(c>a && c>b)
        {
            System.out.println("C is Greater "+c);
        }
        else
        {
            System.out.println("All the Numbers Are Equal");
        }
    }
}

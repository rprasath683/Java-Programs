// Program To check whether a Triangle all sides are equal or not
import java.util.*;
public class code26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Sides Of the triangle ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a==b && b==c && a==c)
        {
           System.out.println("It is an equilatral triangle "); 
        }
        else if(a==b || b==c || c==a)
        {
           System.out.println("It is an isoceles triangle "); 
        }
        else
        {
             System.out.println("It is a Scalene triangle ");
        }

    }
    
}

// Write a java program that prints powers of 2 while the given number is positive else the number divided by 2
import java.util.*;
public class code33 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of n :");
        int num = sc.nextInt();
        sc.close();
        //int a =1;
        double result=1;
        System.out.println("The Values are");
        if(num>=0)
        {
            for(int i=1; i<=num; i++)
            {
                result*=2; // 2*2*2 =8  result = result*2;
               
            }
        }
        else
        {
            for(int i=1; i<=-num; i++)
            {
                result/=2.0; // result= result/2.0 // 1/2.0
               
            }

        }
      
        System.out.println(result);
        
    }
    
}

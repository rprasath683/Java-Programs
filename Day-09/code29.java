//  Write a java program to find whether the given number is a special number or not.
import java.util.*;
public class code29{

    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        int sum =0 ,a ,product=1;
        int temp =num;


        
        if(num>=100 && num<=999 )
        {
            while(temp>0) // 1 1>0 
            {
                a=temp%10; // a=10 
                sum +=a; // sum = sum + a;  sum = 10+0; 
                product*=a; // prouduct = product*a; product = 1 *10 = 10;
                temp/=10; 
                

            }
            if(sum %2==0 && product %2!=0)
            {
                System.out.println("It Is  A Special Number");
            }
            else 
            {
                System.out.println("It Is Not  A Special Number");
            }

        }
        else 
        {
            System.out.println("It Is Not  A Special Number");
        }
        
    }
}
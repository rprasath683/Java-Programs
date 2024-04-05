// Write a java program that prints the factors of the given number.
import java.util.*;
public class code31 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter The Number :");
       int num = sc.nextInt();
        sc.close();
        //int num = (int)1e9;
        System.out.println("The Factors are :");
        for(int i =1;i<= Math.sqrt(num);i++)
        {
            if (num%i==0) 
            {
                System.out.println(i);

                if(i*i != num)
                {
                    System.out.println(num/i);
                }
                
                
               
                
            }
        }

    }

}
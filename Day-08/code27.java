// Write a java program to find whether the given year is a leap year or not .
import java.util.*;
public class code27{

    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Year");
        int a = sc.nextInt();
        sc.close();

        if(a%400==0  || (a%4==0 && a%100!=0))
        {
            System.out.println("It Is a Leap Year");
        }
        else
        {
            System.out.println("It Is not a Leap Year");
        }
        
    } 
}
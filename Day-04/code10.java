// Write a java program to find the average of three numbers.
import java.util.Scanner;
public class code10 {

    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First integers");
        int a= sc.nextInt();
        System.out.println("Enter the Second integers");
        int b=sc.nextInt();
         System.out.println("Enter the Third integers");
        int c=sc.nextInt();
        sc.close();
        float result =(a+b+c)/3;
        System.out.println("The Average Of the Integers "+a+", "+b+", "+c+" are: "+result);

    }
}
// Write a java program to find whether the given integer is divisible by both 3  and 5.
import java.util.Scanner;
public class code19 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Integer :");
        int a= sc.nextInt();
        sc.close();
        if(a%3==0&& a%5==0)
        {
            System.out.println("The Number is divisble by both 3 & 5 ");
        }
        else
        {
            System.out.println("The number is not divisble by both 3&5");
        }
    }
    
}

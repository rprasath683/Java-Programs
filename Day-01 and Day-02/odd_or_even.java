import java.util.Scanner;
public class odd_or_even
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Integer : ");
        int integers = sc.nextInt();
        sc.close();
    if(integers%2==0)
    {
        System.out.println("The enterd number is even . ");

    }
    else
    {
       System.out.println("The enterd number is odd . ");  
    }
    }
    
    
}
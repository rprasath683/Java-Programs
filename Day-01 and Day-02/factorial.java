import java.util.Scanner;
public class factorial {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value : ");
        int i = sc.nextInt();
        sc.close();
        int n=1;
        for (int a = i ; a > 0;a-- )
        {
            n*=a;

        }
        System.out.println("The Factorial Of "+i+" is : "+n);
    }
    
}

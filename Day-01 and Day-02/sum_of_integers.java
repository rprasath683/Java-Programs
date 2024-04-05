import java.util.Scanner;
public class sum_of_integers {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Integer :");
        int val = sc.nextInt();
        sc.close();
        int sub = val;
        int result =0;
        int res = 0;
        int sub1 =0;
        while(sub>0)
        {
            int a = sub%10;
            result+=a;
            sub=sub/10;
            sub1= result;
            
             while(sub1>10)
        {
            int b= result%10;
            res+=b;
            sub1= sub1/10;

        }
        }
        
        

       
        
        System.out.println("The Sum Of Integers :"+res);
    }
}

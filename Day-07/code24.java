// What does the program output when a is greater than b or b is greater than a?
import java.util.Scanner;
public class code24{

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter The Value Of a:");

        int a =sa.nextInt();
        
        System.out.println("Enter The Value Of b:");
        int b=sa.nextInt();

        
        sa.close();
        if(a<b)
        {
            System.out.println(""+a+" is less than "+b+"");

        }
        else
        {
            System.out.println(""+a+" is greater than "+b+"");
        }

    }
}
// Write a java program to find the number of 2 and number of 5 present in the given number.

import java.util.Scanner;

public class code43{

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num= sc.nextInt();
        sc.close();
        int count=0;
        for(int i=2;i<=num;i++)
        {
            count=0;
            while(num%i==0)
            {
                count ++;
                num/=i;
            }
            if(count>0)
            {
                System.out.println(i+" : "+count);
            }
        }
    }
}
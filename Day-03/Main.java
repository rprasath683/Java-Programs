// Program for Binary to Decimal
public class Main {
    public static void main(String args[])
    {
        int a=100;
       // int temp=a;
        int count=0;
        int base=1;
        while(a>0)
        {
            int b=a%10;
            count= count + (b*base);
            a=a/10;
            base=2*base;
        }
        System.out.println(count);


    }
}


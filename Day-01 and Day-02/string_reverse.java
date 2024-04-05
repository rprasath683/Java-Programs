import java.util.Scanner;
public class string_reverse {
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        String rev="";
        sc.close();
        char[] arr= str.toCharArray();
        for(int i = arr.length-1;i>=0;i--)
        {
            rev+=arr[i];
        }
        System.out.println("The Reverse Of A String is :" +rev);

    }
}

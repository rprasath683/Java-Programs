// Write a java program to find whether the given String is palindrome or not.
import java.util.Scanner;

public class palindrome {
  
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The String :");

        String str = sc.nextLine(), reverseStr = "";
        sc.close();
   

    for (int i = str.length()-1; i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.equals(reverseStr)) {
      System.out.println(str + " is a Palindrome ...");
    }
    else {
      System.out.println(str + " is not a Palindrome ...");
    }
    }
}

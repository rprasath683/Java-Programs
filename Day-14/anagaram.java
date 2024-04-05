// Write a java to find whether given strings are anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class anagaram {
    
    public static void main (String [] args) { 
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter The First String :");
        String str1=sc.nextLine();  
        System.out.println("Enter The Second String :");
        String str2=sc.nextLine();  
        sc.close();
   
         
        if (str1.length() != str2.length())
         {  
            System.out.println("Both the strings are not anagram");  

            return;
        }  
        else {  
        
            char[] a = str1.toCharArray();  
            char[] b = str2.toCharArray();  
  
          
            Arrays.sort(a);  
            Arrays.sort(b);  
  
           
            if(Arrays.equals(a, b) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        } 
    } 
}

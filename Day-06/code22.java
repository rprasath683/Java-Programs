// write a java program to find whether the size of the pizza is small, medium or large . if the diameter is less than 10 then its small or the diameter is less than 20 then its medium else it is large.
import java.util.*;
public class code22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Diameter of pizza :");
        int a = sc.nextInt();
        sc.close();
       // x =(a>10)
       String y = (a<10 ) ? "Small" :(a<20 ? "Medium" : "Large") ;
       System.out.println("The Size Of The pizza is :"+y);
    }
    
}

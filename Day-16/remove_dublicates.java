// Write a java program to remove the duplicate values in the array.

import java.util.*;
public class remove_dublicates {
    public static void main(String[] args) {
        int arr[]={5,4,1,1,3,7,4,3};
        Arrays.sort(arr);
      int count=-1;
       
        for(int i=1;i<arr.length;i++)
        {
           
        
            count++;
             if(arr[i]!=arr[i-1])
             {
                System.out.println(arr[count]);
               
                
                
             }

            
            

        }
    }
    
}

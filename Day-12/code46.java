// Write a program for reversing a given array.
public class code46 {
    
    public static void main(String[] args) {
        
        int[]a={3,-1,2,6,5,9,7};
        int b;
       // int n= a.length;

        for(int i=0;i<a.length/2;i++)
        {
           b= a[i];
           a[i]=a[a.length-i-1];
           a[a.length-1-i]=b;

        }
        for(int j =0 ; j<a.length;j++)
        {
           System.out.println(a[j]);

        }
       
        
    }
}

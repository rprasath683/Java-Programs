// Write a Java program to create a class and access the elements in the class.
    class myclass {
    
    int a,b;
    
    
    
   }

   public class code13 {

    public static void main(String[]args)
    {
        myclass s= new myclass();

        s.a=10;
        s.b=20;
        System.out.println(s.a);
        System.out.println(s.b);
        myclass s1= new myclass();
        s1 = s;
        s1.a=11;
        s1.b=21;
         System.out.println(s.a);
        System.out.println(s.b);


    }



   
} 

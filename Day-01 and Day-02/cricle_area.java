public class cricle_area 
{

    public static void main(String[] args)
    {
        int rad= 10;
        area(rad);
       
    }
     public static void area(int radius)
        {
            int r= radius;

            double area = 3.14 * r*r;

            System.out.println("The area of the given circle is : "+area);
        }
    
}

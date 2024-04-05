public class sum_of_array {
    
    public static void main(String[] args)
    {
        int result =0;
        int[] array ={10,5,15,20};
        for (int i=0; i<= array.length-1; i++)
        {
            result +=array[i];

        }
        System.out.println("The Sum Of an Array is: "+ result);
    }
}

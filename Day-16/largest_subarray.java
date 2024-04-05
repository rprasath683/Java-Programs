// Write a java program to find the largest subarray present in the array without duplicate values.
public class largest_subarray{
   
	public static void array(int arr[], 
											int n)
	{
        //
		//   5, 6, 3, 5, 7, 8, 9, 1, 2
        //i= 1
		int a = 1, length = 1, maxIndex = 0;
		
		
		for (int i = 1; i < n; i++)
		{
			
			if (arr[i] > arr[i-1])
            {
                length ++;
            }
				
			else
			{
				
				if (a < length) 
				{
					a = length;
					
					
					maxIndex = i - a;
				}
					
				
				length = 1; 
			} 
		}
		
	
		if (a < length)
		{ 
			a = length;
			maxIndex = n - a;
		}
	
	
		for (int i = maxIndex; i < a+maxIndex; i++)
        {
            System.out.print(arr[i] + " ");
        }
			
	}
	
	
	public static void main(String[] args) 
	{
		int arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2};
		int n = arr.length;
		array(arr, n);
		
	}
}




// Write a java program to find whether the given sum is present in the subarray of an array using (O(n^2)) and o(n).
public class code44 {

    public static void main(String[] args) {
        
        int []arr={1,2,3,1,5,8,10};
        int sum=14;

        ////////////// O(n^2) Approch using Two For Loop /////////////
        for(int i=0;i<arr.length;i++)
        {
            int total=0;
            for(int j=i ; j<arr.length;j++)
            {
                total+=arr[j];
                if(total==sum)
                {
                    System.out.println("The sub array sum exist in the array");
                }
                
            }
        }

        ////////////// O(n) Approch using while loop /////////////

        int st=0;
        int end=0;
        int crr=arr[0];

        while(st<arr.length)
        {
            if(crr==sum)
            {
                System.out.println("Exists");
                break;
            }
            else if(crr<sum && end<arr.length)
            {
                end++;
                crr+=arr[end];

            }
            else 
            {
                crr-=arr[st];
                st++;
            }
        }
    }
    
}

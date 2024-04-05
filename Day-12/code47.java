// Java program to merge two arrays
public class code47 {
    
    public static void main(String[] args) {
        
        int a1[]= {1,3,4,6,8,10,11};
        int[]a2={2,3,3,5,7,8,9,10,11,12,13,14};
        int[]res = new int[a1.length+a2.length];
        int i=0,j=0,k=0;

        while(i<a1.length&& j<a2.length)
        {
            if(a1[i]<=a2[j])
            {
                res[k]=a1[i];
                i++ ;
                k++;

            }
            else
            {
                res[k]=a2[j];
                k++;
                j++;
            }
        }

        while(i<a1.length)
        {
            res[k++]=a1[i++];
        }
        while(j<a2.length)
        {
            res[k++]=a2[j++];
        }
        for(int a=0;a<res.length;a++)
        {
            System.out.println(res[a]);
        }
    }
}

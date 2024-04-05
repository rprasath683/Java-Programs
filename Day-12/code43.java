// Java Program To Find the Largest Two Numbers in A given array(O(n2))
public class code43
{
    public static void main(String args[])
    {
        int temp;
        int a[]={41,27,0,65,84,99,121,32};
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i]==0 && a[j]==0)
                {


                }
                else
                {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }}
            }
        }
         for(int i=1;i<3;i++)
        {
            System.out.println(a[i]);
        }
    }
}

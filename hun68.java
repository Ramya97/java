import java.util.*;
class hun68
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length-1;i++)
        {
                b[i]=(ar[i]-ar[i+1]);
                if(b[i]<0)
                {
                   b[i]=-(b[i]);
                }
        }
          Arrays.sort(b);
          System.out.println(b[n-1]);
    }
}


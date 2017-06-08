import java.util.*;
import java.io.*;
class happy
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        int sum=0;
        while(n>0)
        {
            k=n%10;
            sum=sum+(k*k);
            n=n/10;
            if(sum==1&&n==0)
            {
                System.out.println("True");
                break;
            }
            if(n==0&&sum!=1)
            {
                n=sum;
                sum=0;
            }
        }
    }
}

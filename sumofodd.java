import java.util.*;
class sumofodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] b=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
b[i]=sc.nextInt();
if(b[i]%2!=0)
sum=sum+b[i];
}  
System.out.println(sum);
}
}

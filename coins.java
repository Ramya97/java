import java.util.*;
class coins
{
public static void  main(String args[])
{
Scanner s=new Scanner(System.in);
int amount=s.nextInt();
int count=0;
int n1=s.nextInt();
int a[]=new int[n1];
for(int i=0;i<n1;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i=a.length-1;i>=0;i--)
{
count=count+amount/a[i];
amount=amount%a[i];
}
System.out.println(count);
}
}
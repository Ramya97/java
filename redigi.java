import java.util.*;
class redigi
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=a;
int k=0;
while(a>0)
{
k=a%10;
a=a/10;
System.out.println(k);
}
}
}

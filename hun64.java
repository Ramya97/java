import java.util.*;
class hun64
{
public static void  main(String args[])
{
Scanner s=new Scanner(System.in);
int amount=s.nextInt();
int c=0;
int array1[]={500,100,50,10,1};
for(int k=0;k<5;k++)
{
c=c+amount/array1[k];
amount=amount%array1[k];
}
System.out.println("count="+c);
}
}

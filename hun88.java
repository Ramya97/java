import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
class hun88
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character> hp=new LinkedHashSet<Character>();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            hp.add(s.charAt(i));
        }
        for(char c:hp)
        {
            s1=s1+String.valueOf(c);
        }
        StringBuffer sb=new StringBuffer(s1);
        System.out.print(sb.reverse());
    }
}

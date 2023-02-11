import java.io.*;
import java.util.*;
class UserMaincode
{
   public String indentifyPossibleWords(String input1, String input2)
{
        String s1[]=input2.split(":");
        String s2="";
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].length()!=input1.length())
                continue;
            String test=input1;
            int x=test.indexOf("_");
            char ch=s1[i].charAt(x);
            test=test.replace('_', ch);
            test=test.toUpperCase();
            s1[i]=s1[i].toUpperCase();
            if(s1[i].equals(test))
            {
                if(s2=="")
                {
                    s2=s2+test;
                }
                else
                {
                    s2=s2+":"+test;
                }
            }
        }
        if(s2=="")
            s2="ERROR-009";
        return s2;
}
}
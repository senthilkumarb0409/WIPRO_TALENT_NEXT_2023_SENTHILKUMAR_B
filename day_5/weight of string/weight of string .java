import java.io.*;
import  java.util.*;
class UserMainCode
{
public int weightOfString(String input1,int input2)
{
        String s=input1.toUpperCase();
        int sum=0;
        for(int i=0;i<input1.length();i++)
        {
          if(input2==0)
          {
        if(s.charAt(i)=='A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || !Character.isLetter(s.charAt(i)))
              {
                  continue;
              }
              else
              {
                  int a=s.charAt(i)-64;
                  sum+=a;
              }
          }
          else
          {
              if(!Character.isLetter(s.charAt(i)))
                  continue;
              else
              {
                  int a=s.charAt(i)-64;
                  sum+=a;
              }
          }
        }
        return sum;
    }
}
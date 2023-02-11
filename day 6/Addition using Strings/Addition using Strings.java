import java.io.*;
import java.util.*;
class UserMainCode
{
public int addNumberString(String input1,String input2)
{
  int c=0;
  if(input1.length()<input2.length())
  {
    String temp="";
    temp=input1;
    input1=input2;
    input2=temp;
  }
  int l1=input1.length();
  int l2=input2.length();
  String s="";
  int j=l2-1;
  for(int i=0;i<l1;i++)
  {
    int a=Character.getNumericValue(input1.charAt(l1-1-i));
    int b=0;
    if(j>=0)
    {
     b=Character.getNumericValue(input2.charAt(j));
     j--;
    }
    int sum=a+b+c;
    c=sum/10;
    int init=sum%10;
    s=Integer.toString(init)+s;
    if(i==l1-1 && c>0)
    {
               s=Integer.toString(c)+s;
    }
   }
   return s;
  }
 }
import java.io.*;
import  java.util.*;
class UserMainCode
{
public int mostFrequentlyOccurringDigit(int[] input1,int input2)
{
  int[] a=new int[10];
  for(int i=0;i<input2;i++)
  {
    while(input1[i]!=0){
    int rem=input1[i]%10;
    a[rem]++;
    input1[i]/=10;
   }
 }
 int max=0;
 int freq_number=0;
 for(int i=0;i<10;i++)
 {
  if(a[i]>=max)
  {max=a[i];
      freq_number=i;
  }
 }
 return freq_number;
}
}
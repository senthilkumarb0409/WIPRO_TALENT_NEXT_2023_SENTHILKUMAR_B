import java.io.*;
import java.util.*;
class UserMainCode
{
 public class Result
  {
    public final int output1;
    public final int output2;
    public Result(int out1,int out2)
  {
    output1=out1;
    output2=out2;
  }
  }
  public Result findOriginalFirstAndSum(int[] input1,int input2)
  {
   int[] a=new int[input2];
   a[input2-1]=input1[input2-1];
   int sum=a[input2-1];
   for(int i=input2-2;i>=0;i--)
   {
      a[i]=input1[i]-arr[i+1];
      sum+=a[i];
   }
   Result r1= new Result(a[0],sum);
   return r1;
  }
}
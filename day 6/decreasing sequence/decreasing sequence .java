import java.util.*;


class UserMainCode
{
public class Result{
 public final int output1;
 public final int output2;
 public Result(int out1,int out2)
 {
  output1=out1;
  output2=out2;
 }
}
public Result decreasingSeq(int[] input1,int input2)
{
        int s1=0,s2=0,max=0;
        for(int i=0;i<input2-1;i++)
        {
            if(input1[i]>input1[i+1])
            {
                s1++;
            }
            if((input1[i]<input1[i+1] && s1!=0) || ((i==input2-2) && s1!=0))
            {
                if(max<s1)
                {
                    max=s1;
                }
                s2++;
                s1=0;
            }
        }
        max=max+1;
        if(s2==0)
        {
            max=0;
        }
        if(input2==0)
        {
            max=0;
            s2=0;
        }
        Result r1= new Result(s2,max);
        return r1;
}
}
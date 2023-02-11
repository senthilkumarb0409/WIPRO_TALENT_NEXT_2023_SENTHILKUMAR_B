import java.io.*;

import  java.util.*;

class UserMainCode{

public int sumOfSumsOfDigits(int input1){             

String s=Integer.toString(input1); 

int sum=0; 
for(int i=0;i<s.length();i++)  {   
 for(int j=i;j<s.length();j++){   

int num=Character.getNumericValue(s.charAt(j));   

sum+=num;  
}
} 

  return sum; 

}
}
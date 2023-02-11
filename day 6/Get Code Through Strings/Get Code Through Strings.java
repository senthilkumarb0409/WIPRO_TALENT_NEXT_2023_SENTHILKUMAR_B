import java.io.*;
import java.util.*;
class UserMainCode{
public int getCodeThroughString(String input1){
String s[]=input1.split(" ");  
int sum=0;  
for(int i=0;i<s.length;i++)  
{          
sum+=s[i].length();  
}   
return (1 + (sum-1) %9); 
}
}

import java.io.*;
import  java.util.*;
class UserMainCode
{
public int isPalindrome(String input1){
        String s=input1.toLowerCase();
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        if(s.equals(s1))
        return 2;
        else
        return 1;
    }
}
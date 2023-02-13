import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static Scanner scan=new Scanner(System.in);

static int B ;
static int H ;
static boolean flag;
static
{
    B = scan.nextInt();
    H = scan.nextInt();
    if(B>0 && H>0)
    {
        flag=true;
    }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


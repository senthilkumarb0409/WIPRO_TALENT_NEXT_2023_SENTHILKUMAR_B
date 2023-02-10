import java.io.*;
import  java.util.*;
class UserMainCode{

public String secondWordUpperCase(String input1){

String strArray[] = input1.split(" ");        

String s="LESS";        

if(strArray.length==1) {            

return s;        

}        

return strArray[1].toUpperCase();   

 }
}
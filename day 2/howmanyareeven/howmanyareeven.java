import java.util.*;
import java.io.*;
class UserMainCode{
    public innt countEvens(int input1, int input2, int input3, int input4, int input5){
        int c=0;
        if(input1%2==0)
        c++;
        if(input2%2==0)
        c++;
        if(input3%2==0)
        c++;
        if(input4%2==0)
        c++;
        if(input5%2==0)
        c++;
        return c;
    }
}
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            System.out.print((a=a+b) +" ");
            for (int j = 0; j < n-1; j++) {
                System.out.printf("%d ", (a = a + (b = 2 * b)));
            }
            System.out.println();
        }
        in.close();
    }
}

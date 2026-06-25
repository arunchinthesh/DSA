/*
Teena is fond of patterns, but she needs your help to solve the below pattern. Given n as input, teena wants you to print the below pattern.
Input Format
n = 5
Constraints
1<=n<=100

Output Format
12345
678910
1112131415
1617181920
2122232425
*/
import java.io.*;
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(count);
                ++count;
            }
            System.out.println();
        }        
        
    }
}

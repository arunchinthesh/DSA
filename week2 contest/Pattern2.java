/*
Given an integer N, you need to print the following pattern.
Input Format
5
Constraints
1 <= n <= 100
Output Format
12345
22345
33345
44445
55555
  */
import java.io.*;
import java.util.*;

public class Pattern2{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            int count=i;
            for(int j=1;j<=n-i;j++){
             ++count;
             System.out.print(count);   
            }
            System.out.println();
        }
        }
        
    }

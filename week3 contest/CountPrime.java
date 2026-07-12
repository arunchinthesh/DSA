/*
Alex is found of numbers, he found a new pattern of numbers called prime numbers. 
A prime number is a number which is divisible by one or the number itself. Now he wants
your help in finding the number of prime numbers until a given number. 1 is neither prime nor 
composite so shouldn't be considered as prime.
Input Format
n = 7
Constraints
1<=n<=1000
Output Format
4
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int count=0;
       for(int i=2;i<=n;i++){
        boolean flag=true;
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                flag=false;
            }
        }
            if(flag){
                ++count;
            
        }
       }
       System.out.print(count);
    }
}

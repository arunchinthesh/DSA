/*
Given an array, print the sum or even values in the array.
Example n = 5 arr = [2, 3, 5, 6, 8]
Output: 16
So here the even values are 2,6, 8. So sum of them is 16.
Input Format
n = 5 arr = [2, 3, 5, 6, 8]
Constraints
1<=n<=1000
Output Format
16
Sample Input 0
5
1 2 3 4 5
Sample Output 0
6
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
      }
      int sum=0;
      for(int x:arr){
        if(x%2==0){
            sum+=x;
        }
      }
      System.out.println(sum);
    }
}

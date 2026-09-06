/*
Given two arrays (Get first input for one array and then again get for the other array), find if the product of two array are same. If same, print 1 else print 0. First get n which is the number of elements in both the array(both arrays has same number of elements)
Example - arr1 = [4, 1, 3, 9, 3] arr2 = [2, 9, 4, 4, 2]
Output: 0
Explanation: Product of arr1 = 4* 1* 3* 9* 3 = 324 Product of arr2 = 2* 9* 4* 4* 2 = 576 So 324 is not equal to 576
Input Format
n = 5 arr1 = [4, 1, 3, 9, 3] arr2 = [2, 9, 4, 4, 2]
Constraints
0<=n<=1000
Output Format
0
*/
import java.io.*;
import java.util.*;

public class ArrayEqual {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }
        int prod1=1;
        int prod2=1;
        for(int x:arr1){
            prod1*=x;
        }
        for(int x:arr2){
            prod2*=x;
        }
        if(prod1==prod2){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}

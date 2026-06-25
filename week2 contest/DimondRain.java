/*
Rex loves diamonds and today he wants diamonds to be printed using code. He will give you a number n and you should print a diamond for him as below based on n.
Input Format
n = 5
Constraints
1<=n<=1000
Output Format

    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *
  */
import java.io.*;
import java.util.*;

public class DimondRain {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-(n-2);j++){
            System.out.print("*");
        }
        System.out.println();
     }
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");    
        }
        for(int j=1;j<=(n*2+1)-2*i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
     
     
     
     
    }
}

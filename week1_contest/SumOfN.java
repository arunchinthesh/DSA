/*Write a program which takes a value N and prints the sum of N natural numbers. Natural numbers start from 1.
Explanation: Sum of natural numbers from 1 to N, here N is 5, so 1+2+3+4+5 is 15. Input N = 5; Expected output : 15
Input Format
5
Constraints
1<= N <= 10^2
Output Format
15
*/
public class Solution {
import java.util.*;
   public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int sum=0;
   for(int i=0;i<=n;i++){
    sum +=i;
   }
   System.out.println(sum);
   
    }
}

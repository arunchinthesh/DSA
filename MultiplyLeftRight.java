/*
Pitsy needs help with the given task by her teacher. The task is to divide an array into two halves (left and right) containing n/2 elements each and do the sum of the each. half and then multiply both the sum. In case of odd number of elements, include the odd one in the second half.
Example1: arr =[1,2,3,4] Array has 4 elements so half is going to be 2 elements each, First half sum = 1 + 2 = 3 Second half sum = 3+ 4 = 7 So now to multiply them = 3 * 7 = 21
Example2: arr =[5,3,9,12,3] Array has 4 elements so half is going to be 2 elements each, First half sum = 5 + 3 = 8 Second half sum = 9 + 12 + 3 = 24 So now to multiply them = 8 * 24 = 192
Note: If the length of the array is odd then the right half will contain one element more than the left half.
Input Format
n=4, arr[ ] = {1, 2, 3, 4}
Constraints
1 ≤ n ≤ 1000 1 ≤ a[i] ≤ 100
Output Format
21
Sample Input 0
4 
1 2 3 4
Sample Output 0
21
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        
        int n = s.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }

        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;

        // Sum the first half
        for (int i = 0; i < mid; i++) {
            leftSum += arr1[i];
        }

        // Sum the second half (includes the extra element when n is odd)
        for (int i = mid; i < n; i++) {
            rightSum += arr1[i];
        }

        System.out.println(leftSum * rightSum);
    }
}

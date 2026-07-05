/*
Given a positive integer n, find the number of perfect squares that are less than n in the sample space of perfect squares. The sample space consists of all perfect squares starting from 1 (i.e., 1, 4, 9, 16, 25, …)
Examples :
Input: n = 9
Output: 2
Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.
*/
class Solution {
    static int countSquares(int n) {
        int count=0;
       for(int i=1;i*i<=n;i++){
           int square=i*i;
           if(square<n){
               ++count;
           }
       }
       return count;
    }
}

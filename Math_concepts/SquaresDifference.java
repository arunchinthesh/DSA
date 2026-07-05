/*
Given an integer n, find the absolute difference between sum of the squares of first n natural numbers and square of sum of first n natural numbers.
Examples:
Input: n = 2
Output: 4 
Explanation: abs|(12 + 22) - (1 + 2)2| = 4.
*/

class SquaresDifference
 {
    public int squaresDiff(int n) {
        int square_sum=0,sum_square=0,sum=0;
        for(int i=1;i<=n;i++){
            square_sum+=i*i;
            sum+=i;
        }
        sum_square=sum*sum;
        int diff=Math.abs((square_sum-sum_square));
        return diff;
    }
}

/*
Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
Examples:
Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
*/
class SumofNaturalNumberCubes {
    int sumOfSeries(int n) {
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i*i*i;
    }
    return sum;
    }
}

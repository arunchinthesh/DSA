/*
Given a number N.Find the sum of fifth powers of natural numbers till N i.e. 15+25+35+..+N5.
Example 1:
Input:
N=2
Output:
33
Explanation:
The sum is calculated as 15+25=1+32=33.
  */

//use long for for loop and sum as the answers could be large
class SumOfFifthPowers {
    long sumOfFifthPowers(long N) {
long sum=0;
        for(long i=1;i<=N;i++){
          sum += i*i*i*i*i;
        }
        return sum;
    }
}

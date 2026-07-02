/*Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…
Examples:
Input: n = 4 
Output: 10
Explanation: The 4th term of the Series is 10.
*/
class NthTerm {
    static int findNthTerm(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
        
    }
}

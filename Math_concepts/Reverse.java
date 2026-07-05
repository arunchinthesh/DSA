/*
You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.
Examples:
Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.
*/
class Reverse {
    public static void main(String[] args) {
        int n=12345;
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println(rev);
        
    }
}

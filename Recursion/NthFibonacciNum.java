class Solution {
    static int nthFibonacci(int n) {
    if(n==0) return 0;
     else if(n==1) return 1;
      else{
          int left=nthFibonacci(n-1);
          int right=nthFibonacci(n-2);
return left+right;
      }   
    }
}

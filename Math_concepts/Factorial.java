//from n to 1
class Factorial {
    int factorial(int n) {
        int fact=1;
     while(n>0){
          fact=fact*n;
        --n;
     }
     return fact;
    }
}

//from 1 to n
class Solution {
    int factorial(int n) {
        int fact=1;
      for(int i=1;i<=n;i++){
          fact*=i;
      }
      return fact;
    }
}

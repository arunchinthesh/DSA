//use Math.abs(n) for negative value.
class Palindrome{
    public boolean isPalindrome(int n) {
        n=Math.abs(n);
        int rev=0;
        int original=n;
     while(n>0){
         rev=rev*10+(n%10);
         n=n/10;
     } 

     if(rev==original){
         return true;
     }
     else{
         return false;
     }
        
    }
}

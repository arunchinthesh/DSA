class Solution {
    public int cornerDigitSum(int n) {
        int last=0;
        int sum=n%10;
        while(n>0){
            last=n%10;
            n=n/10;
        }
        int first=last;
        sum+=first;
        return sum;
    }
}

class Solution {
    static long kthDigit(int a, int b, int k) {
        long power=(long)Math.pow(a,b);
        int count=0;
        while(power>0){
            long last=power%10;
            power=power/10;
            ++count;
            if(k==count){
                return last;
            }
        }
        return -1;
    }
}

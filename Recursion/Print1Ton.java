class Solution {
    int count=1;
    public void printTillN(int n) {
        if(count<=n){
        System.out.print(" "+count);
        ++count;
        printTillN(n);
        }
        else{
            return;
        }
        
    }
}

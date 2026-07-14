class Solution {
    public void printTillN(int n) {
        if(n==0){
            return;
        }
        else{
            printTillN(n-1);
            System.out.print(" "+n);
        }
        
         }
}

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

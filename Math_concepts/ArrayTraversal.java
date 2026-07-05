class Solution {
    public static void arrayTraversal(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}


//for each loop should only contain name of variable not [] and all
class Solution {
    public static void arrayTraversal(int[] arr) {
        for(int x:arr){
            System.out.print(" "+x);
        }
        
    }
}

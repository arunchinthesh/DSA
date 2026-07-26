class ArrayTraversal{
   static void array(int[] arr,int n,int i){
       if(i>n-1){
           return;
       }
       else{
       System.out.print(" "+arr[i]);
       ++i;
       array(arr,n,i);
   }
   }
    public static void main(String[] args) {
       int[] arrr={1,3,5,7,8,9,6,2};
       array(arrr,8,0);
    }
}

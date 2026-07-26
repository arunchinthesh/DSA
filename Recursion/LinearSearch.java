class LinearSearch{
    static int i=0;
    static int LinearSearch(int[] arr,int x){
        int n=arr.length;
        if(i>n-1){
            System.out.println("not found");
            return -1;
        }
        else{
            if(arr[i]==x){
                return i;
            }
            else{
                ++i;
               return LinearSearch(arr,x);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(LinearSearch(new int[]{1,2,3,4,5},3));
        
    }
}

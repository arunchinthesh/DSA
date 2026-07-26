class SumOfArray {
    static int sum=0,i=0;
    static void sumofarray(int[] arr){
    int n=arr.length-1;
    if(i>n){
        return;
    }
    else{
        sum+=arr[i];
        ++i;
        sumofarray(arr);
    }
    }
    public static void main(String[] args) {
        sumofarray(new int[]{1,2,3});
        System.out.println(sum);
    }
}

/*
Given a range [L, R]. The task is to find the sum of all the prime numbers
in the given range from L to R both inclusive.
  */
class SumPrime{
    static int prime(int left,int right){
        int sum=0;
        int[] arr=new int[right+1];
        for(int i=2;i<=Math.sqrt(right);i++){
            for(int j=i*2;j<=right;j=j+i){
                arr[j]=1;
            }
        }
        for(int i=left;i<=right;i++){
            if(arr[i]==0&&i>=2){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(prime(10,20));
    }
}

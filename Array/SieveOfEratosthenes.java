class Solution {
    public ArrayList<Integer> sieve(int n) {
    ArrayList<Integer> result =new ArrayList<>();
    int[] arr=new int[n+1];
    for(int i=0;i<n;i++){
        arr[i]=0;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        for(int j=i*2;j<=n;j=j+i){
            arr[j]=1;
        }
    }
    for(int i=2;i<=n;i++){
        if(arr[i]==0){
            result.add(i);
        }
    }
    return result;
    }
}

  

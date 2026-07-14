class Main {
    static int sum=0;
    static void sumofn(int n){
        if(n==0){
           return;
    }
    else{
         sum+=n;
         sumofn(n-1);
    }
    }
    public static void main(String[] args){
        sumofn(4);
        System.out.println(sum);
    }
}

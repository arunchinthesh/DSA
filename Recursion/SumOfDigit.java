class Main {
   static int sum=0;
    static void sum(int n){
        if(n==0){
            return;
        }
        else{
            sum+=n%10;
            sum(n/10);
        }
    }
    public static void main(String[] args) {
        sum(123);
        System.out.println(sum);
    }
}

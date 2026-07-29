class FindDivisors {
    static int i=1;
    static void divisor(int n){
        if(i>Math.sqrt(n)){
            return;
        }
        else{
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
            ++i;
            divisor(n);
        }
    }
    public static void main(String[] args) {
    divisor(6);
    }
}

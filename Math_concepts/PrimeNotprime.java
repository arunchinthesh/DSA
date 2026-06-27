class PrimeNotprime{
    static boolean isPrime(int n) {
        boolean prime=true;
        if(n<=1){
            prime=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
            }
        }
        if(prime){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}

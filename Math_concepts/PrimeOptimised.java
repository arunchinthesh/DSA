//iterate i till sqrt of n, since the secnd half is the same as 1st half
class PrimeOptimised {
    public static void main(String[] args) {
int n=36;
int flag=1;
for(int i=2;i<=Math.sqrt(n-1);i++){
    if(n%i==0){
        flag=0;
    }
}
if(flag==0){
    System.out.println("not prime");
}
else{
       System.out.println("prime");
 
}
    }
}

//sum of the proper divisors (all divisors except the number itself) equals the number, then those are called perfect numbers
//***set sum =1 and avoid i=1 in loop initialization bacause when i=1, n%1=0 so we sum 1 also the condition if(i!=n/i) become ture and add n/i
class PerfectSquare {
    public static void main(String[] args) {
int sum=1;
int n=28;
for(int i=2;i<=Math.sqrt(n-1);i++){
    if(n%i==0){
        sum+=i;
        if(i!=n/i){
            sum+=n/i;       
            }
    }
}
System.out.println(sum);
if(n==sum){
    System.out.println("perfect square");
}
else{
        System.out.println("not a perfect square");

}
    }
}

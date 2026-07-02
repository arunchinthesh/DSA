//sum of series 1 + (1+2) + (1+2+3) + (1+2+3+4)
class NthTerm2{
    public static void main(String[] args) {
int n=5,sum=0,series=0;
for(int i=1;i<=n;i++){
    sum+=i;
    series+=sum;
}
System.out.println(series);
}
}

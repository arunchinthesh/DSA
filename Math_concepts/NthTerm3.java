//1+(1+3)+(1+3+5)
class NthTerm3 {
    public static void main(String[] args) {
int n=3,series=0;
for(int i=1;i<=n;i++){
    int sum=0;
    sum=sum+(i*i);
    series+=sum;
}
System.out.println(series);
}
}

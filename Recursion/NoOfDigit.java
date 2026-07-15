class NoOfDigit{
static int countdigit(int n){
if(n%10==n) return 1;
else{
  int digit=n%10;
  return 1+countdigit(n/10);
}
}
public static void main(String[] args){
System.out.println(countdigit(1234));
}
}

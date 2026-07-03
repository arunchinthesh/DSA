class OddSeriesSum {
    public static void main(String[] args) {
        int n = 3;
        int odd = 1;
        int sum = 1;
        int series_sum = 0;

        for (int i = 1; i <= n; i++) {
            series_sum += sum;
            odd = odd + 2;
            sum = sum + odd;
        }
        
        System.out.println(series_sum);
    }
}

//2nd approach since 1 + (1+3) + (1+3+5) which is 1^2 +2^2
class Main {
    public static void main(String[] args) {
        int n = 3,sum=0,tot=0;
        for(int i=1;i<=n;i++){
            sum=i*i;
            tot+=sum;
        }
    System.out.println(tot);
    }
}

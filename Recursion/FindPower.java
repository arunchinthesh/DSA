class Findpower {
    static int i=1,pow=1;
    static void power(int a,int b){
        if(i>b){
            return;
        }
        else{
            pow*=a;
            ++i;
            power(a,b);
        }
    }
    public static void main(String[] args) {
    power(2,2);
    System.out.println(pow);    
    }
}

import java.io.*;
import java.util.*;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int n=s.nextInt();
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.print(sum);
    }
}

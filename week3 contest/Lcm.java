//LCM=n1*n2/gcd(n1,n2)
import java.io.*;
import java.util.*;

public class Lcm {
static int findgcd(int a,int b){
    while(b>0){
    int temp=b;
    b=a%b;
    a=temp;
    }
    return a;
}
   
public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n1=s.nextInt();
       int n2=s.nextInt();
       int gcd=findgcd(n1,n2);
       int lcm=n1*n2/gcd;
       System.out.print(lcm);  
    }
}

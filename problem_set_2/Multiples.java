/*Prob 2:
Write a program to take x and print multiples of x till 1000.
*/
import java.util.*;
class Multiples{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number :");
        int x=s.nextInt();
        int i=1;
        int m=0;
        while(m!=1000){
        m=x*i;
        System.out.println(+m);
        i++;
            }
    }
}

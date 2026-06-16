/*Prob 1:
Write a program which takes two values x and y. Prints x for y number of time
*/
import java.util.*;
class prob1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to be repeated");
        int x=s.nextInt();
        System.out.println("enter the number of times it should be repeated");
        int y=s.nextInt();
        for(int i=0;i<y;i++){
            System.out.println(+(i+1)+" :"+x);
        }
    }
}

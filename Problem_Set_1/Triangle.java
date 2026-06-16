//Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
import java.util.*;
class Triangle{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter 3 angles of the triangle ");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int sum=a+b+c;
    if(sum==180){
         System.out.println("it is a triangle");
    }
    else{
         System.out.println("not a triangle");
    }
  }
}

import java.util.*;
class InputOutput{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a integer, string and a charecter ");
    int a=s.nextInt();
    s.nextLine();
    String str=s.nextLine();
    char c=s.next().charAt(0);
    System.out.println("integer :"+a);
    System.out.println("string :"+str);
    System.out.println("charecter :"+c);
  }
}

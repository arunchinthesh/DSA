import java.util.*;
class ArrayInput{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of element");
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("enter the elements");
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  }
}

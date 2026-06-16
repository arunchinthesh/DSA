/*Prob 3:
Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
*/
import java.util.*;
class FirstLastName{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the 1st name");
        String first=s.nextLine();
        System.out.println("enter the 2nd name");
        String second=s.nextLine();
        System.out.println("enter the number of times it should be repeated");
        int n=s.nextInt();
        String full=first + second;
        for(int i=0;i<n;i++){
            System.out.println(full);
        }
        
    }
}

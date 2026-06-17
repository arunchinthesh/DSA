/*Write a program which takes the following input and prints them one by one. 1. An whole number 2. A letter 3. A number with fractional part 4. A word
Input Format
34 S 56.1 PowerRanger
Constraints
2 ≤ whole numer ≤ 10^6
Output Format
34
S
56.1
PowerRanger
*/
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int whole=s.nextInt();
        char letter=s.next().charAt(0);
        double fraction=s.nextDouble();
        s.nextLine();
        String word=s.nextLine();
System.out.println(whole);
System.out.println(letter);
System.out.println(fraction);
System.out.println(word);

        
    }
}

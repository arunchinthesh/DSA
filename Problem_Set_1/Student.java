/*Prob 3: Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greaer than or equal to 35
Fail if mark is lesser than 35
*/
import java.util.*;
class Student{
    public static void main(String[] args){
        int mark=90;
        if(mark>=90){
            System.out.println("GRADE :A");
        }
        else if(mark>=80){
                        System.out.println("GRADE :B");

        }
        else if(mark>=60){
                        System.out.println("GRADE :C");

        }
        else if(mark>=35){
                        System.out.println("GRADE :D");

        }
        else if(mark<35){
                        System.out.println("FAIL");

        }
    }
}

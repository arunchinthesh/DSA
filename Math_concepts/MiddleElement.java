/*Given three distinct numbers a, b and c. Find the number with a value in the middle (Try to do it with minimum comparisons).
Examples :
Input: a = 978, b = 518, c = 300
Output: 518
Explanation: Since 518>300 and 518<978, so 518 is the middle element.
*/
class MiddleElement {
    int middle(int a, int b, int c) {
        if((a>b)&&(a>c)){
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
      if((b>a)&&(b>c)){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
       else{
            if(a>b){
                return a;
            }
            else{
                return b;
            }
        }
   }
}

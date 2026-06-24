/*
Write a program that gets n as input and print the number of digits in the number
Testcase 1 :
Input : 
325345
Expected output:
6
*/


class NumOfDigit {
    public static void main(String args[]){
   int count=0; 
   int n=12304;
   while(n>0){
      n=n/10;
      ++count;
   }
   System.out.println(count);
}
}

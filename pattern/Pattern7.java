/*Write a Program which takes input n and prints the below pattern and upload the code to your github repo.
Sample 1:
Input:
n = 4
Expected output:
4321
321
21
1
*/
class Pattern7 {
    public static void main(String[] args) {
        int n=6;
for(int i=1;i<=n;i++){
    for(int j=n-i+1;j>=1;j--){
        System.out.print(j);
    }
    System.out.println();
}
        
        
    }
}

/*
Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, 
and minimum element of the second array arr2.
Examples :
Input : arr1[] = [5, 7, 9, 3, 6, 2],  arr2[] = [1, 2, 6, 1, 9]
Output : 9
*/
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>min){
                min=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<max){
                max=arr2[i];
            }
        }
        return max*min;
    }
}

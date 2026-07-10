/*
Given an array arr[]. Your task is to find the minimum and maximum elements in the array.
Examples:
Input: arr[] = [1, 4, 3, 5, 8, 6]
Output: [1, 8]
Explanation: minimum and maximum elements of array are 1 and 8.
*/
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        result.add(max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        result.add(min);
        
        
        
        return result;
    }
}

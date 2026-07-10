/*
You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).
Examples:
Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 3 5
*/
class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            result.add(arr[i]);
        }
        return result;
    }
}

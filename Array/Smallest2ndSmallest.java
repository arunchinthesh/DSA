/*
Given an array, arr[] of integers, your task is to return the smallest and second smallest element in the array. 
If the smallest and second smallest do not exist, return -1.
*/



class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
     ArrayList<Integer> result=new ArrayList<>();
     int num=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]<num){
             num=arr[i];
         }
     }
     result.add(num);
     num=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]<num&&arr[i]!=result.get(0)){
             num=arr[i];
         }
     }
          result.add(num);
if(num==Integer.MAX_VALUE){
    result.clear();
    result.add(-1);
}
return result;
    }
}

class Solution {
    public static boolean isPalindrome(int[] arr) {
        int arr2[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){         //array start from 0 till n-1
            arr2[j]=arr[i];
            ++j;
            }
        return Arrays.equals(arr,arr2);
    }
}

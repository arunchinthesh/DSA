//since it is int it should return the results

class CountOddandEven {
    public int[] countOddEven(int[] arr) {
        int countodd=0,counteven=0;
        int result[]=new int[2];    //here mention size so noth from 0
        for(int x:arr){
            if(x%2==0){
                ++result[1];
            }
            else{
                ++result[0];
            }
        }
return result;
    }
}


class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
         int even=0,odd=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
        even++;
        }
        else
        {
            odd++;
        }
    }
    return new int[]{odd,even}; //new way
    }
}

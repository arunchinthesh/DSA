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

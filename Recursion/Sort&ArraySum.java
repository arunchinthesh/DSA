class Main {
    static int sumofarray(int[] arr, int i) {
        if (i >arr.length-1) {
            return 0;
        }
        return arr[i] + sumofarray(arr, i + 1);
    }
    static int j=0;
    
    static int sort(int[] arr){
    if(j>=arr.length-1){
        return 1;
    }
    else{
        if(arr[j]<=arr[j+1]){
        ++j;
        return sort(arr);
        }   
        else{
        return 0;
        } 
}
}
    public static void main(String[] args) {
        System.out.println(sumofarray(new int[]{1, 2, 3}, 0));
        System.out.println(sort(new int[]{1,3 , 3}));
        
    }
}

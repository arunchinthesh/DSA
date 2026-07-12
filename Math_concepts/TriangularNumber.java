class Solution {
    int isTriangular(int n) {
        long doubled = 2 * n;
        
        long k = (long) Math.sqrt(doubled);
        
        if (k * (k + 1) == doubled) {
            return 1;
        }
        
        return 0; 
        
    }
}

/*
n=k(k+1)/2
2n=k(k+1) if = it is triangular
*/

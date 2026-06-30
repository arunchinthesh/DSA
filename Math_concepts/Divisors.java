class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisor=new ArrayList<Integer>();
        for(int i=1;i*i<=n;i++){     //i*i because we r considering root n meaning the loop will run only to its half hence reduce time complexity
                                     //we can also use Math.sqrt(n) instead of i*i
            if(n%i==0){
                divisor.add(i);
                if(i!=n/i){                                 //to check if the divident and divisors are the same that is 6*6=36           
                    divisor.add(n/i);
                }
            }
        }
        Collections.sort(divisor);
        return divisor;
        
    }
}

// if time comlexity is not an issue we can just use a for loop to iterate through int from 1 to n.

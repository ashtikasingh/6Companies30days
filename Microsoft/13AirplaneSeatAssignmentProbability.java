class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if(n>=2){
            return (double) 1/2;
        }else{
            return (double) 1/n;
        }
        
    }
}
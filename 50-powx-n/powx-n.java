class Solution {
    public double myPow(double x, int n) {
        long y = n;
        if(y<0){
            x=1/x;
            y=Math.abs(y);
        }
        if(y==0) return 1;
        double half = myPow(x,(int)(y/2));
        if(y%2==0){
            return half*half;
        }
        return half*half*x;
    }
}
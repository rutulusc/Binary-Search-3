// S30 Big N Problem #85 {Medium}
// 50. Pow(x, n)
// Time Complexity :O(log n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
// Recursive solution
class Solution {
    //speedy power calculation O(log n)
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0) return 1/x*myPow(1/x,-(n+1));
        else{
            if(n%2==0){
                return myPow(x*x,n/2);
            }else{
                return x*myPow(x*x,n/2);
            }
        }
    }
}
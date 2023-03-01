class Solution {
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        for(int i=0;i<len;i++){
            int ps=mat[i][i];
            int ss=mat[i][len-i-1];
            sum=sum+ps+ss;
        }
        if(len%2==0){
            return sum;
        }
        else{
            return sum-mat[len/2][len/2];
        }
    }
}

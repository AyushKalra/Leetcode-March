class Solution {
    public int maxEnvelopes(int[][] envelopes) {
    int ans = 1;

        Arrays.sort(envelopes, (a,b) -> (a[0] - b[0]));

        int len = envelopes.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for(int i=0;i<len;i++){ 
            for(int j=0;j<i;j++){
                if(envelopes[i][0] > envelopes[j][0] &&  envelopes[i][1] > envelopes[j][1]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans= Math.max(ans, dp[i]);
        }
        return ans;
    

    }
}
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[]dp = new int[n+1];
        Arrays.fill(dp,1);
        int maxLIS = 1;
        for(int i=0; i<n;i++){
            for(int j=0; j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]= Math.max(dp[i],dp[j]+1);
                    maxLIS = Math.max(maxLIS,dp[i]);
                }
            }
        }
       return maxLIS;
    }
    
}

// dp[i]  Longest increasing subsequence value till index i
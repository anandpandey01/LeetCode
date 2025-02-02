class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k=k%n;
        int temp[] = new int[n];
        for(int i=0;i<k;i++)
            temp[i]= nums[n-k+i];
         for(int i=0;i<=n-k-1;i++)
            temp[i+k] = nums[i]; 
        for(int i=0;i<n;i++)
            nums[i] = temp[i];
    }
}
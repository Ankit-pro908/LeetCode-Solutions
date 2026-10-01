class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(f(nums, 0, n-1),
                        f(nums, 1, n));
        
    }
 public int f(int[] nums, int start, int n) {
    int prev = nums[start];
    int prev2 = 0;

    for(int i= start + 1; i<n; i++){
        int take = nums[i] + prev2;
        int not_take = 0 + prev;

        int curri = Math.max(take, not_take);
        prev2 = prev;
        prev = curri;
    }
    return prev;
    }
}
    
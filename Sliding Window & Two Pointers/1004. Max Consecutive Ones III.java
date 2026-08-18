class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0;
        int n = nums.length;
        int zero = 0;
        int r =0;
        int l = 0;
        while(r<n){
            if(nums[r] == 0){
                zero++;
            }
        if(zero>k){
            if(nums[l] == 0){
                zero--;
            }
                l++;
        }    
                int len = r-l+1;
                maxlen = Math.max(len, maxlen);
                r++;

        }
        
        return maxlen;
            }
        }
       
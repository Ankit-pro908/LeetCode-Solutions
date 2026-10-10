class Solution {
    public int[] singleNumber(int[] nums) {  
        int n = nums.length; 
        int xor = 0;
        for(int i =0; i<n; i++){
            xor = xor^nums[i];
        }
        int rightmost = (xor & xor-1)^ xor;//by doing this we will get atleast one bit difference (in posn) b/w 2 distinct no.s

        int b1=0; int b2 =0;

        for(int i=0; i<n; i++){
            if((nums[i] & rightmost) != 0){
                b1 = b1^nums[i];
            }
            else{
                b2 = b2^nums[i];
            }
        }
        return new int[] {b1, b2};

    }
}
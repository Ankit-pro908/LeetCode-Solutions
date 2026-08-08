class Solution {
    public int lengthOfLongestSubstring(String s) {     
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int maxlen = 0;
        int n = s.length();
        int r=0; int l= 0;
        while(r<n){
            char current = s.charAt(r);
        if(hash[current] != -1){
            if(hash[current] >= l){
                l = hash[current] + 1;
            }
        }
        int length = r - l + 1;
        maxlen = Math.max(length, maxlen);
        hash[current] = r;
        r++;
    }
    return maxlen;
       
    }
}

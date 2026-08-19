class Solution {
    public int totalFruit(int[] fruits) {
       int r=0;
       int l=0;
       int n = fruits.length;
       int maxlen = 0;
       HashMap<Integer,Integer> mpp = new HashMap<>();
       while(r<n){
            mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);

        while(mpp.size()>2){
            mpp.put(fruits[l],mpp.get(fruits[l])-1);
            if(mpp.get(fruits[l]) == 0){
                mpp.remove(fruits[l]);
            }
                l++;
                }
            maxlen = Math.max(r-l+1,maxlen);
            
            r++;
       }
       return maxlen;
    }
}
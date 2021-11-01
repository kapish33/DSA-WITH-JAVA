class summaryRAng {
    public int maxArea(int[] height) {
        int l = 0;
        int r= height.length-1;
        int max = 0;
        while(l<r){
            int right = height[r];
            int left = height[l];
            max = Math.max(max,Math.min(left,right)*(r-l));
            if(left<right)l++;
            else r--;  
        }
        return max;
    }
}

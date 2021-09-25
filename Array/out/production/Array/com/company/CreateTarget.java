class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
	
        ArrayList<Integer> arr = new ArrayList<Integer>(index.length);
		
        for(int i = 0; i<index.length; i++){
            arr.add(index[i], nums[i]);
        }
		
        int[] target = new int[index.length];
		
        for(int i = 0; i<index.length; i++){
            target[i]=arr.get(i);
        }
		
        return target;
    }
}

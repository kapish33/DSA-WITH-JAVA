class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sm=0;
        for (int i=0;i<arr.length;i++){
        sm += (((i+1) * (arr.length - i) + 1)/2)*arr[i];
    }
    
    return sm;
    }
}

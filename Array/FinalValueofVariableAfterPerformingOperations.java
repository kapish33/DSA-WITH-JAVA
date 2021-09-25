class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count =0;
        for(String s : operations){
            if(s.equals("++X") || s.equals("X++"))
                count++;
            else if(s.equals("--X") || s.equals("X--"))
                count--;    
        }
        return count;
    }
}

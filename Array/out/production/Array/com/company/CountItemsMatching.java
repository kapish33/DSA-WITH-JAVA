class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans =0;
        int count =0;
        
        // IMP note is that we can't use == method to check whether rule key and valuues are equal or not to our String bcz == method checks the address not the value for strings
        if(ruleKey.equals("color"))
            count=1;
        else if(ruleKey.equals("name"))
            count=2;
        
        for(int i =0;i<items.size();i++){
            if(ruleValue.equals(items.get(i).get(count)))
                ans++;
        }
        return ans;
    }
}

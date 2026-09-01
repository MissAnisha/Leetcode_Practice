class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String hehe=s+s;
        return hehe.contains(goal);
        
    }
}
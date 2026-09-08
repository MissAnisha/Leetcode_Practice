class Solution {
    public int countCommas(int n) {
        int count = 0;
        for(int i=1; i <= n; i++){
            String numStr = Integer.toString(i);
            int len = numStr.length();
            if(len >= 4){
                count += (len -1) / 3;
            }
        }
        return count;
    }
}


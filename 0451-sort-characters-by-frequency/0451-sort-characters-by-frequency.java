class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        Character[] chars= new Character[256];
        int size=0;
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                chars[size++]=(char)i;
            }
        }
        Arrays.sort(chars,0,size,(a,b)->{
            return freq[b]-freq[a]; });
        StringBuilder result=new StringBuilder();
        for(int i =0;i<size;i++){
            char ch=chars[i];
            for(int j=0;j<freq[ch];j++){
                result.append(ch);
            }
        }
        return result.toString();

        
    }
}
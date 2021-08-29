class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minimumStr = smallest(strs); 
        String result = "";
        
        for(int i=0; i< minimumStr.length(); i++){
            boolean incrementFlag = false;
            for(int j=0; j< strs.length; j++){
                if(minimumStr.charAt(i) != strs[j].charAt(i)){
                    return result;
                }else{
                    incrementFlag = true;
                }
            }
            if(incrementFlag){
                result += minimumStr.charAt(i) ;
            }
        }
        
        return result;
    }
    
    public static String smallest(String words[]) {
        if (words == null || words.length < 1) {
            return "";
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        return smallest;
    }// smallest
    
    
}
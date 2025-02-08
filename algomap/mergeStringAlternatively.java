class Solution {
    public String mergeAlternately(String word1, String word2) {
        int pointer = 0;
        StringBuilder chars = new StringBuilder();

        while(pointer < word1.length() || pointer < word2.length()){
            if(pointer < word1.length()){
                chars.append(word1.charAt(pointer));
            }
            if(pointer < word2.length()){
                chars.append(word2.charAt(pointer));
            }

            pointer++;
        }

        return chars.toString();




    }
}
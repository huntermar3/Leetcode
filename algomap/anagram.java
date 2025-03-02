class Solution {
    public boolean isAnagram(String s, String t) {
        //if they are not the same length then ret false
        if(s.length() != t.length()) return false;


        //need to keep count of the characters
        int[] letterCount = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            letterCount[s.charAt(i) - 'a']++;
            letterCount[t.charAt(i) - 'a']--;
        }

        for(int num : letterCount){
            if(num != 0) return false;
        }

        return true;

    } 
}
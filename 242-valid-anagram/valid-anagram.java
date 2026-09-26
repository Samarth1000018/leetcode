class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // Map<Character, Integer> counter = new HashMap<>();

        // for(int i = 0; i <s.length(); i++){
        //     char ch = s.charAt(i);
        //     counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        // }
        // for(int i = 0; i<t.length(); i++){
        //     char ch = t.charAt(i);
        //     if(!counter.containsKey(ch) || counter.get(ch) == 0){
        //         return false;
        //     }
        //     counter.put(ch, counter.get(ch) - 1);
        // }
        // return true;
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i< freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}

/*
// If two strings are anagrams then the frequency of every char in both of the strings are same.
class Solution {
    public boolean isAnagram(String s, String t) {
        // Base case: if the two strings are empty...
        if(s == null || t == null) return false;
        // In case of different length of those two string...
        if(s.length() != t.length()) return false;
        // To count freq we make an array of size 26...
        int[] counter = new int[26];
        // Traverse all elements through a loop...
        for(int idx = 0; idx < s.length(); idx++){
            counter[s.charAt(idx)-'a']++;
            counter[t.charAt(idx)-'a']--;
        }
        // Above iteration provides us with count array having all values to zero then we can say we found an anagram.
        // Every element of count has to be equal to 0.
        // If it is greater than 0 it means s has a character whose occurrence is greater than its occurrence in t.
        // And if its less than 0 then, s has a character whose occurrence is smaller than its occurrence in t.
        for(int idx: counter){
            if(idx != 0)
                return false;
        }
        return true;
    }
}

*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
        * Anagrams have same letters in terms of count and are same in length
        * We want to produce the same signature from anagrams then put them together
        * We will use an arr of 26 chars since the strings contain lower case chars
        * we will have a representation of char as the index and their appearance count 
        * as the value of that index.
        * Each strings uses this array to create it's signature, then we feed it as key 
        * to a hashmap whereby later all strings with the same signsture become values 
        * of this bucket.
        * Finally we return the maps values as 
        * List<List<String>> valueList = new ArrayList<>(map.values());
        **/

        HashMap<String, List<String>> anagramGroup = new HashMap();

        for(String s : strs){
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i)-'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int c : count){
                key.append(c).append('#');
            }

            anagramGroup.computeIfAbsent( key.toString() , k -> new ArrayList()).add(s);
        }

        return new ArrayList(anagramGroup.values());
    }
}

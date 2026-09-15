class Solution {
     public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> s1 = new HashMap();
        HashMap<Character, Integer> s2 = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            if (s1.containsKey(s.charAt(i))) {
                Integer v = s1.get(s.charAt(i));
                v++;
                s1.put(s.charAt(i), v);
            } else {
                s1.put(s.charAt(i), 1);
            }

            if (s2.containsKey(t.charAt(i))) {
                Integer v = s2.get(t.charAt(i));
                v++;
                s2.put(t.charAt(i), v);
            } else {
                s2.put(t.charAt(i), 1);
            }
        }

        for (Character k : s1.keySet()) {
            if (!(s2.containsKey(k) && Objects.equals(s1.get(k), s2.get(k)))) {
                return false;
            }
        }

        return true;

    }

}

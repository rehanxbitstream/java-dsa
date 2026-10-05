public class WordPattern{
   public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        // Number of characters and words must be same
        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = arr[i];

            // character -> word
            if (map1.containsKey(ch)) {
                if (!map1.get(ch).equals(word)) {
                    return false;
                }
            }

            // word -> character
            if (map2.containsKey(word)) {
                if (map2.get(word) != ch) {
                    return false;
                }
            }

            // Add mapping if not already present
            map1.put(ch, word);
            map2.put(word, ch);
        }

        return true;
    }
}

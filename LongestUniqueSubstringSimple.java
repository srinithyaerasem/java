public class LongestUniqueSubstringSimple {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUniqueSubstring(s));
    }

    static String longestUniqueSubstring(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String current = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (current.indexOf(c) != -1) { // character already exists
                    break;
                }
                current += c; // add unique character
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}

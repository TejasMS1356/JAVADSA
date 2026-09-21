class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");

        HashSet<Character> set = new HashSet<>();
        int count = words.length;

        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {

                if (set.contains(words[i].charAt(j))) {
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}
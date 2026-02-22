import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class WordGroup {
    String words;

    public WordGroup(String input) {
        words = input.toLowerCase(Locale.ROOT);
    }

    public String[] getWordArray() {
        return words.split(" ");
    }

    public HashSet<String> getWordSet(WordGroup group) {
        HashSet<String> set = new HashSet<>();

        for (String word: this.getWordArray()) {
            set.add(word);
        }
        for (String word: group.getWordArray()) {
            set.add(word);
        }
        return set;
    }

    public HashMap<String, Integer> getWordCounts() {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : getWordArray()) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

}
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

}
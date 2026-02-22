import java.util.Locale;

public class WordGroup {
    String words;

    public WordGroup(String input) {
        words += input.toLowerCase(Locale.ROOT);
    }

    public String[] getWordArray() {
        return words.split(" ");
    }

}

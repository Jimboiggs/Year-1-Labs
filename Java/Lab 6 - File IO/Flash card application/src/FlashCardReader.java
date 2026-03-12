import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {
    private BufferedReader reader;
    private ArrayList<FlashCard> flashCards = new ArrayList<>();

    public FlashCardReader(String filename) {
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (IOException e) {
            System.out.println("Error: Could not open file " + filename);
        }
    }

    public String getLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading line");
        }
        return null;
    }

    public boolean fileIsReady() {
        try {
            return reader != null && reader.ready();
        } catch (IOException e) {
            System.out.println("Reader not ready");
            return false;
        }
    }

    public ArrayList<FlashCard> getFlashCards() {
        return flashCards;
    }
}

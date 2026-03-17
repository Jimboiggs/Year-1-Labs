import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Quiz {
    private FlashCardReader cardReader;
    private ArrayList<FlashCard> quizCards;
    private Toolbox toolbox = new Toolbox();
    private PrintStream ps;
    private FlashCard card;
    private String input;

    private boolean correct;
    int count = 0;
    int score = 0;

    public Quiz(String fileName) {
        cardReader = new FlashCardReader(fileName);
        quizCards = cardReader.getFlashCards();
    }

    public void play() {
        String choice = toolbox.readStringFromCmd();
        System.out.println("Choice was: " + choice);
        if (choice.equals("Y")) {
            try {
                ps = new PrintStream(new File("save.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("Error writing to file");
            }
        }
        for (FlashCard card : quizCards) {
            this.card = card;
            count++;
            System.out.println(card.getQuestion());
            input = toolbox.readStringFromCmd();
            if (input.equals(card.getAnswer())) {
                System.out.println("right");
                correct = true;
                score++;
            } else {
                System.out.println("wrong");
                System.out.println(card.getAnswer());
                correct = false;
            }
            if (choice.equals("Y")) {
                save();
            }
        }
        if (ps != null) {
            ps.close();
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("Questions.txt");
        quiz.play();
    }

    public void save() {
        ps.print(card.getQuestion());
        ps.print(",");
        ps.print(input);
        ps.print(",");
        if (correct) {
            ps.println("right");
        } else {
            ps.println("wrong");
        }
        System.out.println("count=" + count + " size=" + quizCards.size());
        if (count == quizCards.size()) {
            System.out.println("Writing summary");
            ps.println(score + "," + count + "," + ((double) score / count * 100));
        }
    }

    public Quiz(ArrayList<FlashCard> cards) {
        quizCards = cards;
    }
}

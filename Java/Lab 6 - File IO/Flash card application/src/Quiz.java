import java.io.File;
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
        if (choice == "Y") {
            ps = new PrintStream(new File("save.txt"));
        }
        for (FlashCard card : quizCards) {
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
            if (choice == "Y") {
                save();
            }
        }
        ps.close();
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
        if (count == quizCards.size()) {
            ps.print(score);
            ps.print(",");
            ps.print(count);
            ps.print(",");
            ps.print(score/count);
        }
    }
}

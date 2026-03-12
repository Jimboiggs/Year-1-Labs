import java.util.ArrayList;

public class Quiz {
    private FlashCardReader cardReader;
    private ArrayList<FlashCard> quizCards;
    private Toolbox toolbox = new Toolbox();

    public Quiz(String fileName) {
        cardReader = new FlashCardReader(fileName);
        quizCards = cardReader.getFlashCards();
    }

    public void play() {
        for (FlashCard card : quizCards) {
            System.out.println(card.getQuestion());
            String input = toolbox.readStringFromCmd();
            if (input.equals(card.getAnswer())) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
                System.out.println(card.getAnswer());
            }
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("Questions.txt");
        quiz.play();
    }
}

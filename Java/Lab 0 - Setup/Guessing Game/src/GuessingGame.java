public class GuessingGame {

    public static void main(String[] args) {
        Toolbox myToolbox = new Toolbox();
        Integer numberToGuess = myToolbox.getRandomInteger (10);
        Integer guessedNumber;


        System.out.println("Welcome to the guessing game!");
        guessedNumber = myToolbox . readIntegerFromCmd ();

        if (numberToGuess.equals(guessedNumber))
        {
            System.out.println("Correct!");
        } else if (guessedNumber < numberToGuess)
        {
            System.out.println("too low");
        } else
        {
            System.out.println("too high");
        }

    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class WordleGame {
    public static void main(String[] args) {
        playGame();
    }
    public static void playGame() {
        ArrayList<String> words = readWordsFromFile("Wordle_Words.txt");
        if (words.isEmpty()) {
            System.out.println("No words found in the file.");
            return;
        }
        int maxGuesses = 5;
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);
        while (playAgain) {
            playSingleGame(words, maxGuesses, scanner);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        }
        scanner.close();
    }
    public static ArrayList<String> readWordsFromFile(String fileName) {
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
    public static void playSingleGame(ArrayList<String> words, int maxGuesses, Scanner scanner) {
        Random rand = new Random();
        if (words.isEmpty()) {
            System.out.println("No words left to play!");
            return;
        }
        int randomIndex = rand.nextInt(words.size());
        String targetWord = words.remove(randomIndex);
        int guessesLeft = maxGuesses;
        System.out.println("Welcome to Wordle! You have " + maxGuesses + " guesses to find the hidden word.");
        System.out.println("The word contains " + targetWord.length() + " letters.");
        while (guessesLeft > 0) {
            System.out.print("Guess (" + guessesLeft + " left): ");
            String guess = scanner.nextLine().toUpperCase();
            if (guess.equals(targetWord)) {
                System.out.println("Congratulations! You've guessed the word '" + targetWord + "'.");
                return;
            } else {
                guessesLeft--;
                StringBuilder feedback = new StringBuilder("Incorrect guess! Feedback: ");
                for (int i = 0; i < targetWord.length(); i++) {
                    char guessedLetter = guess.charAt(i);
                    char targetLetter = targetWord.charAt(i);
                    if (guessedLetter == targetLetter) {
                        feedback.append(guessedLetter); // Matched letter at correct position
                    } else if (targetWord.contains(String.valueOf(guessedLetter))) {
                        feedback.append("#"); // Matched letter at wrong position
                    } else {
                        feedback.append("_"); // No match
                    }
                }
                System.out.println(feedback.toString());
            }
        }
        System.out.println("Sorry, you've run out of guesses. The word was '" + targetWord + "'.");
    }
}
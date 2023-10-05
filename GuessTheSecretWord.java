package programminglogicInJava;
import java.util.Scanner;

public class GuessTheSecretWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretWord;
        int attempt = 0;

        do {
            System.out.print("Type the secret word: ");
            secretWord = scanner.nextLine();

            if (!secretWord.startsWith("secretWord")) {
                attempt++;
                switch (attempt) {
                    case 1:
                        System.out.println("Hint 1: The word starts with 's'.");
                        break;
                    case 2:
                        System.out.println("Hint 2: The word ends with 'd'.");
                        break;
                    case 3:
                        System.out.println("Hint 3: The word has 10 letters.");
                        break;
                }
            }
        } while (!secretWord.startsWith("secretword"));

        System.out.println("The word was found!");
        scanner.close();
    }
}

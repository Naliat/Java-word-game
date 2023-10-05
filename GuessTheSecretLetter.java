package programminglogicInJava;
import java.util.Scanner;

public class GuessTheSecretLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int attempt = 0;

        do {
            System.out.print("Type the secret letter::\t");
            nome = scanner.nextLine();

            if (!nome.startsWith("t") && !nome.startsWith("T")) {
                attempt++;
                switch (attempt) {
                    case 1:
                        System.out.println("Hint 1: The name starts with a letter from the second half of the alphabet.");
                        break;
                    case 2:
                        System.out.println("Hint 2: The name starts with a letter often used in mathematics.");
                        break;
                    case 3:
                        System.out.println("Hint 3: The name starts with the same letter as 'Tango'.");
                        break;
                }
            }
        } while (!nome.startsWith("t") && !nome.startsWith("T"));

        System.out.println("The test has been completed");
        scanner.close();
    }
}

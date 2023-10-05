package programminglogicInJava;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            int attempt = 0;

            do {
                System.out.print("Enter the secret number: ");
                number = scanner.nextInt();

                if (number != 1) {
                    attempt++;
                    switch (attempt) {
                        case 1:
                            System.out.println("Hint 1: The number is not even.");
                            break;
                        case 2:
                            System.out.println("Hint 2: The number is not zero.");
                            break;
                        case 3:
                            System.out.println("Hint 3: The number is less than two.");
                            break;
                    }
                }
            } while (number != 1);

            System.out.println("Congratulations, you guessed the secret number!");
            scanner.close();
        }
    }
}

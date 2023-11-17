import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        guessNumberTest.start();
    }

    public void answerPlayer(Scanner scanner, GuessNumber guessNumber) {
        String answer = "yes";
        while (true) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
            if (answer.equals("yes")) {
                guessNumber.startGame();
            } else if (answer.equals("no")) {
                break;
            }
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Player player1 = initPlayer(scanner, 1);
        Player player2 = initPlayer(scanner, 2);
        GuessNumber game = new GuessNumber(player1, player2);
        game.startGame();
        this.answerPlayer(scanner, game);
    }

    public Player initPlayer(Scanner scanner, int playerNum) {
        System.out.print("Игрок " + playerNum + " представься ");
        return new Player(scanner.next());
    }
}
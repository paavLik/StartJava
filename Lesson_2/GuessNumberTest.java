import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        guessNumberTest.start();
    }

    public void giveAnswer(Scanner scanner, GuessNumber guessNumber) {
        String answer = "yes";
        while (!answer.equals("no")) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
            if (answer.equals("yes")) {
                guessNumber.startGame();
            }
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Player player1 = createPlayer(scanner, 1);
        Player player2 = createPlayer(scanner, 2);
        GuessNumber game = new GuessNumber(player1, player2);
        game.startGame();
        giveAnswer(scanner, game);
    }

    public Player createPlayer(Scanner scanner, int playerNum) {
        System.out.print("Игрок " + playerNum + " представься ");
        return new Player(scanner.next());
    }
}
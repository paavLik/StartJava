import java.util.Scanner;

public class GuessNumberTest {

    private GuessNumber game;

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        guessNumberTest.initGame();
        guessNumberTest.play();
    }

    private void play() {
        do {
            game.startGame();
        } while (isNeedToNewGame());
    }

    private void initGame() {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        this.game = new GuessNumber(player1, player2, scanner);
    }

    private Player createPlayer(int serialNum) {
        System.out.print("Игрок " + serialNum + " представься ");
        return new Player(scanner.next());
    }

    private boolean isNeedToNewGame() {
        String answer = "yes";
        while (!answer.equals("no")) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
            if (answer.equals("yes")) {
                return true;
            }
        }
        return false;
    }
}


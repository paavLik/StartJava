import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;
    private final Player player1;
    private final Player player2;
    private Player curPlayer;
    private final Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        System.out.println("Да начнется великая битва в Угадай число!!!");
        curPlayer = player1;
        hiddenNum = (int) (Math.random() * 100 + 1);
        inputAndCheckNum();
    }

    private void inputAndCheckNum() {
        while (true) {
            System.out.print(curPlayer.getName() + " введи число: ");
            curPlayer.setNum(scanner.nextInt());
            System.out.println();
            if (curPlayer.getNum() > hiddenNum) {
                System.out.println("Число " + curPlayer.getNum() + " больше того, что загадал компьютер");
            } else if (curPlayer.getNum() < hiddenNum) {
                System.out.println("Число " + curPlayer.getNum() + " меньше того, что загадал компьютер");
            } else {
                System.out.println(curPlayer.getName() + " Вы победили!");
                break;
            }
            changePlayer();
        }
    }

    private void changePlayer() {
        curPlayer = curPlayer == player1 ? player2 : player1;
    }
}

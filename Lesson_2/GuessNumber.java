import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;
    private Player player1;
    private Player player2;
    private Player curPlayer;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Да начнется великая битва в Угадай число!!!");
        curPlayer = player1;
        hiddenNum = (int) (Math.random() * 100 + 1);
        checkNum();
    }

    private void checkNum() {
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
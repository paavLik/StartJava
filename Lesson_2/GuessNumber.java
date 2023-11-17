import java.util.Scanner;

public class GuessNumber {

    private int computerNum;
    private Player player1;
    private Player player2;
    private Player curPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        System.out.println("Да начнется великая битва в Угадай число!!!");
        curPlayer = player1;
        computerNum = (int) (Math.random() * 100 + 1);
        while (true) {
            System.out.print(curPlayer.getName() + " введи число: ");
            curPlayer.setNumPlayer(scanner.nextInt());
            System.out.println();
            if (curPlayer.getNumPlayer() > computerNum) {
                System.out.println("Число " + curPlayer.getNumPlayer() + " больше того, что загадал компьютер");
            } else if (curPlayer.getNumPlayer() < computerNum) {
                System.out.println("Число " + curPlayer.getNumPlayer() + " меньше того, что загадал компьютер");
            } else {
                System.out.println(curPlayer.getName() + " Вы победили!");
                break;
            }
            changePlayer();
        }
    }

    public void changePlayer() {
        if (curPlayer == player1) {
            curPlayer = player2;
        } else {
            curPlayer = player1;
        }
    }
}
public class Player {

    private String name;
    private int numPlayer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int playerNum) {
        this.numPlayer = playerNum;
    }

    public int getNum() {
        return numPlayer;
    }
}
public class Player {

    private final String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int playerNum) {
        this.number = playerNum;
    }

    public int getNum() {
        return number;
    }
}
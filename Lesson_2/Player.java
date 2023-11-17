public class Player {

    private String name;
    private int numPlayer;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumPlayer(int playerNum) {
        this.numPlayer = playerNum;
    }

    public int getNumPlayer() {
        return numPlayer;
    }
}

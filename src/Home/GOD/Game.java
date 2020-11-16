package Home.GOD;

public class Game {
    static int gameSN = 0;
    private GameName gameType;
    private int player1bride;
    private int player2bride;
    private int player3bride;
    private int player4bride;

    Game (GameName gameName) {
        gameSN++;
        this.gameType = gameName;

    }
    public GameName getGameType() {
        return gameType;
    }

    public int getGameSN () {
        return gameSN;
    }

    public int getPlayer1bride() {
        return player1bride;
    }

    public void setPlayer1bride(int player1bride) {
        this.player1bride = player1bride;
    }

    public int getPlayer2bride() {
        return player2bride;
    }

    public void setPlayer2bride(int player2bride) {
        this.player2bride = player2bride;
    }

    public int getPlayer3bride() {
        return player3bride;
    }

    public void setPlayer3bride(int player3bride) {
        this.player3bride = player3bride;
    }

    public int getPlayer4bride() {
        return player4bride;
    }

    public void setPlayer4bride(int player4bride) {
        this.player4bride = player4bride;
    }
}

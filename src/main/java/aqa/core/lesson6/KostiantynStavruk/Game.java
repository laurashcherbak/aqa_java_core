package aqa.core.lesson6.KostiantynStavruk;

public class Game {

    public String name;
    public int amountPlayers;

    public Game(String name, int amountPlayers) {
        this.name = name;
        this.amountPlayers = amountPlayers;
    }

    public Game(String name) {
        this.name = name;
        this.amountPlayers = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountPlayers() {
        return amountPlayers;
    }

    public void setAmountPlayers(int amountPlayers) {
        this.amountPlayers = amountPlayers;
    }

    @Override
    public String toString() {
        return "Game:" +
                "name -'" + name + '\'' +
                ", amountPlayers - " + amountPlayers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return amountPlayers == game.amountPlayers && name.equals(game.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + amountPlayers;
        return result;
    }
}

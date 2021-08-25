package aqa.core.lesson6.KostiantynStavruk;

public class Chess extends Game{
    public final Type type = Type.BoardGame;
    public final int amountPlayers = 2;
    public Chess(String name) {
        super(name);
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Chess: " +
                "type - " + type +
                ", amountPlayers - " + amountPlayers +
                ", name - '" + name + '\'' +
                ", amountPlayers - " + amountPlayers;
    }
}

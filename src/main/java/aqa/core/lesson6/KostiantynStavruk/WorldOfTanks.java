package aqa.core.lesson6.KostiantynStavruk;

public class WorldOfTanks extends Game{
    public int stages;
    public final Type type = Type.OnlineGame;

    public WorldOfTanks(String name, int amountPlayers, int stages) {
        super(name, amountPlayers);
        this.stages = stages;
    }

    public int getStages() {
        return stages;
    }

    public void setStages(int stages) {
        this.stages = stages;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "WorldOfTanks: " +
                "name - '" + name + '\'' +
                ", amountPlayers - " + amountPlayers +
                ", stages - " + stages +
                ", type - " + type;
    }
}

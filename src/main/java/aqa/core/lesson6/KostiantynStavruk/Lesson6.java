package aqa.core.lesson6.KostiantynStavruk;

public class Lesson6 {
    public static void main(String[] args) {
        Game worldOfTanks = new WorldOfTanks("game1", 5, 30);
        System.out.println(worldOfTanks);
        System.out.println("Amount of players: " + worldOfTanks.getAmountPlayers());
        System.out.println("Game name: " + worldOfTanks.getName());
        worldOfTanks.setAmountPlayers(4);
        System.out.println("Amount of players: " + worldOfTanks.getAmountPlayers());
        System.out.println("-----------------------------------------");

        Game chess = new Chess("game2");
        System.out.println(chess);
        System.out.println("Amount of players: " + chess.getAmountPlayers());
        System.out.println("Game name: " + chess.getName());
        System.out.println("-----------------------------------------");

        Game game3 = new Game("game3");
        System.out.println(game3);
        game3.setAmountPlayers(4);
        System.out.println(game3);
        System.out.println("-----------------------------------------");


        Game game4 = new Game("game 4", 5);
        System.out.println("Amount of players: " + game4.getAmountPlayers());
        System.out.println("Game name: " + game4.getName());
    }
}

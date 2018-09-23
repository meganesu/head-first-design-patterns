import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> players = new ArrayList<>();
        players.add(new Queen(new KnifeBehavior()));
        players.add(new Knight(new BowAndArrowBehavior()));
        players.add(new Troll(new AxeBehavior()));
        players.add(new King(new SwordBehavior()));

        for (Character player : players) {
            player.fight();
        }

    }
}

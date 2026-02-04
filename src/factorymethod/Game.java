package factorymethod;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        Map myMap = game.createMap();

        myMap.display();
    }

    public Map createMap() {
        // Map choice hardcoded
        return new WildernessMap();
    }
}

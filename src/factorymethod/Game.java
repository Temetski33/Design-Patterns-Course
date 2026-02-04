package factorymethod;

public class Game {
    public static void main(String[] args) {
        Map myMap = new WildernessMap();

        Tile firstTestTile = myMap.createTile();
        System.out.println(firstTestTile.getType());
    }
}

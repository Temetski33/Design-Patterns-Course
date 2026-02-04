package factorymethod;

public class Game {
    public static void main(String[] args) {
        Map myMap = new CityMap();

        Tile firstTestTile = myMap.createTile();
        System.out.println(firstTestTile.getType());
        System.out.println(firstTestTile.getCharacter());
    }
}

package factorymethod;

public class WildernessMap extends Map{
    @Override
    public Tile createTile() {
        int n = (int)(Math.random() * 3) + 1;
        if (n == 1) {
            return new SwampTile();
        } else if (n == 2) {
            return new WaterTile();
        } else if (n == 3) {
            return new ForestTile();
        }
        System.out.println("RNG error! Defaulting to forest tile...");
        return new ForestTile();
    }
}

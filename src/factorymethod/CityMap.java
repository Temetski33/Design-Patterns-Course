package factorymethod;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        int n = (int)(Math.random() * 3) + 1;
        System.out.println(n);
        return new BuildingTile();
    }
}

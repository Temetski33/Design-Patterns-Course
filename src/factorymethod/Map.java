package factorymethod;

public abstract class Map {

    protected Tile[][] tiles = new Tile[5][5];

    public Map() {
        // Fill the map using the factory method
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                tiles[row][col] = createTile();
            }
        }
    }

    // Factory method (implemented in subclasses)
    public abstract Tile createTile();

    // Display method (agnostic of tile types)
    public void display() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(tiles[row][col].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}


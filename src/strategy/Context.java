package strategy;

public class Context {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] executeStrategy(int[] array) {
        return strategy.sort(array);
    }


}

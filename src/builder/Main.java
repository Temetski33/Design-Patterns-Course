package builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Computer World!");

        ComputerBuilder builder = new GamingComputerBuilder();
        Director director = new Director(builder);
        director.constructComputer();
        Computer meal = builder.getComputer();
        System.out.println(meal);
    }
}

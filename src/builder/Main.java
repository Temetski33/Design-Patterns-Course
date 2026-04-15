package builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Computer World!");

        // Make a gaming computer
        ComputerBuilder builder = new GamingComputerBuilder();
        Director director = new Director(builder);
        director.constructComputer();
        Computer firstComputer = builder.getComputer();
        printComputer(firstComputer);

        // Make an office computer
        builder = new OfficeComputerBuilder();
        director = new Director(builder);
        director.constructComputer();
        Computer secondComputer = builder.getComputer();
        printComputer(secondComputer);
    }

    // TODO add static function to computer class
    public static void printComputer(Computer componentsList) {
        System.out.println();
        System.out.println("PC configuration: ");
        System.out.println(componentsList);
        System.out.println();
    }
}

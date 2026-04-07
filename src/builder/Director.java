package builder;

public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
        this.builder = builder;
    }

    public void constructComputer(){
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
    }
}

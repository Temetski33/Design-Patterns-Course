package builder;

public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
        this.builder = builder;
    }

    public void GamingComputerBuilder(){
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildRAM();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
    }

    public void OfficeComputerBuilder(){
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
    }
}

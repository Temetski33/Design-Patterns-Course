package builder;

public interface ComputerBuilder {
    void buildProcessor();
    void buildRAM();
    void buildGraphicsCard();
    void buildHardDrive();
    void buildOperatingSystem();
    Computer getComputer();
}

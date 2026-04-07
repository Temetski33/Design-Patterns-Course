package builder;

public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("X Gaming 5000i 8core 4GHz"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("Ultragamer DDR5 32Gb"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("mVideo 100Gb 7GHz"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("Storemax Pro 250Tb"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Linux Gaming xD"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

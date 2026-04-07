package builder;

public class OfficeComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public OfficeComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Impel 2core 2GHz"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("HXK DDR3 8Gb"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Impel Integrated HD Graph"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("Storemax H 256Gb"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Doors 11"));
    }
}

package decorator;

public class EncryptedPrinter extends PrinterDecorator{

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String message) {
        System.out.println("Encryyyptiooon");
        super.print(message);
    }
}

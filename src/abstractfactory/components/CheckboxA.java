package abstractfactory.components;

public class CheckboxA implements Checkbox {
    @Override
    public void display(String text) {
        System.out.println("[CHECK!] " + text);
    }
}

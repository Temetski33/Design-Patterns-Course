package abstractfactory.components;

public class ButtonA implements Button {
    @Override
    public void display(String text) {
        System.out.println("(*) " + text);
    }
}

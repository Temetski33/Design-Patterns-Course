package abstractfactory.components;

public class ButtonB implements Button{
    @Override
    public void display(String text) {
        System.out.println("buttonbbb " + text);
    }
}

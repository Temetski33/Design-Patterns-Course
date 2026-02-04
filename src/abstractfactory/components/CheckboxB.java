package abstractfactory.components;

public class CheckboxB implements Checkbox{
    @Override
    public void display(String text) {
        System.out.println("checkboxbbb " + text);
    }
}

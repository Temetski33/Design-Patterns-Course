package abstractfactory.components;

public class TextFieldB implements TextField{
    @Override
    public void display(String text) {
        System.out.println("textbbb " + text);
    }
}

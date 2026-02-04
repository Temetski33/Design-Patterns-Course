package abstractfactory.components;

public class TextFieldA implements TextField{
    @Override
    public void display(String text) {
        System.out.println("textaaaa " + text);
    }
}

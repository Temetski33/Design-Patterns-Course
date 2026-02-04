package abstractfactory.components;

public class TextFieldA implements TextField{
    @Override
    public void display(String text) {
        System.out.println();
        System.out.println("--------");
        System.out.println(text);
        System.out.println("--------");
    }
}

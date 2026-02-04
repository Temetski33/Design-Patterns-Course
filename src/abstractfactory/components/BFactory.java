package abstractfactory.components;

public class BFactory implements UIFactory{
    @Override
    public Button createButton(String text) {
        Button button = new ButtonB();
        button.display(text);
        return button;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox checkbox = new CheckboxB();
        checkbox.display(text);
        return checkbox;
    }

    @Override
    public TextField createTextField(String text) {
        TextField textfield =  new TextFieldB();
        textfield.display(text);
        return textfield;
    }
}

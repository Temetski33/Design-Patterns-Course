package abstractfactory.components;

public class AFactory implements UIFactory{
    @Override
    public Button createButton(String text) {
        Button button = new ButtonA();
        button.display(text);
        return button;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox checkbox = new CheckboxA();
        checkbox.display(text);
        return checkbox;
    }

    @Override
    public TextField createTextField(String text) {
        TextField textfield =  new TextFieldA();
        textfield.display(text);
        return textfield;
    }
}

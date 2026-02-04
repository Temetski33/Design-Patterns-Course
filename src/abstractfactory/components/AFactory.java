package abstractfactory.components;

public class AFactory implements UIFactory{
    @Override
    public Button createButton(String text) {
        return new ButtonA();
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxA();
    }

    @Override
    public TextField createTextField(String text) {
        return null;
    }
}

package abstractfactory.components;

public class BFactory implements UIFactory{
    @Override
    public Button createButton(String text) {
        return new ButtonB();
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxB();
    }

    @Override
    public TextField createTextField(String text) {
        return null;
    }
}

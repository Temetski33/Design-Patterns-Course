package abstractfactory.components;

public interface UIFactory {
    Button createButton(String text);
    Checkbox createCheckbox(String text);
    TextField createTextField(String text);
}

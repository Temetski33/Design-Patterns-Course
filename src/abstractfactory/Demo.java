package abstractfactory;

import abstractfactory.components.*;

public class Demo {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();

        Button btn = factory.createButton("moi");
        Checkbox cb = factory.createCheckbox("hehe");

        btn.display("moro");
        cb.display("hoho");



    }
}

package com.company;

import com.company.elementsInterface.Button;
import com.company.elementsInterface.Checkbox;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

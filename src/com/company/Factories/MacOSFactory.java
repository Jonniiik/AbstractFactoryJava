package com.company.Factories;

import com.company.GUIFactory;
import com.company.elementsClasses.MacOSButton;
import com.company.elementsClasses.MacOSCheckbox;
import com.company.elementsInterface.Button;
import com.company.elementsInterface.Checkbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

package com.company.Factories;

import com.company.GUIFactory;
import com.company.elementsClasses.WindowsButton;
import com.company.elementsClasses.WindowsCheckbox;
import com.company.elementsInterface.Button;
import com.company.elementsInterface.Checkbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

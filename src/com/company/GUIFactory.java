package com.company;

import com.company.elementsInterface.Button;
import com.company.elementsInterface.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

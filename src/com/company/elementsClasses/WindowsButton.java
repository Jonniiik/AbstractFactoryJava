package com.company.elementsClasses;

import com.company.elementsInterface.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

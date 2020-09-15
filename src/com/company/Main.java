package com.company;

import com.company.Factories.MacOSFactory;
import com.company.Factories.WindowsFactory;

public class Main {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }


    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

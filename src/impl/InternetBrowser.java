package impl;

import interfaces.SmartApplication;

public class InternetBrowser implements SmartApplication {
    @Override
    public void goToHomeScreen(){
        System.out.println("Now in HomeScreen");
    }

    @Override
    public void stop() {
        System.out.println("Stopping application");
        this.goToHomeScreen();
    }
}

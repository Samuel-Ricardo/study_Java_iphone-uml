package impl;

import interfaces.SmartApplication;

import java.sql.SQLOutput;

public class InternetBrowser implements SmartApplication {

    private String pageURL;

    @Override
    public void goToHomeScreen(){
        System.out.println("Now in HomeScreen");
    }

    @Override
    public void stop() {
        System.out.println("Stopping application");
        this.goToHomeScreen();
    }

    public void openPage(String url){
        System.out.println("Opening page: "+url);
        this.pageURL = url;
    }

    public void addNewGuide() {
        System.out.println("Added new guide");
    }

    public void reloadPage() {
        System.out.println("Reload page");
    }
}

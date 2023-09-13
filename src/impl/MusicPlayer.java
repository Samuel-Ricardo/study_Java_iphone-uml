package impl;

import interfaces.SmartApplication;

public class MusicPlayer implements SmartApplication {

    private String selectedSong;

    public MusicPlayer(){}

    @Override
    public void goToHomeScreen(){
        System.out.println("Now in HomeScreen");
    }

    @Override
    public void stop() {
        System.out.println("Stopping application");
        this.goToHomeScreen();
    }

    public void play() {
        System.out.println("Play song");
    }

    public void pause() {
        System.out.println("Paused");
    }

    public void select(String song){
        System.out.println(song+" Selected");
    }
}

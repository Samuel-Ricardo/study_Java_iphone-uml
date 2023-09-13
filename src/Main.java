import impl.Contact;
import impl.InternetBrowser;
import impl.MusicPlayer;
import impl.Phone;
import interfaces.SmartApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        player.select("Pedro");
        player.play();
        player.pause();

        InternetBrowser browser = new InternetBrowser("http://localhost:3000");

        browser.addNewGuide();
        browser.openPage("http://localhost:3000/pedro/fotos");
        browser.reloadPage();

        Phone phone = new Phone(new ArrayList<Contact>());

        phone.startCall(new Contact("pedro","+12 93456-7890"));
        phone.acceptCall();
        phone.startVoicemail();
        phone.getContactList().forEach(contact -> System.out.println("Contact: "+contact.getName()));

        SmartApplication app = phone;
        app = player;
        app = browser;

        app.goToHomeScreen();
        app.stop();

    }
}
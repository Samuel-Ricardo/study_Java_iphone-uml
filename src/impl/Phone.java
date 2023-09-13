package impl;

import interfaces.SmartApplication;
import java.util.List;

public class Phone implements SmartApplication {

    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public Phone(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public void goToHomeScreen(){
        System.out.println("Now in HomeScreen");
    }

    @Override
    public void stop() {
        System.out.println("Stopping application");
        this.goToHomeScreen();
    }

    public void startCall(Contact contact){
        this.contactList.add(contact);
        System.out.println("Start a call for: "+contact.getNumber());
    }

    public void acceptCall() {
        System.out.println("Call Accepted");
    }

    public boolean startVoicemail(){
        System.out.println("Voicemail started");
        return true;
    }
}

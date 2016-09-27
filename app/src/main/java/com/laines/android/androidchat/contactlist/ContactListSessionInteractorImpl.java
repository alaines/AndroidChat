package com.laines.android.androidchat.contactlist;

/**
 * Created by alaines on 20/09/2016.
 */
public class ContactListSessionInteractorImpl implements ContactListSessionInteractor {
    ContactListRepositoryImpl contactListRepository;

    public ContactListSessionInteractorImpl() {
        this.contactListRepository = new ContactListRepositoryImpl();
    }

    @Override
    public void signOff() {
        contactListRepository.signOff();
    }

    @Override
    public String getCurrentUserEmail() {
        return contactListRepository.getCurrentEmail();
    }

    @Override
    public void changeConnectionStatus(boolean online) {
        contactListRepository.changeUserConnectionStatus(online);
    }
}

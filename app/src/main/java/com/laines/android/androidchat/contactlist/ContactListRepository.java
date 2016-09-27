package com.laines.android.androidchat.contactlist;

/**
 * Created by alaines on 20/09/2016.
 */

public interface ContactListRepository {
    void signOff();
    String getCurrentEmail();
    void removeContact(String email);
    void destroyContactListListener();
    void subscribeForContactListUpdates();
    void unSubscribeForContactListUpdates();
    void changeUserConnectionStatus(boolean online);
}

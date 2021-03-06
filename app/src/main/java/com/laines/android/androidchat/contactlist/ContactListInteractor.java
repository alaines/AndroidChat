package com.laines.android.androidchat.contactlist;

/**
 * Created by alaines on 20/09/2016.
 */

public interface ContactListInteractor {
    void subscribeForContactEvents();
    void unSubscribeForContactEvents();
    void destroyContactListListener();
    void removeContact(String email);
}

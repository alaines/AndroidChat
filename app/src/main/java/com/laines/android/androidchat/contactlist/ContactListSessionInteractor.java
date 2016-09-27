package com.laines.android.androidchat.contactlist;

/**
 * Created by alaines on 20/09/2016.
 */

public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}

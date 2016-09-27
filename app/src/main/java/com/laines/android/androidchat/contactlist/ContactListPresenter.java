package com.laines.android.androidchat.contactlist;

import com.laines.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by alaines on 20/09/2016.
 */

public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}

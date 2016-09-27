package com.laines.android.androidchat.contactlist.ui;

import com.laines.android.androidchat.contactlist.entities.User;

/**
 * Created by alaines on 20/09/2016.
 */

public interface ContactListView {

    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);

}

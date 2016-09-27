package com.laines.android.androidchat.contactlist.ui;

import com.laines.android.androidchat.contactlist.entities.User;

/**
 * Created by ykro.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}

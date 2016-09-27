package com.laines.android.androidchat.contactlist.adapters;

import com.laines.android.androidchat.contactlist.entities.User;

/**
 * Created by alaines on 20/09/2016.
 */

public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);

}

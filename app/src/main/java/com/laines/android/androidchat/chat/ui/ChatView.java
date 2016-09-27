package com.laines.android.androidchat.chat.ui;

import  com.laines.android.androidchat.chat.entities.ChatMessage;

/**
 * Created by ykro.
 */
public interface ChatView {
    void sendMessage();
    void onMessageReceived(ChatMessage msg);
}

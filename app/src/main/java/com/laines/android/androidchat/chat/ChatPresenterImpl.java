package com.laines.android.androidchat.chat;

import org.greenrobot.eventbus.Subscribe;

import com.laines.android.androidchat.chat.entities.ChatMessage;
import com.laines.android.androidchat.chat.events.ChatEvent;
import com.laines.android.androidchat.chat.ui.ChatView;
import com.laines.android.androidchat.contactlist.entities.User;
import com.laines.android.androidchat.lib.EventBus;
import com.laines.android.androidchat.lib.GreenRobotEventbus;

/**
 * Created by ykro.
 */
public class ChatPresenterImpl implements ChatPresenter {
    EventBus eventBus;
    ChatView chatView;
    ChatInteractor chatInteractor;
    ChatSessionInteractor chatSessionInteractor;

    public ChatPresenterImpl(ChatView chatView){
        this.chatView = chatView;
        this.eventBus = GreenRobotEventbus.getInstance();

        this.chatInteractor = new ChatInteractorImpl();
        this.chatSessionInteractor = new ChatSessionInteractorImpl();
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onResume() {
        chatInteractor.subscribeForChatUpates();
        chatSessionInteractor.changeConnectionStatus(User.ONLINE);
    }

    @Override
    public void onPause() {
        chatInteractor.unSubscribeForChatUpates();
        chatSessionInteractor.changeConnectionStatus(User.OFFLINE);
    }

    @Override
    public void onDestroy() {
        eventBus.unregister(this);
        chatInteractor.destroyChatListener();
        chatView = null;
    }

    @Override
    public void setChatRecipient(String recipient) {
        this.chatInteractor.setRecipient(recipient);
    }

    @Override
    public void sendMessage(String msg) {
        chatInteractor.sendMessage(msg);
    }

    @Override
    @Subscribe
    public void onEventMainThread(ChatEvent event) {
        if (chatView != null) {
            ChatMessage msg = event.getMessage();
            chatView.onMessageReceived(msg);
        }
    }

}

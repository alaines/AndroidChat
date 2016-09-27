package com.laines.android.androidchat.login;

import com.laines.android.androidchat.login.events.LoginEvent;

/**
 * Created by alaines on 8/09/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}

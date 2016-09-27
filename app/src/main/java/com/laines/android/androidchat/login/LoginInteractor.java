package com.laines.android.androidchat.login;

/**
 * Created by alaines on 8/09/2016.
 */
public interface LoginInteractor {
    void checkAlreadyAuthenticated();
    void SignUp(String email, String password);
    void SignIn(String email, String password);
}

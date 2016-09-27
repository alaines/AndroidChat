package com.laines.android.androidchat.login;

/**
 * Created by alaines on 8/09/2016.
 */
public interface LoginRepository {
    void signUp(final String email, final String password);
    void signIn(String email, String password);
    void checkAlreadyAuthenticated();
}

package com.laines.android.androidchat.login;

/**
 * Created by alaines on 8/09/2016.
 */
public class LoginInteractorImpl implements LoginInteractor {
    private LoginRepository loginRepository;

    public LoginInteractorImpl() {
        this.loginRepository = new LoginRepositoryImpl();
    }

    @Override
    public void checkAlreadyAuthenticated() {
        loginRepository.checkAlreadyAuthenticated();
    }

    @Override
    public void SignUp(final String email, final String password) {
        loginRepository.signUp(email, password);
    }

    @Override
    public void SignIn(String email, String password) {

        loginRepository.signIn(email, password);
    }
}

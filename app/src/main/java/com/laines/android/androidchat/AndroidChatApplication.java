package com.laines.android.androidchat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;
import com.laines.android.androidchat.lib.GlideImageLoader;
import com.laines.android.androidchat.lib.ImageLoader;

/**
 * Created by alaines on 8/09/2016.
 */
public class AndroidChatApplication extends Application {
    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    private void setupFirebase(){
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
